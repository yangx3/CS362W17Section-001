package com.tris;


public class Input {

    static int getInt(int min, int max) {
        int num = 0;
        do {
            num = Randomness.nextRandomInt(max+1);
            if (num < min || num > max)
                System.out.println("Please enter an integer between " + min + " and " + max + ".");
        }
        while (num < min || num > max);
        return num;
    }
}
