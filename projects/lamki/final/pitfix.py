import sys, os
#Taken from https://stackoverflow.com/questions/4128144/replace-string-within-file-contents
def inplace_change(filename, old_string, new_string):
    with open(filename) as f:
        s = f.read()
        if old_string not in s:
            return

    with open(filename, 'w') as f:
        s = s.replace(old_string, new_string)
        print("Fixed " + filename);
        f.write(s)

def main():
	path = "evosuite-tests/dominion";
	a = "@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)"
	b = "@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)"
	for file in os.listdir(path):
		if file.endswith("_ESTest.java"):
			fp = os.path.join("evosuite-tests/dominion", file)
			inplace_change(fp, a, b)

# This file fixes all evosuite tests so that PiTest can run them
main();
