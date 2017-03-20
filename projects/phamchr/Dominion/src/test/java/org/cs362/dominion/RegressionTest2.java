package org.cs362.dominion;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }

    java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>> linkedlist_set_type0 = new java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>>();
    java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>> linkedlist_set_type2 = new java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable3 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>();
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card6 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card7 = arraylist_abstractcollection_card6.spliterator();
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.Card.CardName cardName12 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i13 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card10, cardName12);
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    boolean b15 = arraylist_card10.contains((java.lang.Object)list_card14);
    arraylist_abstractcollection_card6.add((int)(short)0, (java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.Card.CardName cardName20 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i21 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card18, cardName20);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i26 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    int i30 = arraylist_card28.size();
    java.util.RandomAccess[] randomAccess_array31 = new java.util.RandomAccess[] { arraylist_card23, arraylist_card28 };
    java.util.RandomAccess[] randomAccess_array32 = arraylist_card18.toArray(randomAccess_array31);
    org.cs362.dominion.Card.CardName cardName33 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card34 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card18, cardName33);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str36 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b38 = hashmap_serializable_str36.equals((java.lang.Object)1.0d);
    int i39 = hashmap_serializable_str36.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str40 = hashmap_serializable_str36.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str42 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b44 = hashmap_serializable_str42.equals((java.lang.Object)1.0d);
    hashmap_serializable_str36.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str42);
    java.util.HashMap[] hashMap_array47 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array48 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array47;
    hashmap_serializable_str_array48[0] = hashmap_serializable_str42;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array51 = arraylist_card18.toArray(hashmap_serializable_str_array48);
    boolean b52 = hashmap_type_cloneable3.replace(type4, (java.lang.Cloneable)arraylist_card10, (java.lang.Cloneable)hashmap_serializable_str_array51);
    java.util.Set<org.cs362.dominion.Card.Type> set_type53 = hashmap_type_cloneable3.keySet();
    boolean b54 = linkedlist_set_type2.offer(set_type53);
    boolean b55 = linkedlist_set_type0.addAll(0, (java.util.Collection<java.util.Set<org.cs362.dominion.Card.Type>>)linkedlist_set_type2);
    java.util.Set<org.cs362.dominion.Card.Type> set_type56 = linkedlist_set_type0.getFirst();
    java.lang.Object obj57 = null;
    int i58 = linkedlist_set_type0.lastIndexOf(obj57);
    java.lang.Object obj59 = linkedlist_set_type0.clone();
    java.util.Set<org.cs362.dominion.Card.Type> set_type60 = linkedlist_set_type0.removeLast();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<org.cs362.dominion.Card.Type> set_type61 = linkedlist_set_type0.getFirst();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type4.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName20.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName33.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type60);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }

    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable1 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array2 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card3 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card3, card_array2);
    org.cs362.dominion.Card.CardName cardName5 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i6 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card3, cardName5);
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i11 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName10);
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    int i15 = arraylist_card13.size();
    java.util.RandomAccess[] randomAccess_array16 = new java.util.RandomAccess[] { arraylist_card8, arraylist_card13 };
    java.util.RandomAccess[] randomAccess_array17 = arraylist_card3.toArray(randomAccess_array16);
    org.cs362.dominion.Card.CardName cardName18 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card19 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card3, cardName18);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str21 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b23 = hashmap_serializable_str21.equals((java.lang.Object)1.0d);
    int i24 = hashmap_serializable_str21.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str25 = hashmap_serializable_str21.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str27 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b29 = hashmap_serializable_str27.equals((java.lang.Object)1.0d);
    hashmap_serializable_str21.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str27);
    java.util.HashMap[] hashMap_array32 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array33 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array32;
    hashmap_serializable_str_array33[0] = hashmap_serializable_str27;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array36 = arraylist_card3.toArray(hashmap_serializable_str_array33);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card37 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b38 = arraylist_abstractcollection_card37.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card3);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card39 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card37);
    java.lang.Object[] obj_array40 = linkedlist_abstractcollection_card39.toArray();
    boolean b41 = hashmap_type_cloneable1.containsKey((java.lang.Object)linkedlist_abstractcollection_card39);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card42 = linkedlist_abstractcollection_card39.pollLast();
    // The following exception was thrown during execution in test generation
    try {
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card43 = linkedlist_abstractcollection_card39.removeLast();
      org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName5.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array17);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName18.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card42);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }

    java.util.LinkedList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>> linkedlist_list_entry_player_i0 = new java.util.LinkedList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>();
    java.util.ArrayList<java.util.AbstractList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>> arraylist_abstractlist_list_entry_player_i1 = new java.util.ArrayList<java.util.AbstractList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>>();
    boolean b2 = arraylist_abstractlist_list_entry_player_i1.add((java.util.AbstractList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>)linkedlist_list_entry_player_i0);
    java.lang.Object obj3 = arraylist_abstractlist_list_entry_player_i1.clone();
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card4 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>();
    org.cs362.dominion.Card.CardName cardName5 = org.cs362.dominion.Card.CardName.Village;
    java.util.Spliterator<org.cs362.dominion.Card> spliterator_card6 = hashmap_iterable_entry_serializable_str_spliterator_card4.remove((java.lang.Object)cardName5);
    java.lang.String[] str_array12 = new java.lang.String[] { "{}", "", "[]", "{}", "" };
    java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str13, str_array12);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card16 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str18 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b20 = hashmap_serializable_str18.equals((java.lang.Object)1.0d);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str21 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str18);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str23 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b25 = hashmap_serializable_str23.equals((java.lang.Object)1.0d);
    int i26 = hashmap_serializable_str23.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str27 = hashmap_serializable_str23.entrySet();
    boolean b28 = hashmap_serializable_str21.equals((java.lang.Object)set_entry_serializable_str27);
    boolean b29 = arraylist_abstractcollection_card16.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str27);
    java.lang.Object[] obj_array30 = arraylist_abstractcollection_card16.toArray();
    boolean b31 = arraylist_abstractcollection_card16.isEmpty();
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    org.cs362.dominion.Card card35 = null;
    boolean b36 = arraylist_card33.add(card35);
    boolean b37 = arraylist_abstractcollection_card16.removeAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33);
    java.util.Iterator<java.util.AbstractCollection<org.cs362.dominion.Card>> iterator_abstractcollection_card38 = arraylist_abstractcollection_card16.iterator();
    boolean b39 = arraylist_str13.remove((java.lang.Object)arraylist_abstractcollection_card16);
    boolean b40 = hashmap_iterable_entry_serializable_str_spliterator_card4.containsValue((java.lang.Object)b39);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str47 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b48 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b49 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"");
    boolean b50 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"");
    boolean b51 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"[]");
    boolean b52 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b53 = arraylist_comparable_str47.add((java.lang.Comparable<java.lang.String>)"{}");
    java.lang.Comparable<java.lang.String> comparable_str54 = org.cs362.dominion.Randomness.randomMember((java.util.List<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str47);
    java.util.Spliterator<org.cs362.dominion.Card> spliterator_card55 = hashmap_iterable_entry_serializable_str_spliterator_card4.get((java.lang.Object)arraylist_comparable_str47);
    int i56 = arraylist_abstractlist_list_entry_player_i1.lastIndexOf((java.lang.Object)spliterator_card55);
    java.util.ArrayList[] arrayList_array58 = new java.util.ArrayList[ 0 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>[] arraylist_collection_entry_serializable_str_array59 = (java.util.ArrayList<java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>[])arrayList_array58;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ArrayList<java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>[] arraylist_collection_entry_serializable_str_array60 = arraylist_abstractlist_list_entry_player_i1.toArray(arraylist_collection_entry_serializable_str_array59);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + org.cs362.dominion.Card.CardName.Village + "'", cardName5.equals(org.cs362.dominion.Card.CardName.Village));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spliterator_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_abstractcollection_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + comparable_str54 + "' != '" + "hi!"+ "'", comparable_str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spliterator_card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_collection_entry_serializable_str_array59);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }

    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card1 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card3 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> linkedlist_arraylist_iterable_card4 = new java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>>();
    boolean b5 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card1);
    boolean b6 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card3);
    java.util.Iterator<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> iterator_arraylist_iterable_card7 = linkedlist_arraylist_iterable_card4.descendingIterator();
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card9 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ListIterator<java.lang.Iterable<org.cs362.dominion.Card>> listiterator_iterable_card10 = arraylist_iterable_card9.listIterator();
    boolean b11 = linkedlist_arraylist_iterable_card4.offer(arraylist_iterable_card9);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable13 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i18 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    org.cs362.dominion.Card.CardName cardName22 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i23 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card20, cardName22);
    org.cs362.dominion.Card[] card_array24 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card25, card_array24);
    int i27 = arraylist_card25.size();
    java.util.RandomAccess[] randomAccess_array28 = new java.util.RandomAccess[] { arraylist_card20, arraylist_card25 };
    java.util.RandomAccess[] randomAccess_array29 = arraylist_card15.toArray(randomAccess_array28);
    org.cs362.dominion.Card.CardName cardName30 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card31 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName30);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str33 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b35 = hashmap_serializable_str33.equals((java.lang.Object)1.0d);
    int i36 = hashmap_serializable_str33.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str37 = hashmap_serializable_str33.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str39 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b41 = hashmap_serializable_str39.equals((java.lang.Object)1.0d);
    hashmap_serializable_str33.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str39);
    java.util.HashMap[] hashMap_array44 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array45 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array44;
    hashmap_serializable_str_array45[0] = hashmap_serializable_str39;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array48 = arraylist_card15.toArray(hashmap_serializable_str_array45);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card49 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b50 = arraylist_abstractcollection_card49.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card15);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card51 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card49);
    java.lang.Object[] obj_array52 = linkedlist_abstractcollection_card51.toArray();
    boolean b53 = hashmap_type_cloneable13.containsKey((java.lang.Object)linkedlist_abstractcollection_card51);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card54 = linkedlist_abstractcollection_card51.pollLast();
    org.cs362.dominion.Card[] card_array55 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card56 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card56, card_array55);
    org.cs362.dominion.Card.CardName cardName58 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i59 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card56, cardName58);
    org.cs362.dominion.Card[] card_array60 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card61 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card61, card_array60);
    org.cs362.dominion.Card.CardName cardName63 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i64 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card61, cardName63);
    org.cs362.dominion.Card[] card_array65 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card66 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card66, card_array65);
    int i68 = arraylist_card66.size();
    java.util.RandomAccess[] randomAccess_array69 = new java.util.RandomAccess[] { arraylist_card61, arraylist_card66 };
    java.util.RandomAccess[] randomAccess_array70 = arraylist_card56.toArray(randomAccess_array69);
    org.cs362.dominion.Card.CardName cardName71 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card72 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card56, cardName71);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str74 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b76 = hashmap_serializable_str74.equals((java.lang.Object)1.0d);
    int i77 = hashmap_serializable_str74.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str78 = hashmap_serializable_str74.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str80 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b82 = hashmap_serializable_str80.equals((java.lang.Object)1.0d);
    hashmap_serializable_str74.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str80);
    java.util.HashMap[] hashMap_array85 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array86 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array85;
    hashmap_serializable_str_array86[0] = hashmap_serializable_str80;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array89 = arraylist_card56.toArray(hashmap_serializable_str_array86);
    java.util.Map<java.io.Serializable,java.lang.String>[] map_serializable_str_array90 = linkedlist_abstractcollection_card51.toArray((java.util.Map<java.io.Serializable,java.lang.String>[])hashmap_serializable_str_array86);
    int i91 = linkedlist_arraylist_iterable_card4.lastIndexOf((java.lang.Object)map_serializable_str_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_arraylist_iterable_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName22.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName30.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    org.junit.Assert.assertTrue("'" + cardName58 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName58.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    org.junit.Assert.assertTrue("'" + cardName63 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName63.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array70);
    org.junit.Assert.assertTrue("'" + cardName71 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName71.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_serializable_str_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }

    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card0 = new java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>();
    java.util.LinkedList<java.lang.Object> linkedlist_obj1 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card2 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b3 = linkedlist_obj1.offerLast((java.lang.Object)arraylist_card2);
    java.lang.Object obj4 = linkedlist_obj1.removeLast();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable6 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i11 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName10);
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i16 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card13, cardName15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    int i20 = arraylist_card18.size();
    java.util.RandomAccess[] randomAccess_array21 = new java.util.RandomAccess[] { arraylist_card13, arraylist_card18 };
    java.util.RandomAccess[] randomAccess_array22 = arraylist_card8.toArray(randomAccess_array21);
    org.cs362.dominion.Card.CardName cardName23 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card24 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName23);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str26 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b28 = hashmap_serializable_str26.equals((java.lang.Object)1.0d);
    int i29 = hashmap_serializable_str26.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str30 = hashmap_serializable_str26.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str32 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b34 = hashmap_serializable_str32.equals((java.lang.Object)1.0d);
    hashmap_serializable_str26.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str32);
    java.util.HashMap[] hashMap_array37 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array38 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array37;
    hashmap_serializable_str_array38[0] = hashmap_serializable_str32;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array41 = arraylist_card8.toArray(hashmap_serializable_str_array38);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card42 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b43 = arraylist_abstractcollection_card42.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card8);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card44 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card42);
    java.lang.Object[] obj_array45 = linkedlist_abstractcollection_card44.toArray();
    boolean b46 = hashmap_type_cloneable6.containsKey((java.lang.Object)linkedlist_abstractcollection_card44);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card47 = linkedlist_abstractcollection_card44.pollLast();
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    org.cs362.dominion.Card.CardName cardName51 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i52 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card49, cardName51);
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    org.cs362.dominion.Card.CardName cardName56 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i57 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card54, cardName56);
    org.cs362.dominion.Card[] card_array58 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card59, card_array58);
    int i61 = arraylist_card59.size();
    java.util.RandomAccess[] randomAccess_array62 = new java.util.RandomAccess[] { arraylist_card54, arraylist_card59 };
    java.util.RandomAccess[] randomAccess_array63 = arraylist_card49.toArray(randomAccess_array62);
    org.cs362.dominion.Card.CardName cardName64 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card65 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card49, cardName64);
    boolean b66 = linkedlist_abstractcollection_card44.removeLastOccurrence((java.lang.Object)cardName64);
    java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>> listiterator_abstractcollection_card67 = linkedlist_abstractcollection_card44.listIterator();
    boolean b68 = linkedlist_obj1.add((java.lang.Object)linkedlist_abstractcollection_card44);
    java.lang.Object obj69 = linkedlist_obj1.getFirst();
    int i70 = arraylist_iterable_abstractcollection_card0.lastIndexOf((java.lang.Object)linkedlist_obj1);
    // The following exception was thrown during execution in test generation
    try {
    java.util.ListIterator<java.lang.Object> listiterator_obj72 = linkedlist_obj1.listIterator(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array22);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName23.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    org.junit.Assert.assertTrue("'" + cardName51 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName51.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    org.junit.Assert.assertTrue("'" + cardName56 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName56.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array63);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName64.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_abstractcollection_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName16);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str19 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b21 = hashmap_serializable_str19.equals((java.lang.Object)1.0d);
    int i22 = hashmap_serializable_str19.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str23 = hashmap_serializable_str19.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str25 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b27 = hashmap_serializable_str25.equals((java.lang.Object)1.0d);
    hashmap_serializable_str19.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str25);
    java.util.HashMap[] hashMap_array30 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array31 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array30;
    hashmap_serializable_str_array31[0] = hashmap_serializable_str25;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array34 = arraylist_card1.toArray(hashmap_serializable_str_array31);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card35 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b36 = arraylist_abstractcollection_card35.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card1);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card37 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card35);
    java.lang.Object[] obj_array38 = linkedlist_abstractcollection_card37.toArray();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i43 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName42);
    org.cs362.dominion.Card[] card_array44 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card45, card_array44);
    org.cs362.dominion.Card.CardName cardName47 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i48 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card45, cardName47);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    int i52 = arraylist_card50.size();
    java.util.RandomAccess[] randomAccess_array53 = new java.util.RandomAccess[] { arraylist_card45, arraylist_card50 };
    java.util.RandomAccess[] randomAccess_array54 = arraylist_card40.toArray(randomAccess_array53);
    org.cs362.dominion.Card.CardName cardName55 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card56 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName55);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str58 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b60 = hashmap_serializable_str58.equals((java.lang.Object)1.0d);
    int i61 = hashmap_serializable_str58.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str62 = hashmap_serializable_str58.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str64 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b66 = hashmap_serializable_str64.equals((java.lang.Object)1.0d);
    hashmap_serializable_str58.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str64);
    java.util.HashMap[] hashMap_array69 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array70 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array69;
    hashmap_serializable_str_array70[0] = hashmap_serializable_str64;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array73 = arraylist_card40.toArray(hashmap_serializable_str_array70);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card74 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b75 = arraylist_abstractcollection_card74.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card40);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card76 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card74);
    java.lang.Object[] obj_array77 = linkedlist_abstractcollection_card76.toArray();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card78 = linkedlist_abstractcollection_card76.getLast();
    linkedlist_abstractcollection_card37.addFirst(abstractcollection_card78);
    org.cs362.dominion.Card[] card_array80 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card81 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81, card_array80);
    org.cs362.dominion.Card.CardName cardName83 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i84 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card81, cardName83);
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.createCards();
    boolean b86 = arraylist_card81.contains((java.lang.Object)list_card85);
    int i88 = arraylist_card81.indexOf((java.lang.Object)(byte)10);
    boolean b89 = abstractcollection_card78.containsAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81);
    org.cs362.dominion.GameState gameState90 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card81);
    java.util.List<org.cs362.dominion.Card> list_card91 = gameState90.cards;
    gameState90.initializeGame();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i93 = null;
    gameState90.gameBoard = hashmap_card_i93;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i95 = gameState90.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card96 = gameState90.embargo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName42.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName47.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName55.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName83.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_card96);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }

    java.util.LinkedList<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>> linkedlist_arraylist_arraylist_comparable_str0 = new java.util.LinkedList<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable2 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>((int)(short)10);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable3 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable5 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.lang.String str6 = hashmap_type_cloneable5.toString();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable8 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>((int)(byte)100);
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.Card.CardName cardName12 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i13 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card10, cardName12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i18 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    int i22 = arraylist_card20.size();
    java.util.RandomAccess[] randomAccess_array23 = new java.util.RandomAccess[] { arraylist_card15, arraylist_card20 };
    java.util.RandomAccess[] randomAccess_array24 = arraylist_card10.toArray(randomAccess_array23);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card26 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card10, cardName25);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str28 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b30 = hashmap_serializable_str28.equals((java.lang.Object)1.0d);
    int i31 = hashmap_serializable_str28.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str32 = hashmap_serializable_str28.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str34 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b36 = hashmap_serializable_str34.equals((java.lang.Object)1.0d);
    hashmap_serializable_str28.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str34);
    java.util.HashMap[] hashMap_array39 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array40 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array39;
    hashmap_serializable_str_array40[0] = hashmap_serializable_str34;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array43 = arraylist_card10.toArray(hashmap_serializable_str_array40);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card44 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b45 = arraylist_abstractcollection_card44.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card10);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card46 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card44);
    java.lang.Object[] obj_array47 = linkedlist_abstractcollection_card46.toArray();
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card48 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)linkedlist_abstractcollection_card46);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card49 = linkedlist_abstractcollection_card48.remove();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card50 = linkedlist_abstractcollection_card48.peekFirst();
    java.lang.Cloneable cloneable51 = hashmap_type_cloneable8.get((java.lang.Object)abstractcollection_card50);
    java.util.AbstractMap[] abstractMap_array53 = new java.util.AbstractMap[ 4 ];
    @SuppressWarnings("unchecked")
    java.util.AbstractMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>[] abstractmap_type_cloneable_array54 = (java.util.AbstractMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>[])abstractMap_array53;
    abstractmap_type_cloneable_array54[0] = hashmap_type_cloneable2;
    abstractmap_type_cloneable_array54[1] = hashmap_type_cloneable3;
    abstractmap_type_cloneable_array54[2] = hashmap_type_cloneable5;
    abstractmap_type_cloneable_array54[3] = hashmap_type_cloneable8;
    java.util.AbstractMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>[] abstractmap_type_cloneable_array63 = linkedlist_arraylist_arraylist_comparable_str0.toArray(abstractmap_type_cloneable_array54);
    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str64 = new java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>();
    boolean b65 = linkedlist_arraylist_arraylist_comparable_str0.offerFirst(arraylist_arraylist_comparable_str64);
    java.util.LinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> linkedlist_list_comparable_str66 = new java.util.LinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>((java.util.Collection<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>)arraylist_arraylist_comparable_str64);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str67 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b68 = linkedlist_list_comparable_str66.offerFirst((java.util.List<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array24);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractcollection_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractMap_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractmap_type_cloneable_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractmap_type_cloneable_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName16);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str19 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b21 = hashmap_serializable_str19.equals((java.lang.Object)1.0d);
    int i22 = hashmap_serializable_str19.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str23 = hashmap_serializable_str19.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str25 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b27 = hashmap_serializable_str25.equals((java.lang.Object)1.0d);
    hashmap_serializable_str19.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str25);
    java.util.HashMap[] hashMap_array30 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array31 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array30;
    hashmap_serializable_str_array31[0] = hashmap_serializable_str25;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array34 = arraylist_card1.toArray(hashmap_serializable_str_array31);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card35 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b36 = arraylist_abstractcollection_card35.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card1);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card37 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card35);
    java.lang.Object[] obj_array38 = linkedlist_abstractcollection_card37.toArray();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i43 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName42);
    org.cs362.dominion.Card[] card_array44 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card45, card_array44);
    org.cs362.dominion.Card.CardName cardName47 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i48 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card45, cardName47);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    int i52 = arraylist_card50.size();
    java.util.RandomAccess[] randomAccess_array53 = new java.util.RandomAccess[] { arraylist_card45, arraylist_card50 };
    java.util.RandomAccess[] randomAccess_array54 = arraylist_card40.toArray(randomAccess_array53);
    org.cs362.dominion.Card.CardName cardName55 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card56 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName55);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str58 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b60 = hashmap_serializable_str58.equals((java.lang.Object)1.0d);
    int i61 = hashmap_serializable_str58.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str62 = hashmap_serializable_str58.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str64 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b66 = hashmap_serializable_str64.equals((java.lang.Object)1.0d);
    hashmap_serializable_str58.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str64);
    java.util.HashMap[] hashMap_array69 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array70 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array69;
    hashmap_serializable_str_array70[0] = hashmap_serializable_str64;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array73 = arraylist_card40.toArray(hashmap_serializable_str_array70);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card74 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b75 = arraylist_abstractcollection_card74.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card40);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card76 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card74);
    java.lang.Object[] obj_array77 = linkedlist_abstractcollection_card76.toArray();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card78 = linkedlist_abstractcollection_card76.getLast();
    linkedlist_abstractcollection_card37.addFirst(abstractcollection_card78);
    org.cs362.dominion.Card[] card_array80 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card81 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81, card_array80);
    org.cs362.dominion.Card.CardName cardName83 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i84 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card81, cardName83);
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.createCards();
    boolean b86 = arraylist_card81.contains((java.lang.Object)list_card85);
    int i88 = arraylist_card81.indexOf((java.lang.Object)(byte)10);
    boolean b89 = abstractcollection_card78.containsAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81);
    org.cs362.dominion.GameState gameState90 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card81);
    java.util.List<org.cs362.dominion.Player> list_player91 = gameState90.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i92 = gameState90.play();
    gameState90.initializeGame();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i94 = gameState90.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName42.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName47.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName55.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName83.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i94);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }

    java.util.ArrayList<java.util.AbstractList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>> arraylist_abstractlist_arraylist_comparable_str1 = new java.util.ArrayList<java.util.AbstractList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>((int)(byte)100);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str4 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b5 = arraylist_comparable_str4.add((java.lang.Comparable<java.lang.String>)"{}");
    boolean b6 = arraylist_comparable_str4.add((java.lang.Comparable<java.lang.String>)"");
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str10 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b11 = arraylist_comparable_str10.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b12 = arraylist_comparable_str10.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b13 = arraylist_comparable_str10.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b14 = arraylist_comparable_str4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str10);
    boolean b16 = arraylist_comparable_str10.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str17 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    int i18 = arraylist_entry_serializable_str17.size();
    int i19 = arraylist_entry_serializable_str17.size();
    boolean b20 = arraylist_comparable_str10.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)arraylist_entry_serializable_str17);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str23 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b24 = arraylist_comparable_str23.add((java.lang.Comparable<java.lang.String>)"{}");
    boolean b25 = arraylist_comparable_str23.add((java.lang.Comparable<java.lang.String>)"");
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str29 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b30 = arraylist_comparable_str29.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b31 = arraylist_comparable_str29.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b32 = arraylist_comparable_str29.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b33 = arraylist_comparable_str23.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str29);
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str36 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b37 = arraylist_comparable_str36.add((java.lang.Comparable<java.lang.String>)"{}");
    boolean b38 = arraylist_comparable_str36.add((java.lang.Comparable<java.lang.String>)"");
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str42 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b43 = arraylist_comparable_str42.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b44 = arraylist_comparable_str42.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b45 = arraylist_comparable_str42.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b46 = arraylist_comparable_str36.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str42);
    boolean b48 = arraylist_comparable_str42.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str51 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b52 = arraylist_comparable_str51.add((java.lang.Comparable<java.lang.String>)"{}");
    boolean b53 = arraylist_comparable_str51.add((java.lang.Comparable<java.lang.String>)"");
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str57 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b58 = arraylist_comparable_str57.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b59 = arraylist_comparable_str57.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b60 = arraylist_comparable_str57.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    boolean b61 = arraylist_comparable_str51.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str57);
    boolean b63 = arraylist_comparable_str57.add((java.lang.Comparable<java.lang.String>)" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str64 = new java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>();
    boolean b65 = arraylist_arraylist_comparable_str64.add(arraylist_comparable_str10);
    boolean b66 = arraylist_arraylist_comparable_str64.add(arraylist_comparable_str29);
    boolean b67 = arraylist_arraylist_comparable_str64.add(arraylist_comparable_str42);
    boolean b68 = arraylist_arraylist_comparable_str64.add(arraylist_comparable_str57);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card70 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str72 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b74 = hashmap_serializable_str72.equals((java.lang.Object)1.0d);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str75 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str72);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str77 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b79 = hashmap_serializable_str77.equals((java.lang.Object)1.0d);
    int i80 = hashmap_serializable_str77.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str81 = hashmap_serializable_str77.entrySet();
    boolean b82 = hashmap_serializable_str75.equals((java.lang.Object)set_entry_serializable_str81);
    boolean b83 = arraylist_abstractcollection_card70.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str81);
    java.lang.Object[] obj_array84 = arraylist_abstractcollection_card70.toArray();
    boolean b85 = arraylist_abstractcollection_card70.isEmpty();
    java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>> listiterator_abstractcollection_card86 = arraylist_abstractcollection_card70.listIterator();
    boolean b87 = arraylist_arraylist_comparable_str64.equals((java.lang.Object)listiterator_abstractcollection_card86);
    boolean b88 = arraylist_abstractlist_arraylist_comparable_str1.add((java.util.AbstractList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>)arraylist_arraylist_comparable_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_abstractcollection_card86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }

    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card1 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card2 = arraylist_abstractcollection_card1.spliterator();
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    org.cs362.dominion.Card.CardName cardName7 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i8 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card5, cardName7);
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    boolean b10 = arraylist_card5.contains((java.lang.Object)list_card9);
    arraylist_abstractcollection_card1.add((int)(short)0, (java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card5);
    arraylist_abstractcollection_card1.clear();
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    int i16 = arraylist_card14.size();
    boolean b17 = arraylist_abstractcollection_card1.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card14);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card19 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    org.cs362.dominion.Randomness randomness20 = new org.cs362.dominion.Randomness();
    int i21 = randomness20.main();
    int i22 = arraylist_abstractcollection_card19.lastIndexOf((java.lang.Object)i21);
    java.util.stream.Stream<java.util.AbstractCollection<org.cs362.dominion.Card>> stream_abstractcollection_card23 = arraylist_abstractcollection_card19.stream();
    int i24 = arraylist_card14.indexOf((java.lang.Object)stream_abstractcollection_card23);
    java.util.stream.Stream<org.cs362.dominion.Card> stream_card25 = arraylist_card14.stream();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card14);
    java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type> hashmap_randomness_type27 = new java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type>();
    org.cs362.dominion.GameState gameState28 = null;
    org.cs362.dominion.Player player30 = new org.cs362.dominion.Player(gameState28, "hi!");
    player30.playTreasureCard();
    org.cs362.dominion.Card card32 = null;
    player30.discard(card32);
    org.cs362.dominion.Card card34 = null;
    player30.discard(card34);
    player30.buyCard();
    boolean b37 = hashmap_randomness_type27.containsValue((java.lang.Object)player30);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable39 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable40 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>();
    org.cs362.dominion.Card.Type type41 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card43 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card44 = arraylist_abstractcollection_card43.spliterator();
    org.cs362.dominion.Card[] card_array46 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card47 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card47, card_array46);
    org.cs362.dominion.Card.CardName cardName49 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i50 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card47, cardName49);
    java.util.List<org.cs362.dominion.Card> list_card51 = org.cs362.dominion.Card.createCards();
    boolean b52 = arraylist_card47.contains((java.lang.Object)list_card51);
    arraylist_abstractcollection_card43.add((int)(short)0, (java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card47);
    org.cs362.dominion.Card[] card_array54 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card55 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card55, card_array54);
    org.cs362.dominion.Card.CardName cardName57 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i58 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card55, cardName57);
    org.cs362.dominion.Card[] card_array59 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card60 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card60, card_array59);
    org.cs362.dominion.Card.CardName cardName62 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i63 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card60, cardName62);
    org.cs362.dominion.Card[] card_array64 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card65, card_array64);
    int i67 = arraylist_card65.size();
    java.util.RandomAccess[] randomAccess_array68 = new java.util.RandomAccess[] { arraylist_card60, arraylist_card65 };
    java.util.RandomAccess[] randomAccess_array69 = arraylist_card55.toArray(randomAccess_array68);
    org.cs362.dominion.Card.CardName cardName70 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card71 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card55, cardName70);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str73 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b75 = hashmap_serializable_str73.equals((java.lang.Object)1.0d);
    int i76 = hashmap_serializable_str73.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str77 = hashmap_serializable_str73.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str79 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b81 = hashmap_serializable_str79.equals((java.lang.Object)1.0d);
    hashmap_serializable_str73.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str79);
    java.util.HashMap[] hashMap_array84 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array85 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array84;
    hashmap_serializable_str_array85[0] = hashmap_serializable_str79;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array88 = arraylist_card55.toArray(hashmap_serializable_str_array85);
    boolean b89 = hashmap_type_cloneable40.replace(type41, (java.lang.Cloneable)arraylist_card47, (java.lang.Cloneable)hashmap_serializable_str_array88);
    org.cs362.dominion.Card.Type type90 = hashmap_randomness_type27.getOrDefault((java.lang.Object)10, type41);
    java.util.List<org.cs362.dominion.Card> list_card91 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card14, type41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_abstractcollection_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type41.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    org.junit.Assert.assertTrue("'" + cardName49 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName49.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName57.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    org.junit.Assert.assertTrue("'" + cardName62 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName62.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array69);
    org.junit.Assert.assertTrue("'" + cardName70 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName70.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    org.junit.Assert.assertTrue("'" + type90 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type90.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }

    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card2 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card3 = hashmap_iterable_entry_serializable_str_spliterator_card2.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card4 = collection_spliterator_card3.stream();
    java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>> linkedlist_stream_spliterator_card5 = new java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>>();
    boolean b6 = linkedlist_stream_spliterator_card5.add(stream_spliterator_card4);
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card9 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card10 = hashmap_iterable_entry_serializable_str_spliterator_card9.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card11 = collection_spliterator_card10.stream();
    linkedlist_stream_spliterator_card5.addFirst(stream_spliterator_card11);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card13 = linkedlist_stream_spliterator_card5.removeLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card14 = linkedlist_stream_spliterator_card5.getLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card15 = linkedlist_stream_spliterator_card5.peekFirst();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable17 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    org.cs362.dominion.Card.CardName cardName21 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i22 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card19, cardName21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    org.cs362.dominion.Card.CardName cardName26 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i27 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card24, cardName26);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    int i31 = arraylist_card29.size();
    java.util.RandomAccess[] randomAccess_array32 = new java.util.RandomAccess[] { arraylist_card24, arraylist_card29 };
    java.util.RandomAccess[] randomAccess_array33 = arraylist_card19.toArray(randomAccess_array32);
    org.cs362.dominion.Card.CardName cardName34 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card35 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card19, cardName34);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str37 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b39 = hashmap_serializable_str37.equals((java.lang.Object)1.0d);
    int i40 = hashmap_serializable_str37.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str41 = hashmap_serializable_str37.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str43 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b45 = hashmap_serializable_str43.equals((java.lang.Object)1.0d);
    hashmap_serializable_str37.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str43);
    java.util.HashMap[] hashMap_array48 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array49 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array48;
    hashmap_serializable_str_array49[0] = hashmap_serializable_str43;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array52 = arraylist_card19.toArray(hashmap_serializable_str_array49);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card53 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b54 = arraylist_abstractcollection_card53.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card19);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card55 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card53);
    java.lang.Object[] obj_array56 = linkedlist_abstractcollection_card55.toArray();
    boolean b57 = hashmap_type_cloneable17.containsKey((java.lang.Object)linkedlist_abstractcollection_card55);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card58 = linkedlist_abstractcollection_card55.pollLast();
    org.cs362.dominion.Card[] card_array59 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card60 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card60, card_array59);
    org.cs362.dominion.Card card62 = null;
    boolean b63 = arraylist_card60.add(card62);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str65 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b67 = hashmap_serializable_str65.equals((java.lang.Object)1.0d);
    int i68 = hashmap_serializable_str65.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str69 = hashmap_serializable_str65.entrySet();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str70 = hashmap_serializable_str65.entrySet();
    boolean b71 = arraylist_card60.containsAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str70);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str73 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b75 = hashmap_serializable_str73.equals((java.lang.Object)1.0d);
    int i76 = hashmap_serializable_str73.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str77 = hashmap_serializable_str73.entrySet();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str78 = hashmap_serializable_str73.entrySet();
    java.util.ArrayList<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> arraylist_iterable_entry_serializable_str79 = new java.util.ArrayList<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b80 = arraylist_iterable_entry_serializable_str79.add((java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str70);
    boolean b81 = arraylist_iterable_entry_serializable_str79.add((java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str78);
    boolean b82 = linkedlist_abstractcollection_card55.retainAll((java.util.Collection<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)arraylist_iterable_entry_serializable_str79);
    boolean b83 = linkedlist_stream_spliterator_card5.remove((java.lang.Object)arraylist_iterable_entry_serializable_str79);
    boolean b84 = arraylist_iterable_entry_serializable_str79.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName21.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName26.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName34.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }

    java.util.ArrayList<java.util.AbstractList<java.lang.Object>> arraylist_abstractlist_obj1 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>((int)'4');
    java.util.LinkedList<java.lang.Object> linkedlist_obj2 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card3 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b4 = linkedlist_obj2.offerLast((java.lang.Object)arraylist_card3);
    java.lang.Object obj5 = linkedlist_obj2.removeLast();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable7 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    org.cs362.dominion.Card.CardName cardName11 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i12 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName11);
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i17 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card14, cardName16);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    int i21 = arraylist_card19.size();
    java.util.RandomAccess[] randomAccess_array22 = new java.util.RandomAccess[] { arraylist_card14, arraylist_card19 };
    java.util.RandomAccess[] randomAccess_array23 = arraylist_card9.toArray(randomAccess_array22);
    org.cs362.dominion.Card.CardName cardName24 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card25 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card9, cardName24);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str27 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b29 = hashmap_serializable_str27.equals((java.lang.Object)1.0d);
    int i30 = hashmap_serializable_str27.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str31 = hashmap_serializable_str27.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str33 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b35 = hashmap_serializable_str33.equals((java.lang.Object)1.0d);
    hashmap_serializable_str27.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str33);
    java.util.HashMap[] hashMap_array38 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array39 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array38;
    hashmap_serializable_str_array39[0] = hashmap_serializable_str33;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array42 = arraylist_card9.toArray(hashmap_serializable_str_array39);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card43 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b44 = arraylist_abstractcollection_card43.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card9);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card45 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card43);
    java.lang.Object[] obj_array46 = linkedlist_abstractcollection_card45.toArray();
    boolean b47 = hashmap_type_cloneable7.containsKey((java.lang.Object)linkedlist_abstractcollection_card45);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card48 = linkedlist_abstractcollection_card45.pollLast();
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    org.cs362.dominion.Card.CardName cardName52 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i53 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card50, cardName52);
    org.cs362.dominion.Card[] card_array54 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card55 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card55, card_array54);
    org.cs362.dominion.Card.CardName cardName57 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i58 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card55, cardName57);
    org.cs362.dominion.Card[] card_array59 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card60 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card60, card_array59);
    int i62 = arraylist_card60.size();
    java.util.RandomAccess[] randomAccess_array63 = new java.util.RandomAccess[] { arraylist_card55, arraylist_card60 };
    java.util.RandomAccess[] randomAccess_array64 = arraylist_card50.toArray(randomAccess_array63);
    org.cs362.dominion.Card.CardName cardName65 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card66 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card50, cardName65);
    boolean b67 = linkedlist_abstractcollection_card45.removeLastOccurrence((java.lang.Object)cardName65);
    java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>> listiterator_abstractcollection_card68 = linkedlist_abstractcollection_card45.listIterator();
    boolean b69 = linkedlist_obj2.add((java.lang.Object)linkedlist_abstractcollection_card45);
    boolean b70 = arraylist_abstractlist_obj1.add((java.util.AbstractList<java.lang.Object>)linkedlist_obj2);
    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj71 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>((java.util.Collection<java.util.AbstractList<java.lang.Object>>)arraylist_abstractlist_obj1);
    java.util.LinkedList<java.lang.Object> linkedlist_obj72 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card73 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b74 = linkedlist_obj72.offerLast((java.lang.Object)arraylist_card73);
    java.lang.Object obj75 = linkedlist_obj72.removeLast();
    java.lang.Object obj76 = linkedlist_obj72.peekFirst();
    java.lang.Object obj77 = linkedlist_obj72.pollFirst();
    linkedlist_abstractlist_obj71.addFirst((java.util.AbstractList<java.lang.Object>)linkedlist_obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    org.junit.Assert.assertTrue("'" + cardName11 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName11.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array23);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName24.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    org.junit.Assert.assertTrue("'" + cardName52 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName52.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName57.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array64);
    org.junit.Assert.assertTrue("'" + cardName65 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName65.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_abstractcollection_card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj77);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }

    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str6 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b7 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b8 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"");
    boolean b9 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"");
    boolean b10 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"[]");
    boolean b11 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"hi!");
    boolean b12 = arraylist_comparable_str6.add((java.lang.Comparable<java.lang.String>)"{}");
    java.lang.Comparable<java.lang.String> comparable_str13 = org.cs362.dominion.Randomness.randomMember((java.util.List<java.lang.Comparable<java.lang.String>>)arraylist_comparable_str6);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str15 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    int i16 = arraylist_comparable_str6.lastIndexOf((java.lang.Object)'4');
    java.lang.String[] str_array19 = new java.lang.String[] { "[]" };
    java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str20, str_array19);
    java.lang.Object obj22 = arraylist_str20.clone();
    boolean b23 = arraylist_comparable_str6.addAll((int)(byte)0, (java.util.Collection<java.lang.String>)arraylist_str20);
    java.util.ListIterator<java.lang.Comparable<java.lang.String>> listiterator_comparable_str24 = arraylist_comparable_str6.listIterator();
    org.cs362.dominion.Randomness randomness25 = new org.cs362.dominion.Randomness();
    int i26 = randomness25.main();
    org.cs362.dominion.Randomness randomness27 = new org.cs362.dominion.Randomness();
    int i28 = randomness27.main();
    int i29 = randomness27.main();
    int i30 = randomness27.main();
    int i31 = randomness27.main();
    int i32 = randomness27.main();
    org.cs362.dominion.Randomness[] randomness_array33 = new org.cs362.dominion.Randomness[] { randomness25, randomness27 };
    java.util.ArrayList<org.cs362.dominion.Randomness> arraylist_randomness34 = new java.util.ArrayList<org.cs362.dominion.Randomness>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Randomness>)arraylist_randomness34, randomness_array33);
    boolean b36 = arraylist_comparable_str6.retainAll((java.util.Collection<org.cs362.dominion.Randomness>)arraylist_randomness34);
    int i37 = arraylist_randomness34.size();
    java.util.ListIterator<org.cs362.dominion.Randomness> listiterator_randomness38 = arraylist_randomness34.listIterator();
    java.util.HashMap<java.util.Collection<java.lang.Integer>,java.lang.Iterable<java.lang.Comparable<org.cs362.dominion.Card.Type>>> hashmap_collection_i_iterable_comparable_type40 = new java.util.HashMap<java.util.Collection<java.lang.Integer>,java.lang.Iterable<java.lang.Comparable<org.cs362.dominion.Card.Type>>>((int)(byte)100);
    java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type> hashmap_randomness_type41 = new java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type>();
    org.cs362.dominion.Randomness randomness42 = new org.cs362.dominion.Randomness();
    int i43 = randomness42.main();
    int i44 = randomness42.main();
    int i45 = randomness42.main();
    org.cs362.dominion.Card.Type type46 = org.cs362.dominion.Card.Type.TREASURE;
    org.cs362.dominion.Card.Type type47 = hashmap_randomness_type41.put(randomness42, type46);
    boolean b48 = hashmap_collection_i_iterable_comparable_type40.containsValue((java.lang.Object)randomness42);
    int i49 = randomness42.main();
    boolean b50 = arraylist_randomness34.add(randomness42);
    java.util.function.UnaryOperator<org.cs362.dominion.Randomness> unaryoperator_randomness51 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_randomness34.replaceAll(unaryoperator_randomness51);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_comparable_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomness_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_randomness38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type46.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }

    java.util.LinkedList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>> linkedlist_list_entry_player_i0 = new java.util.LinkedList<java.util.List<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>();
    java.lang.Object obj1 = linkedlist_list_entry_player_i0.clone();
    java.lang.Object[] obj_array2 = linkedlist_list_entry_player_i0.toArray();
    java.lang.String[] str_array4 = new java.lang.String[] { "[]" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    java.lang.Object obj7 = arraylist_str5.clone();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable8 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>();
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card11 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card12 = arraylist_abstractcollection_card11.spliterator();
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i18 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    boolean b20 = arraylist_card15.contains((java.lang.Object)list_card19);
    arraylist_abstractcollection_card11.add((int)(short)0, (java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card15);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i26 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    org.cs362.dominion.Card.CardName cardName30 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i31 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card28, cardName30);
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    int i35 = arraylist_card33.size();
    java.util.RandomAccess[] randomAccess_array36 = new java.util.RandomAccess[] { arraylist_card28, arraylist_card33 };
    java.util.RandomAccess[] randomAccess_array37 = arraylist_card23.toArray(randomAccess_array36);
    org.cs362.dominion.Card.CardName cardName38 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card39 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName38);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str41 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b43 = hashmap_serializable_str41.equals((java.lang.Object)1.0d);
    int i44 = hashmap_serializable_str41.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str45 = hashmap_serializable_str41.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str47 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b49 = hashmap_serializable_str47.equals((java.lang.Object)1.0d);
    hashmap_serializable_str41.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str47);
    java.util.HashMap[] hashMap_array52 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array53 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array52;
    hashmap_serializable_str_array53[0] = hashmap_serializable_str47;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array56 = arraylist_card23.toArray(hashmap_serializable_str_array53);
    boolean b57 = hashmap_type_cloneable8.replace(type9, (java.lang.Cloneable)arraylist_card15, (java.lang.Cloneable)hashmap_serializable_str_array56);
    java.util.Set<org.cs362.dominion.Card.Type> set_type58 = hashmap_type_cloneable8.keySet();
    boolean b59 = arraylist_str5.removeAll((java.util.Collection<org.cs362.dominion.Card.Type>)set_type58);
    java.util.ArrayList<java.lang.Comparable<org.cs362.dominion.Card.Type>> arraylist_comparable_type60 = new java.util.ArrayList<java.lang.Comparable<org.cs362.dominion.Card.Type>>((java.util.Collection<org.cs362.dominion.Card.Type>)set_type58);
    arraylist_comparable_type60.ensureCapacity(61);
    java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>> arraylist_entry_player_i63 = new java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>();
    java.lang.Object[] obj_array64 = arraylist_entry_player_i63.toArray();
    boolean b65 = arraylist_comparable_type60.containsAll((java.util.Collection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>)arraylist_entry_player_i63);
    java.util.stream.Stream<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>> stream_entry_player_i66 = arraylist_entry_player_i63.parallelStream();
    boolean b67 = linkedlist_list_entry_player_i0.containsAll((java.util.Collection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>)arraylist_entry_player_i63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type9.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName30.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array37);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName38.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_player_i66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }

    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card1 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str3 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b5 = hashmap_serializable_str3.equals((java.lang.Object)1.0d);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str6 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str3);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str8 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b10 = hashmap_serializable_str8.equals((java.lang.Object)1.0d);
    int i11 = hashmap_serializable_str8.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str12 = hashmap_serializable_str8.entrySet();
    boolean b13 = hashmap_serializable_str6.equals((java.lang.Object)set_entry_serializable_str12);
    boolean b14 = arraylist_abstractcollection_card1.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str12);
    java.lang.Object[] obj_array15 = arraylist_abstractcollection_card1.toArray();
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    org.cs362.dominion.Card.CardName cardName19 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i20 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card17, cardName19);
    java.util.List<org.cs362.dominion.Card> list_card21 = org.cs362.dominion.Card.createCards();
    boolean b22 = arraylist_card17.contains((java.lang.Object)list_card21);
    org.cs362.dominion.Card.Type type23 = null;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card21, type23);
    int i25 = arraylist_abstractcollection_card1.lastIndexOf((java.lang.Object)list_card21);
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card21, type26);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    org.cs362.dominion.Card.CardName cardName31 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i32 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card29, cardName31);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    org.cs362.dominion.Card.CardName cardName36 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i37 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card34, cardName36);
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    int i41 = arraylist_card39.size();
    java.util.RandomAccess[] randomAccess_array42 = new java.util.RandomAccess[] { arraylist_card34, arraylist_card39 };
    java.util.RandomAccess[] randomAccess_array43 = arraylist_card29.toArray(randomAccess_array42);
    org.cs362.dominion.Card.CardName cardName44 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card45 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card29, cardName44);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str47 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b49 = hashmap_serializable_str47.equals((java.lang.Object)1.0d);
    int i50 = hashmap_serializable_str47.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str51 = hashmap_serializable_str47.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str53 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b55 = hashmap_serializable_str53.equals((java.lang.Object)1.0d);
    hashmap_serializable_str47.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str53);
    java.util.HashMap[] hashMap_array58 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array59 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array58;
    hashmap_serializable_str_array59[0] = hashmap_serializable_str53;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array62 = arraylist_card29.toArray(hashmap_serializable_str_array59);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card63 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b64 = arraylist_abstractcollection_card63.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card29);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card65 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card63);
    java.lang.Object[] obj_array66 = linkedlist_abstractcollection_card65.toArray();
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card67 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)linkedlist_abstractcollection_card65);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card68 = linkedlist_abstractcollection_card67.element();
    java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type> hashmap_randomness_type69 = new java.util.HashMap<org.cs362.dominion.Randomness,org.cs362.dominion.Card.Type>();
    org.cs362.dominion.Randomness randomness70 = new org.cs362.dominion.Randomness();
    int i71 = randomness70.main();
    int i72 = randomness70.main();
    int i73 = randomness70.main();
    org.cs362.dominion.Card.Type type74 = org.cs362.dominion.Card.Type.TREASURE;
    org.cs362.dominion.Card.Type type75 = hashmap_randomness_type69.put(randomness70, type74);
    java.lang.Object obj76 = hashmap_randomness_type69.clone();
    org.cs362.dominion.Randomness randomness77 = new org.cs362.dominion.Randomness();
    org.cs362.dominion.Card.Type type78 = org.cs362.dominion.Card.Type.ACTION;
    org.cs362.dominion.Card.Type type79 = hashmap_randomness_type69.replace(randomness77, type78);
    java.util.List<org.cs362.dominion.Card> list_card80 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)abstractcollection_card68, type79);
    org.cs362.dominion.Card.CardName cardName81 = org.cs362.dominion.Card.CardName.Salvager;
    org.cs362.dominion.Card card82 = org.cs362.dominion.Card.getCard(list_card80, cardName81);
    int i83 = org.cs362.dominion.Card.getCardIndex(list_card27, cardName81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + cardName19 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName19.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    org.junit.Assert.assertTrue("'" + cardName31 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName31.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    org.junit.Assert.assertTrue("'" + cardName36 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName36.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array43);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName44.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    org.junit.Assert.assertTrue("'" + type74 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type74.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj76);
    org.junit.Assert.assertTrue("'" + type78 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type78.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(type79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card80);
    org.junit.Assert.assertTrue("'" + cardName81 + "' != '" + org.cs362.dominion.Card.CardName.Salvager + "'", cardName81.equals(org.cs362.dominion.Card.CardName.Salvager));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == (-1));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName16);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str19 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b21 = hashmap_serializable_str19.equals((java.lang.Object)1.0d);
    int i22 = hashmap_serializable_str19.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str23 = hashmap_serializable_str19.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str25 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b27 = hashmap_serializable_str25.equals((java.lang.Object)1.0d);
    hashmap_serializable_str19.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str25);
    java.util.HashMap[] hashMap_array30 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array31 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array30;
    hashmap_serializable_str_array31[0] = hashmap_serializable_str25;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array34 = arraylist_card1.toArray(hashmap_serializable_str_array31);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card35 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b36 = arraylist_abstractcollection_card35.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card1);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card37 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card35);
    java.lang.Object[] obj_array38 = linkedlist_abstractcollection_card37.toArray();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i43 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName42);
    org.cs362.dominion.Card[] card_array44 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card45, card_array44);
    org.cs362.dominion.Card.CardName cardName47 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i48 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card45, cardName47);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    int i52 = arraylist_card50.size();
    java.util.RandomAccess[] randomAccess_array53 = new java.util.RandomAccess[] { arraylist_card45, arraylist_card50 };
    java.util.RandomAccess[] randomAccess_array54 = arraylist_card40.toArray(randomAccess_array53);
    org.cs362.dominion.Card.CardName cardName55 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card56 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName55);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str58 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b60 = hashmap_serializable_str58.equals((java.lang.Object)1.0d);
    int i61 = hashmap_serializable_str58.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str62 = hashmap_serializable_str58.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str64 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b66 = hashmap_serializable_str64.equals((java.lang.Object)1.0d);
    hashmap_serializable_str58.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str64);
    java.util.HashMap[] hashMap_array69 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array70 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array69;
    hashmap_serializable_str_array70[0] = hashmap_serializable_str64;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array73 = arraylist_card40.toArray(hashmap_serializable_str_array70);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card74 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b75 = arraylist_abstractcollection_card74.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card40);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card76 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card74);
    java.lang.Object[] obj_array77 = linkedlist_abstractcollection_card76.toArray();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card78 = linkedlist_abstractcollection_card76.getLast();
    linkedlist_abstractcollection_card37.addFirst(abstractcollection_card78);
    org.cs362.dominion.Card[] card_array80 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card81 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81, card_array80);
    org.cs362.dominion.Card.CardName cardName83 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i84 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card81, cardName83);
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.createCards();
    boolean b86 = arraylist_card81.contains((java.lang.Object)list_card85);
    int i88 = arraylist_card81.indexOf((java.lang.Object)(byte)10);
    boolean b89 = abstractcollection_card78.containsAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81);
    org.cs362.dominion.GameState gameState90 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card81);
    java.util.List<org.cs362.dominion.Player> list_player91 = gameState90.players;
    gameState90.initializeGame();
    java.lang.String str93 = gameState90.toString();
    java.lang.String str94 = gameState90.toString();
    org.cs362.dominion.Player player96 = new org.cs362.dominion.Player(gameState90, "{}");
    player96.buyCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName42.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName47.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName55.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName83.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player91);
    
    // Regression assertion (captures the current behavior of the code)

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }

    java.util.LinkedList<java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>> linkedlist_abstractcollection_arraylist_arraylist_comparable_str0 = new java.util.LinkedList<java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>>();
    java.util.ListIterator<java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>> listiterator_abstractcollection_arraylist_arraylist_comparable_str1 = linkedlist_abstractcollection_arraylist_arraylist_comparable_str0.listIterator();
    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str4 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str4.clear();
    java.util.Set<java.util.Map.Entry<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> set_entry_randomAccess_array_set_entry_serializable_str6 = hashmap_randomAccess_array_set_entry_serializable_str4.entrySet();
    java.util.stream.Stream<java.util.Map.Entry<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> stream_entry_randomAccess_array_set_entry_serializable_str7 = set_entry_randomAccess_array_set_entry_serializable_str6.stream();
    boolean b8 = linkedlist_abstractcollection_arraylist_arraylist_comparable_str0.removeLastOccurrence((java.lang.Object)set_entry_randomAccess_array_set_entry_serializable_str6);
    int i9 = linkedlist_abstractcollection_arraylist_arraylist_comparable_str0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_abstractcollection_arraylist_arraylist_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_randomAccess_array_set_entry_serializable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_randomAccess_array_set_entry_serializable_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }

    java.util.HashMap<java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.List<org.cs362.dominion.Card>> hashmap_list_iterator_entry_serializable_str_list_card2 = new java.util.HashMap<java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.List<org.cs362.dominion.Card>>(100, (float)(byte)100);
    java.util.Collection<java.util.List<org.cs362.dominion.Card>> collection_list_card3 = hashmap_list_iterator_entry_serializable_str_list_card2.values();
    java.util.stream.Stream<java.util.List<org.cs362.dominion.Card>> stream_list_card4 = collection_list_card3.stream();
    java.util.stream.Stream<java.util.List<org.cs362.dominion.Card>> stream_list_card5 = collection_list_card3.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_list_card5);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }

    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable2 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>((int)(byte)0, (float)2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName16);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str19 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b21 = hashmap_serializable_str19.equals((java.lang.Object)1.0d);
    int i22 = hashmap_serializable_str19.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str23 = hashmap_serializable_str19.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str25 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b27 = hashmap_serializable_str25.equals((java.lang.Object)1.0d);
    hashmap_serializable_str19.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str25);
    java.util.HashMap[] hashMap_array30 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array31 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array30;
    hashmap_serializable_str_array31[0] = hashmap_serializable_str25;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array34 = arraylist_card1.toArray(hashmap_serializable_str_array31);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card35 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b36 = arraylist_abstractcollection_card35.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card1);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card37 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card35);
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = linkedlist_abstractcollection_card37.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card38);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card40 = linkedlist_abstractcollection_card37.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card40);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }

    java.util.HashMap<java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>>,java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>> hashmap_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card1 = new java.util.HashMap<java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>>,java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>>((int)(short)10);
    java.lang.String str2 = hashmap_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card1.toString();
    java.util.Set<java.util.Map.Entry<java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>>,java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>>> set_entry_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card3 = hashmap_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card1.entrySet();
    java.lang.String str4 = hashmap_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_listiterator_abstractcollection_card_arraylist_entry_iterable_entry_serializable_str_spliterator_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }

    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj0 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>();
    linkedlist_abstractlist_obj0.clear();
    java.util.LinkedList<java.lang.Object> linkedlist_obj2 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card3 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b4 = linkedlist_obj2.offerLast((java.lang.Object)arraylist_card3);
    java.lang.Object obj5 = linkedlist_obj2.removeLast();
    java.lang.Object obj6 = linkedlist_obj2.peekFirst();
    java.lang.Object obj7 = linkedlist_obj2.pollFirst();
    java.lang.Object obj8 = linkedlist_obj2.peekFirst();
    boolean b9 = linkedlist_abstractlist_obj0.offerLast((java.util.AbstractList<java.lang.Object>)linkedlist_obj2);
    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj10 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>();
    linkedlist_abstractlist_obj10.clear();
    boolean b12 = linkedlist_abstractlist_obj0.addAll((java.util.Collection<java.util.AbstractList<java.lang.Object>>)linkedlist_abstractlist_obj10);
    java.util.Spliterator<java.util.AbstractList<java.lang.Object>> spliterator_abstractlist_obj13 = linkedlist_abstractlist_obj0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractlist_obj13);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }

    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card1 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card3 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> linkedlist_arraylist_iterable_card4 = new java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>>();
    boolean b5 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card1);
    boolean b6 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card3);
    java.util.Iterator<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> iterator_arraylist_iterable_card7 = linkedlist_arraylist_iterable_card4.descendingIterator();
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card9 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ListIterator<java.lang.Iterable<org.cs362.dominion.Card>> listiterator_iterable_card10 = arraylist_iterable_card9.listIterator();
    boolean b11 = linkedlist_arraylist_iterable_card4.offer(arraylist_iterable_card9);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card12 = linkedlist_arraylist_iterable_card4.peekLast();
    java.util.Spliterator<java.lang.Iterable<org.cs362.dominion.Card>> spliterator_iterable_card13 = arraylist_iterable_card12.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_arraylist_iterable_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_iterable_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_iterable_card13);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }

    java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_arraylist_entry_serializable_str0 = new java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_arraylist_entry_serializable_str1 = new java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str2 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    int i3 = arraylist_entry_serializable_str2.size();
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card4 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable6 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.lang.String str7 = hashmap_type_cloneable6.toString();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable9 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    boolean b11 = hashmap_type_cloneable9.containsValue((java.lang.Object)'#');
    org.cs362.dominion.Card.Type type12 = org.cs362.dominion.Card.Type.TREASURE;
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i17 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card14, cardName16);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    org.cs362.dominion.Card.CardName cardName21 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i22 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card19, cardName21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    int i26 = arraylist_card24.size();
    java.util.RandomAccess[] randomAccess_array27 = new java.util.RandomAccess[] { arraylist_card19, arraylist_card24 };
    java.util.RandomAccess[] randomAccess_array28 = arraylist_card14.toArray(randomAccess_array27);
    org.cs362.dominion.Card.CardName cardName29 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card30 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card14, cardName29);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str32 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b34 = hashmap_serializable_str32.equals((java.lang.Object)1.0d);
    int i35 = hashmap_serializable_str32.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str36 = hashmap_serializable_str32.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str38 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b40 = hashmap_serializable_str38.equals((java.lang.Object)1.0d);
    hashmap_serializable_str32.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str38);
    java.util.HashMap[] hashMap_array43 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array44 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array43;
    hashmap_serializable_str_array44[0] = hashmap_serializable_str38;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array47 = arraylist_card14.toArray(hashmap_serializable_str_array44);
    java.lang.Cloneable cloneable48 = hashmap_type_cloneable9.replace(type12, (java.lang.Cloneable)hashmap_serializable_str_array44);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    org.cs362.dominion.Card.CardName cardName52 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i53 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card50, cardName52);
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    boolean b55 = arraylist_card50.contains((java.lang.Object)list_card54);
    int i57 = arraylist_card50.indexOf((java.lang.Object)(byte)10);
    java.lang.Cloneable cloneable58 = hashmap_type_cloneable6.put(type12, (java.lang.Cloneable)arraylist_card50);
    java.util.Spliterator<org.cs362.dominion.Card> spliterator_card59 = hashmap_iterable_entry_serializable_str_spliterator_card4.remove((java.lang.Object)cloneable58);
    java.lang.Object obj60 = hashmap_iterable_entry_serializable_str_spliterator_card4.clone();
    int i61 = arraylist_entry_serializable_str2.indexOf(obj60);
    boolean b62 = linkedlist_arraylist_entry_serializable_str1.offerLast(arraylist_entry_serializable_str2);
    boolean b63 = linkedlist_arraylist_entry_serializable_str0.addAll((java.util.Collection<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)linkedlist_arraylist_entry_serializable_str1);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str64 = null;
    linkedlist_arraylist_entry_serializable_str1.push(arraylist_entry_serializable_str64);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str66 = linkedlist_arraylist_entry_serializable_str1.peek();
    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str67 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> arraylist_entry_iterable_entry_serializable_str_spliterator_card68 = new java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>();
    arraylist_entry_iterable_entry_serializable_str_spliterator_card68.ensureCapacity(2);
    java.util.ListIterator<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> listiterator_entry_iterable_entry_serializable_str_spliterator_card71 = arraylist_entry_iterable_entry_serializable_str_spliterator_card68.listIterator();
    int i72 = linkedlist_iterator_entry_serializable_str67.indexOf((java.lang.Object)arraylist_entry_iterable_entry_serializable_str_spliterator_card68);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str73 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str74 = arraylist_entry_serializable_str73.stream();
    arraylist_entry_serializable_str73.clear();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str76 = arraylist_entry_serializable_str73.iterator();
    java.util.ArrayList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> arraylist_iterator_entry_serializable_str77 = new java.util.ArrayList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b78 = arraylist_iterator_entry_serializable_str77.add(iterator_entry_serializable_str76);
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str79 = org.cs362.dominion.Randomness.randomMember((java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)arraylist_iterator_entry_serializable_str77);
    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str80 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b81 = linkedlist_iterator_entry_serializable_str80.add(iterator_entry_serializable_str79);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str83 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str84 = arraylist_entry_serializable_str83.stream();
    arraylist_entry_serializable_str83.clear();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str86 = arraylist_entry_serializable_str83.iterator();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str87 = linkedlist_iterator_entry_serializable_str80.set((int)(byte)0, iterator_entry_serializable_str86);
    boolean b88 = linkedlist_iterator_entry_serializable_str67.offerLast(iterator_entry_serializable_str87);
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str89 = linkedlist_iterator_entry_serializable_str67.peekLast();
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str91 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>((int)(short)1);
    int i92 = linkedlist_iterator_entry_serializable_str67.lastIndexOf((java.lang.Object)arraylist_entry_serializable_str91);
    linkedlist_arraylist_entry_serializable_str1.addLast(arraylist_entry_serializable_str91);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str94 = linkedlist_arraylist_entry_serializable_str1.removeFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type12.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName21.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array28);
    org.junit.Assert.assertTrue("'" + cardName29 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName29.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    org.junit.Assert.assertTrue("'" + cardName52 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName52.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spliterator_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_entry_serializable_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_entry_iterable_entry_serializable_str_spliterator_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_entry_serializable_str94);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }

    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>();
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b2 = arraylist_arraylist_comparable_str0.add(arraylist_comparable_str1);
    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str3 = new java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>();
    java.util.ArrayList<java.lang.Comparable<java.lang.String>> arraylist_comparable_str4 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
    boolean b5 = arraylist_arraylist_comparable_str3.add(arraylist_comparable_str4);
    java.util.LinkedList<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>> linkedlist_arraylist_arraylist_comparable_str6 = new java.util.LinkedList<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>();
    boolean b7 = linkedlist_arraylist_arraylist_comparable_str6.add(arraylist_arraylist_comparable_str0);
    boolean b8 = linkedlist_arraylist_arraylist_comparable_str6.add(arraylist_arraylist_comparable_str3);
    java.lang.Object obj9 = linkedlist_arraylist_arraylist_comparable_str6.clone();
    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str10 = linkedlist_arraylist_arraylist_comparable_str6.remove();
    java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> arraylist_arraylist_comparable_str11 = linkedlist_arraylist_arraylist_comparable_str6.pollLast();
    int i12 = arraylist_arraylist_comparable_str11.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_arraylist_comparable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_arraylist_comparable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }

    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card2 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card3 = hashmap_iterable_entry_serializable_str_spliterator_card2.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card4 = collection_spliterator_card3.stream();
    java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>> linkedlist_stream_spliterator_card5 = new java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>>();
    boolean b6 = linkedlist_stream_spliterator_card5.add(stream_spliterator_card4);
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card9 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card10 = hashmap_iterable_entry_serializable_str_spliterator_card9.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card11 = collection_spliterator_card10.stream();
    linkedlist_stream_spliterator_card5.addFirst(stream_spliterator_card11);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card13 = linkedlist_stream_spliterator_card5.removeLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card14 = linkedlist_stream_spliterator_card5.getLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card15 = linkedlist_stream_spliterator_card5.peekFirst();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable17 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    org.cs362.dominion.Card.CardName cardName21 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i22 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card19, cardName21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    org.cs362.dominion.Card.CardName cardName26 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i27 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card24, cardName26);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    int i31 = arraylist_card29.size();
    java.util.RandomAccess[] randomAccess_array32 = new java.util.RandomAccess[] { arraylist_card24, arraylist_card29 };
    java.util.RandomAccess[] randomAccess_array33 = arraylist_card19.toArray(randomAccess_array32);
    org.cs362.dominion.Card.CardName cardName34 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card35 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card19, cardName34);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str37 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b39 = hashmap_serializable_str37.equals((java.lang.Object)1.0d);
    int i40 = hashmap_serializable_str37.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str41 = hashmap_serializable_str37.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str43 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b45 = hashmap_serializable_str43.equals((java.lang.Object)1.0d);
    hashmap_serializable_str37.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str43);
    java.util.HashMap[] hashMap_array48 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array49 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array48;
    hashmap_serializable_str_array49[0] = hashmap_serializable_str43;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array52 = arraylist_card19.toArray(hashmap_serializable_str_array49);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card53 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b54 = arraylist_abstractcollection_card53.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card19);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card55 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card53);
    java.lang.Object[] obj_array56 = linkedlist_abstractcollection_card55.toArray();
    boolean b57 = hashmap_type_cloneable17.containsKey((java.lang.Object)linkedlist_abstractcollection_card55);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card58 = linkedlist_abstractcollection_card55.pollLast();
    org.cs362.dominion.Card[] card_array59 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card60 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card60, card_array59);
    org.cs362.dominion.Card card62 = null;
    boolean b63 = arraylist_card60.add(card62);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str65 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b67 = hashmap_serializable_str65.equals((java.lang.Object)1.0d);
    int i68 = hashmap_serializable_str65.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str69 = hashmap_serializable_str65.entrySet();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str70 = hashmap_serializable_str65.entrySet();
    boolean b71 = arraylist_card60.containsAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str70);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str73 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b75 = hashmap_serializable_str73.equals((java.lang.Object)1.0d);
    int i76 = hashmap_serializable_str73.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str77 = hashmap_serializable_str73.entrySet();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str78 = hashmap_serializable_str73.entrySet();
    java.util.ArrayList<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> arraylist_iterable_entry_serializable_str79 = new java.util.ArrayList<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b80 = arraylist_iterable_entry_serializable_str79.add((java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str70);
    boolean b81 = arraylist_iterable_entry_serializable_str79.add((java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str78);
    boolean b82 = linkedlist_abstractcollection_card55.retainAll((java.util.Collection<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)arraylist_iterable_entry_serializable_str79);
    boolean b83 = linkedlist_stream_spliterator_card5.remove((java.lang.Object)arraylist_iterable_entry_serializable_str79);
    java.lang.Object obj84 = arraylist_iterable_entry_serializable_str79.clone();
    java.util.HashMap<java.util.Set<org.cs362.dominion.Card.Type>,java.util.AbstractCollection<java.lang.Object>> hashmap_set_type_abstractcollection_obj86 = new java.util.HashMap<java.util.Set<org.cs362.dominion.Card.Type>,java.util.AbstractCollection<java.lang.Object>>(3);
    java.util.Set<java.util.Map.Entry<java.util.Set<org.cs362.dominion.Card.Type>,java.util.AbstractCollection<java.lang.Object>>> set_entry_set_type_abstractcollection_obj87 = hashmap_set_type_abstractcollection_obj86.entrySet();
    boolean b88 = arraylist_iterable_entry_serializable_str79.retainAll((java.util.Collection<java.util.Map.Entry<java.util.Set<org.cs362.dominion.Card.Type>,java.util.AbstractCollection<java.lang.Object>>>)set_entry_set_type_abstractcollection_obj87);
    java.util.function.UnaryOperator<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> unaryoperator_iterable_entry_serializable_str89 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_iterable_entry_serializable_str79.replaceAll(unaryoperator_iterable_entry_serializable_str89);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    org.junit.Assert.assertTrue("'" + cardName21 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName21.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName26.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array33);
    org.junit.Assert.assertTrue("'" + cardName34 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName34.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_set_type_abstractcollection_obj87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }

    java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>> hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2 = new java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>>((int)'4', (float)'a');
    java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>> hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i5 = new java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>>((int)'4', (float)'a');
    hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2.putAll((java.util.Map<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>>)hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i5);
    int i7 = hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }

    java.util.HashMap<java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.List<org.cs362.dominion.Card>> hashmap_list_iterator_entry_serializable_str_list_card2 = new java.util.HashMap<java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.List<org.cs362.dominion.Card>>(100, (float)(byte)100);
    java.util.Collection<java.util.List<org.cs362.dominion.Card>> collection_list_card3 = hashmap_list_iterator_entry_serializable_str_list_card2.values();
    java.util.ArrayList<java.util.Collection<java.util.List<org.cs362.dominion.Card>>> arraylist_collection_list_card4 = new java.util.ArrayList<java.util.Collection<java.util.List<org.cs362.dominion.Card>>>();
    boolean b5 = arraylist_collection_list_card4.add(collection_list_card3);
    java.util.LinkedList<java.lang.Object> linkedlist_obj6 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card7 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b8 = linkedlist_obj6.offerLast((java.lang.Object)arraylist_card7);
    java.lang.Object obj9 = linkedlist_obj6.removeLast();
    java.lang.Object obj10 = linkedlist_obj6.peekFirst();
    java.util.ArrayList<java.util.Map.Entry<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> arraylist_entry_randomAccess_array_set_entry_serializable_str11 = new java.util.ArrayList<java.util.Map.Entry<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>>();
    boolean b12 = linkedlist_obj6.addAll((java.util.Collection<java.util.Map.Entry<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>>)arraylist_entry_randomAccess_array_set_entry_serializable_str11);
    boolean b13 = arraylist_collection_list_card4.contains((java.lang.Object)arraylist_entry_randomAccess_array_set_entry_serializable_str11);
    java.lang.Object[] obj_array14 = arraylist_collection_list_card4.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }

    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str2 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str2.clear();
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    org.cs362.dominion.Card.CardName cardName7 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i8 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card5, cardName7);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card10 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    org.cs362.dominion.Randomness randomness11 = new org.cs362.dominion.Randomness();
    int i12 = randomness11.main();
    int i13 = arraylist_abstractcollection_card10.lastIndexOf((java.lang.Object)i12);
    java.util.ArrayList[] arrayList_array15 = new java.util.ArrayList[ 0 ];
    @SuppressWarnings("unchecked")
    java.util.ArrayList<org.cs362.dominion.Card>[] arraylist_card_array16 = (java.util.ArrayList<org.cs362.dominion.Card>[])arrayList_array15;
    java.util.ArrayList<org.cs362.dominion.Card>[] arraylist_card_array17 = arraylist_abstractcollection_card10.toArray((java.util.ArrayList<org.cs362.dominion.Card>[])arrayList_array15);
    java.util.AbstractList<org.cs362.dominion.Card>[] abstractlist_card_array18 = arraylist_card5.toArray((java.util.AbstractList<org.cs362.dominion.Card>[])arraylist_card_array17);
    java.util.LinkedHashSet<java.util.Map.Entry<java.io.Serializable,java.lang.String>> linkedhashset_entry_serializable_str19 = new java.util.LinkedHashSet<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str20 = hashmap_randomAccess_array_set_entry_serializable_str2.putIfAbsent((java.util.RandomAccess[])arraylist_card_array17, (java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)linkedhashset_entry_serializable_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + cardName7 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName7.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arrayList_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractlist_card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(set_entry_serializable_str20);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }

    java.util.ArrayList<java.util.AbstractList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>> arraylist_abstractlist_arraylist_comparable_str1 = new java.util.ArrayList<java.util.AbstractList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>((int)(byte)100);
    java.lang.Object obj2 = null;
    boolean b3 = arraylist_abstractlist_arraylist_comparable_str1.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }

    java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>> linkedlist_set_type0 = new java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>>();
    java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>> linkedlist_set_type2 = new java.util.LinkedList<java.util.Set<org.cs362.dominion.Card.Type>>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable3 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>();
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card6 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card7 = arraylist_abstractcollection_card6.spliterator();
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    org.cs362.dominion.Card.CardName cardName12 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i13 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card10, cardName12);
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    boolean b15 = arraylist_card10.contains((java.lang.Object)list_card14);
    arraylist_abstractcollection_card6.add((int)(short)0, (java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card10);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    org.cs362.dominion.Card.CardName cardName20 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i21 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card18, cardName20);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    org.cs362.dominion.Card.CardName cardName25 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i26 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card23, cardName25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    int i30 = arraylist_card28.size();
    java.util.RandomAccess[] randomAccess_array31 = new java.util.RandomAccess[] { arraylist_card23, arraylist_card28 };
    java.util.RandomAccess[] randomAccess_array32 = arraylist_card18.toArray(randomAccess_array31);
    org.cs362.dominion.Card.CardName cardName33 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card34 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card18, cardName33);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str36 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b38 = hashmap_serializable_str36.equals((java.lang.Object)1.0d);
    int i39 = hashmap_serializable_str36.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str40 = hashmap_serializable_str36.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str42 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b44 = hashmap_serializable_str42.equals((java.lang.Object)1.0d);
    hashmap_serializable_str36.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str42);
    java.util.HashMap[] hashMap_array47 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array48 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array47;
    hashmap_serializable_str_array48[0] = hashmap_serializable_str42;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array51 = arraylist_card18.toArray(hashmap_serializable_str_array48);
    boolean b52 = hashmap_type_cloneable3.replace(type4, (java.lang.Cloneable)arraylist_card10, (java.lang.Cloneable)hashmap_serializable_str_array51);
    java.util.Set<org.cs362.dominion.Card.Type> set_type53 = hashmap_type_cloneable3.keySet();
    boolean b54 = linkedlist_set_type2.offer(set_type53);
    boolean b55 = linkedlist_set_type0.addAll(0, (java.util.Collection<java.util.Set<org.cs362.dominion.Card.Type>>)linkedlist_set_type2);
    java.util.Set<org.cs362.dominion.Card.Type> set_type56 = linkedlist_set_type0.getFirst();
    java.lang.Object obj57 = null;
    int i58 = linkedlist_set_type0.lastIndexOf(obj57);
    java.lang.Object obj59 = linkedlist_set_type0.clone();
    java.util.ArrayList<java.util.Collection<org.cs362.dominion.Card.Type>> arraylist_collection_type60 = new java.util.ArrayList<java.util.Collection<org.cs362.dominion.Card.Type>>((java.util.Collection<java.util.Set<org.cs362.dominion.Card.Type>>)linkedlist_set_type0);
    java.util.function.UnaryOperator<java.util.Collection<org.cs362.dominion.Card.Type>> unaryoperator_collection_type61 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_collection_type60.replaceAll(unaryoperator_collection_type61);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type4.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    org.junit.Assert.assertTrue("'" + cardName20 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName20.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    org.junit.Assert.assertTrue("'" + cardName25 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName25.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array32);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName33.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_type56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj59);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }

    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card1 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card2 = arraylist_abstractcollection_card1.spliterator();
    java.lang.Object[] obj_array3 = arraylist_abstractcollection_card1.toArray();
    boolean b4 = arraylist_abstractcollection_card1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test35"); }

    java.util.ArrayList<java.util.Collection<java.util.Map.Entry<java.util.Map<java.io.Serializable,java.lang.String>,java.util.AbstractList<java.lang.Object>>>> arraylist_collection_entry_map_serializable_str_abstractlist_obj1 = new java.util.ArrayList<java.util.Collection<java.util.Map.Entry<java.util.Map<java.io.Serializable,java.lang.String>,java.util.AbstractList<java.lang.Object>>>>(4);
    boolean b2 = arraylist_collection_entry_map_serializable_str_abstractlist_obj1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test36"); }

    java.util.HashMap<java.util.Queue<java.lang.Object>,java.util.HashMap<java.io.Serializable,java.lang.String>> hashmap_queue_obj_hashmap_serializable_str2 = new java.util.HashMap<java.util.Queue<java.lang.Object>,java.util.HashMap<java.io.Serializable,java.lang.String>>(10, (float)'a');
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card5 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card6 = hashmap_iterable_entry_serializable_str_spliterator_card5.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card7 = collection_spliterator_card6.stream();
    java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>> linkedlist_stream_spliterator_card8 = new java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>>();
    boolean b9 = linkedlist_stream_spliterator_card8.add(stream_spliterator_card7);
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card12 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card13 = hashmap_iterable_entry_serializable_str_spliterator_card12.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card14 = collection_spliterator_card13.stream();
    linkedlist_stream_spliterator_card8.addFirst(stream_spliterator_card14);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card16 = linkedlist_stream_spliterator_card8.removeLast();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str18 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    java.lang.String str20 = hashmap_serializable_str18.get((java.lang.Object)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str21 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str18);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable23 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.lang.String str24 = hashmap_type_cloneable23.toString();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable26 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    boolean b28 = hashmap_type_cloneable26.containsValue((java.lang.Object)'#');
    org.cs362.dominion.Card.Type type29 = org.cs362.dominion.Card.Type.TREASURE;
    org.cs362.dominion.Card[] card_array30 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card31 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card31, card_array30);
    org.cs362.dominion.Card.CardName cardName33 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i34 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card31, cardName33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    org.cs362.dominion.Card.CardName cardName38 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i39 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card36, cardName38);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    int i43 = arraylist_card41.size();
    java.util.RandomAccess[] randomAccess_array44 = new java.util.RandomAccess[] { arraylist_card36, arraylist_card41 };
    java.util.RandomAccess[] randomAccess_array45 = arraylist_card31.toArray(randomAccess_array44);
    org.cs362.dominion.Card.CardName cardName46 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card47 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card31, cardName46);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str49 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b51 = hashmap_serializable_str49.equals((java.lang.Object)1.0d);
    int i52 = hashmap_serializable_str49.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str53 = hashmap_serializable_str49.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str55 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b57 = hashmap_serializable_str55.equals((java.lang.Object)1.0d);
    hashmap_serializable_str49.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str55);
    java.util.HashMap[] hashMap_array60 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array61 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array60;
    hashmap_serializable_str_array61[0] = hashmap_serializable_str55;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array64 = arraylist_card31.toArray(hashmap_serializable_str_array61);
    java.lang.Cloneable cloneable65 = hashmap_type_cloneable26.replace(type29, (java.lang.Cloneable)hashmap_serializable_str_array61);
    org.cs362.dominion.Card[] card_array66 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card67 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card67, card_array66);
    org.cs362.dominion.Card.CardName cardName69 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i70 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card67, cardName69);
    java.util.List<org.cs362.dominion.Card> list_card71 = org.cs362.dominion.Card.createCards();
    boolean b72 = arraylist_card67.contains((java.lang.Object)list_card71);
    int i74 = arraylist_card67.indexOf((java.lang.Object)(byte)10);
    java.lang.Cloneable cloneable75 = hashmap_type_cloneable23.put(type29, (java.lang.Cloneable)arraylist_card67);
    boolean b76 = hashmap_serializable_str18.equals((java.lang.Object)hashmap_type_cloneable23);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str77 = hashmap_queue_obj_hashmap_serializable_str2.getOrDefault((java.lang.Object)linkedlist_stream_spliterator_card8, hashmap_serializable_str18);
    java.util.Collection<java.util.HashMap<java.io.Serializable,java.lang.String>> collection_hashmap_serializable_str78 = hashmap_queue_obj_hashmap_serializable_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}"+ "'", str24.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type29.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    org.junit.Assert.assertTrue("'" + cardName33 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName33.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    org.junit.Assert.assertTrue("'" + cardName38 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName38.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array45);
    org.junit.Assert.assertTrue("'" + cardName46 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName46.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    org.junit.Assert.assertTrue("'" + cardName69 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName69.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_hashmap_serializable_str78);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test37"); }

    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card0 = new java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>();
    java.util.Spliterator<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> spliterator_iterable_abstractcollection_card1 = arraylist_iterable_abstractcollection_card0.spliterator();
    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card2 = new java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>();
    java.lang.Object[] obj_array3 = arraylist_iterable_abstractcollection_card2.toArray();
    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card4 = new java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>();
    java.util.ArrayList<java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>> arraylist_arraylist_iterable_abstractcollection_card5 = new java.util.ArrayList<java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>>();
    boolean b6 = arraylist_arraylist_iterable_abstractcollection_card5.add(arraylist_iterable_abstractcollection_card0);
    boolean b7 = arraylist_arraylist_iterable_abstractcollection_card5.add(arraylist_iterable_abstractcollection_card2);
    boolean b8 = arraylist_arraylist_iterable_abstractcollection_card5.add(arraylist_iterable_abstractcollection_card4);
    java.lang.Object[] obj_array9 = arraylist_arraylist_iterable_abstractcollection_card5.toArray();
    // The following exception was thrown during execution in test generation
    try {
    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card11 = arraylist_arraylist_iterable_abstractcollection_card5.remove((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_iterable_abstractcollection_card1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test39"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card17 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    boolean b18 = arraylist_card1.removeAll((java.util.Collection<java.lang.Iterable<org.cs362.dominion.Card>>)arraylist_iterable_card17);
    java.util.ListIterator<java.lang.Iterable<org.cs362.dominion.Card>> listiterator_iterable_card19 = arraylist_iterable_card17.listIterator();
    java.util.ListIterator<java.lang.Iterable<org.cs362.dominion.Card>> listiterator_iterable_card20 = arraylist_iterable_card17.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_card20);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test40"); }

    java.util.HashMap<java.util.Map<java.io.Serializable,java.lang.String>,java.util.AbstractList<java.lang.Object>> hashmap_map_serializable_str_abstractlist_obj0 = new java.util.HashMap<java.util.Map<java.io.Serializable,java.lang.String>,java.util.AbstractList<java.lang.Object>>();

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test41"); }

    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str1 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b3 = hashmap_serializable_str1.equals((java.lang.Object)1.0d);
    int i4 = hashmap_serializable_str1.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str5 = hashmap_serializable_str1.entrySet();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str6 = hashmap_serializable_str1.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str8 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b10 = hashmap_serializable_str8.equals((java.lang.Object)1.0d);
    int i11 = hashmap_serializable_str8.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str12 = hashmap_serializable_str8.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str14 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b16 = hashmap_serializable_str14.equals((java.lang.Object)1.0d);
    hashmap_serializable_str8.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str14);
    hashmap_serializable_str1.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str8);
    boolean b19 = hashmap_serializable_str1.isEmpty();
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card21 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str23 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b25 = hashmap_serializable_str23.equals((java.lang.Object)1.0d);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str26 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str23);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str28 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b30 = hashmap_serializable_str28.equals((java.lang.Object)1.0d);
    int i31 = hashmap_serializable_str28.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str32 = hashmap_serializable_str28.entrySet();
    boolean b33 = hashmap_serializable_str26.equals((java.lang.Object)set_entry_serializable_str32);
    boolean b34 = arraylist_abstractcollection_card21.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str32);
    java.lang.Object[] obj_array35 = arraylist_abstractcollection_card21.toArray();
    boolean b36 = arraylist_abstractcollection_card21.isEmpty();
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    org.cs362.dominion.Card card40 = null;
    boolean b41 = arraylist_card38.add(card40);
    boolean b42 = arraylist_abstractcollection_card21.removeAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38);
    java.lang.String str44 = hashmap_serializable_str1.getOrDefault((java.lang.Object)b42, "hi!");
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str45 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str46 = arraylist_entry_serializable_str45.stream();
    java.lang.Object[] obj_array47 = arraylist_entry_serializable_str45.toArray();
    arraylist_entry_serializable_str45.trimToSize();
    java.lang.String str50 = hashmap_serializable_str1.replace((java.io.Serializable)arraylist_entry_serializable_str45, "");
    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str53 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str53.clear();
    boolean b55 = hashmap_serializable_str1.equals((java.lang.Object)hashmap_randomAccess_array_set_entry_serializable_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test43"); }

    java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> arraylist_iterable_abstractcollection_card0 = new java.util.ArrayList<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>>();
    java.util.LinkedList<java.lang.Object> linkedlist_obj1 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card2 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b3 = linkedlist_obj1.offerLast((java.lang.Object)arraylist_card2);
    java.lang.Object obj4 = linkedlist_obj1.removeLast();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable6 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i11 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName10);
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i16 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card13, cardName15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    int i20 = arraylist_card18.size();
    java.util.RandomAccess[] randomAccess_array21 = new java.util.RandomAccess[] { arraylist_card13, arraylist_card18 };
    java.util.RandomAccess[] randomAccess_array22 = arraylist_card8.toArray(randomAccess_array21);
    org.cs362.dominion.Card.CardName cardName23 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card24 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName23);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str26 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b28 = hashmap_serializable_str26.equals((java.lang.Object)1.0d);
    int i29 = hashmap_serializable_str26.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str30 = hashmap_serializable_str26.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str32 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b34 = hashmap_serializable_str32.equals((java.lang.Object)1.0d);
    hashmap_serializable_str26.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str32);
    java.util.HashMap[] hashMap_array37 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array38 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array37;
    hashmap_serializable_str_array38[0] = hashmap_serializable_str32;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array41 = arraylist_card8.toArray(hashmap_serializable_str_array38);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card42 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b43 = arraylist_abstractcollection_card42.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card8);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card44 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card42);
    java.lang.Object[] obj_array45 = linkedlist_abstractcollection_card44.toArray();
    boolean b46 = hashmap_type_cloneable6.containsKey((java.lang.Object)linkedlist_abstractcollection_card44);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card47 = linkedlist_abstractcollection_card44.pollLast();
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    org.cs362.dominion.Card.CardName cardName51 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i52 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card49, cardName51);
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    org.cs362.dominion.Card.CardName cardName56 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i57 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card54, cardName56);
    org.cs362.dominion.Card[] card_array58 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card59, card_array58);
    int i61 = arraylist_card59.size();
    java.util.RandomAccess[] randomAccess_array62 = new java.util.RandomAccess[] { arraylist_card54, arraylist_card59 };
    java.util.RandomAccess[] randomAccess_array63 = arraylist_card49.toArray(randomAccess_array62);
    org.cs362.dominion.Card.CardName cardName64 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card65 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card49, cardName64);
    boolean b66 = linkedlist_abstractcollection_card44.removeLastOccurrence((java.lang.Object)cardName64);
    java.util.ListIterator<java.util.AbstractCollection<org.cs362.dominion.Card>> listiterator_abstractcollection_card67 = linkedlist_abstractcollection_card44.listIterator();
    boolean b68 = linkedlist_obj1.add((java.lang.Object)linkedlist_abstractcollection_card44);
    java.lang.Object obj69 = linkedlist_obj1.getFirst();
    int i70 = arraylist_iterable_abstractcollection_card0.lastIndexOf((java.lang.Object)linkedlist_obj1);
    org.cs362.dominion.Card[] card_array71 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card72 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card72, card_array71);
    org.cs362.dominion.Card.CardName cardName74 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i75 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card72, cardName74);
    org.cs362.dominion.Card[] card_array76 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card77 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card77, card_array76);
    org.cs362.dominion.Card.CardName cardName79 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i80 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card77, cardName79);
    org.cs362.dominion.Card[] card_array81 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card82 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b83 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card82, card_array81);
    int i84 = arraylist_card82.size();
    java.util.RandomAccess[] randomAccess_array85 = new java.util.RandomAccess[] { arraylist_card77, arraylist_card82 };
    java.util.RandomAccess[] randomAccess_array86 = arraylist_card72.toArray(randomAccess_array85);
    org.cs362.dominion.Card.CardName cardName87 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card88 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card72, cardName87);
    int i89 = arraylist_iterable_abstractcollection_card0.indexOf((java.lang.Object)cardName87);
    java.util.ListIterator<java.lang.Iterable<java.util.AbstractCollection<org.cs362.dominion.Card>>> listiterator_iterable_abstractcollection_card90 = arraylist_iterable_abstractcollection_card0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    org.junit.Assert.assertTrue("'" + cardName15 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName15.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array22);
    org.junit.Assert.assertTrue("'" + cardName23 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName23.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    org.junit.Assert.assertTrue("'" + cardName51 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName51.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    org.junit.Assert.assertTrue("'" + cardName56 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName56.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array63);
    org.junit.Assert.assertTrue("'" + cardName64 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName64.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_abstractcollection_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    org.junit.Assert.assertTrue("'" + cardName74 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName74.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    org.junit.Assert.assertTrue("'" + cardName79 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName79.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array86);
    org.junit.Assert.assertTrue("'" + cardName87 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName87.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_abstractcollection_card90);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test44"); }

    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable1 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>((int)(byte)100);
    org.cs362.dominion.Card[] card_array2 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card3 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card3, card_array2);
    org.cs362.dominion.Card.CardName cardName5 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i6 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card3, cardName5);
    org.cs362.dominion.Card[] card_array7 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card8 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card8, card_array7);
    org.cs362.dominion.Card.CardName cardName10 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i11 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card8, cardName10);
    org.cs362.dominion.Card[] card_array12 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card13 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card13, card_array12);
    int i15 = arraylist_card13.size();
    java.util.RandomAccess[] randomAccess_array16 = new java.util.RandomAccess[] { arraylist_card8, arraylist_card13 };
    java.util.RandomAccess[] randomAccess_array17 = arraylist_card3.toArray(randomAccess_array16);
    org.cs362.dominion.Card.CardName cardName18 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card19 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card3, cardName18);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str21 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b23 = hashmap_serializable_str21.equals((java.lang.Object)1.0d);
    int i24 = hashmap_serializable_str21.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str25 = hashmap_serializable_str21.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str27 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b29 = hashmap_serializable_str27.equals((java.lang.Object)1.0d);
    hashmap_serializable_str21.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str27);
    java.util.HashMap[] hashMap_array32 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array33 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array32;
    hashmap_serializable_str_array33[0] = hashmap_serializable_str27;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array36 = arraylist_card3.toArray(hashmap_serializable_str_array33);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card37 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b38 = arraylist_abstractcollection_card37.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card3);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card39 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card37);
    java.lang.Object[] obj_array40 = linkedlist_abstractcollection_card39.toArray();
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card41 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)linkedlist_abstractcollection_card39);
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card42 = linkedlist_abstractcollection_card41.remove();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card43 = linkedlist_abstractcollection_card41.peekFirst();
    java.lang.Cloneable cloneable44 = hashmap_type_cloneable1.get((java.lang.Object)abstractcollection_card43);
    org.cs362.dominion.Card.Type type45 = org.cs362.dominion.Card.Type.VICTORY;
    org.cs362.dominion.GameState gameState46 = null;
    org.cs362.dominion.Player player48 = new org.cs362.dominion.Player(gameState46, "hi!");
    player48.playTreasureCard();
    player48.playKingdomCard();
    java.lang.Cloneable cloneable51 = hashmap_type_cloneable1.put(type45, (java.lang.Cloneable)player48);
    org.cs362.dominion.Card card52 = null;
    player48.discard(card52);
    java.lang.String str54 = player48.toString();
    java.lang.String str55 = player48.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName5.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    org.junit.Assert.assertTrue("'" + cardName10 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName10.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array17);
    org.junit.Assert.assertTrue("'" + cardName18 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName18.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractcollection_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type45.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable51);
    

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test45"); }

    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str0 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> arraylist_entry_iterable_entry_serializable_str_spliterator_card1 = new java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>();
    arraylist_entry_iterable_entry_serializable_str_spliterator_card1.ensureCapacity(2);
    java.util.ListIterator<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> listiterator_entry_iterable_entry_serializable_str_spliterator_card4 = arraylist_entry_iterable_entry_serializable_str_spliterator_card1.listIterator();
    int i5 = linkedlist_iterator_entry_serializable_str0.indexOf((java.lang.Object)arraylist_entry_iterable_entry_serializable_str_spliterator_card1);
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str6 = linkedlist_iterator_entry_serializable_str0.peekLast();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_entry_iterable_entry_serializable_str_spliterator_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iterator_entry_serializable_str6);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test46"); }

    java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>,java.lang.Comparable<org.cs362.dominion.Card.CardName>> hashmap_stream_entry_iterable_entry_serializable_str_spliterator_card_comparable_cardName0 = new java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>,java.lang.Comparable<org.cs362.dominion.Card.CardName>>();
    boolean b1 = hashmap_stream_entry_iterable_entry_serializable_str_spliterator_card_comparable_cardName0.isEmpty();
    boolean b2 = hashmap_stream_entry_iterable_entry_serializable_str_spliterator_card_comparable_cardName0.isEmpty();
    java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> arraylist_entry_iterable_entry_serializable_str_spliterator_card3 = new java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>();
    java.util.stream.Stream<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> stream_entry_iterable_entry_serializable_str_spliterator_card4 = arraylist_entry_iterable_entry_serializable_str_spliterator_card3.stream();
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card7 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card8 = hashmap_iterable_entry_serializable_str_spliterator_card7.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card9 = collection_spliterator_card8.stream();
    java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>> linkedlist_stream_spliterator_card10 = new java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>>();
    boolean b11 = linkedlist_stream_spliterator_card10.add(stream_spliterator_card9);
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card14 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card15 = hashmap_iterable_entry_serializable_str_spliterator_card14.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card16 = collection_spliterator_card15.stream();
    linkedlist_stream_spliterator_card10.addFirst(stream_spliterator_card16);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card18 = linkedlist_stream_spliterator_card10.removeLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card19 = linkedlist_stream_spliterator_card10.getLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card20 = linkedlist_stream_spliterator_card10.poll();
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card23 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card24 = hashmap_iterable_entry_serializable_str_spliterator_card23.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card25 = collection_spliterator_card24.stream();
    java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>> linkedlist_stream_spliterator_card26 = new java.util.LinkedList<java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>>>();
    boolean b27 = linkedlist_stream_spliterator_card26.add(stream_spliterator_card25);
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card30 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>((int)(short)100, (float)'#');
    java.util.Collection<java.util.Spliterator<org.cs362.dominion.Card>> collection_spliterator_card31 = hashmap_iterable_entry_serializable_str_spliterator_card30.values();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card32 = collection_spliterator_card31.stream();
    linkedlist_stream_spliterator_card26.addFirst(stream_spliterator_card32);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card34 = linkedlist_stream_spliterator_card26.removeLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card35 = linkedlist_stream_spliterator_card26.getLast();
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card36 = linkedlist_stream_spliterator_card26.peekFirst();
    linkedlist_stream_spliterator_card10.addFirst(stream_spliterator_card36);
    java.util.stream.Stream<java.util.Spliterator<org.cs362.dominion.Card>> stream_spliterator_card38 = linkedlist_stream_spliterator_card10.pop();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable40 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    org.cs362.dominion.Card[] card_array41 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card42, card_array41);
    org.cs362.dominion.Card.CardName cardName44 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i45 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card42, cardName44);
    org.cs362.dominion.Card[] card_array46 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card47 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card47, card_array46);
    org.cs362.dominion.Card.CardName cardName49 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i50 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card47, cardName49);
    org.cs362.dominion.Card[] card_array51 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card52 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card52, card_array51);
    int i54 = arraylist_card52.size();
    java.util.RandomAccess[] randomAccess_array55 = new java.util.RandomAccess[] { arraylist_card47, arraylist_card52 };
    java.util.RandomAccess[] randomAccess_array56 = arraylist_card42.toArray(randomAccess_array55);
    org.cs362.dominion.Card.CardName cardName57 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card58 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card42, cardName57);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str60 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b62 = hashmap_serializable_str60.equals((java.lang.Object)1.0d);
    int i63 = hashmap_serializable_str60.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str64 = hashmap_serializable_str60.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str66 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b68 = hashmap_serializable_str66.equals((java.lang.Object)1.0d);
    hashmap_serializable_str60.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str66);
    java.util.HashMap[] hashMap_array71 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array72 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array71;
    hashmap_serializable_str_array72[0] = hashmap_serializable_str66;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array75 = arraylist_card42.toArray(hashmap_serializable_str_array72);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card76 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b77 = arraylist_abstractcollection_card76.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card42);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card78 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card76);
    java.lang.Object[] obj_array79 = linkedlist_abstractcollection_card78.toArray();
    boolean b80 = hashmap_type_cloneable40.containsKey((java.lang.Object)linkedlist_abstractcollection_card78);
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable82 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.lang.String str83 = hashmap_type_cloneable82.toString();
    hashmap_type_cloneable40.putAll((java.util.Map<org.cs362.dominion.Card.Type,java.lang.Cloneable>)hashmap_type_cloneable82);
    boolean b85 = hashmap_type_cloneable40.isEmpty();
    org.cs362.dominion.Card.CardName cardName86 = org.cs362.dominion.Card.CardName.Duchy;
    java.lang.Cloneable cloneable87 = hashmap_type_cloneable40.get((java.lang.Object)cardName86);
    int i88 = linkedlist_stream_spliterator_card10.lastIndexOf((java.lang.Object)cardName86);
    java.lang.Comparable<org.cs362.dominion.Card.CardName> comparable_cardName89 = hashmap_stream_entry_iterable_entry_serializable_str_spliterator_card_comparable_cardName0.put(stream_entry_iterable_entry_serializable_str_spliterator_card4, (java.lang.Comparable<org.cs362.dominion.Card.CardName>)cardName86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_iterable_entry_serializable_str_spliterator_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_spliterator_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_spliterator_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName44.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    org.junit.Assert.assertTrue("'" + cardName49 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName49.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array56);
    org.junit.Assert.assertTrue("'" + cardName57 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName57.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}"+ "'", str83.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    org.junit.Assert.assertTrue("'" + cardName86 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName86.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparable_cardName89);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test48"); }

    java.util.LinkedList<java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>> linkedlist_abstractcollection_arraylist_arraylist_comparable_str0 = new java.util.LinkedList<java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>>>();
    java.util.AbstractCollection<java.util.ArrayList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>> abstractcollection_arraylist_arraylist_comparable_str1 = linkedlist_abstractcollection_arraylist_arraylist_comparable_str0.peekLast();
    java.lang.Object obj2 = linkedlist_abstractcollection_arraylist_arraylist_comparable_str0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(abstractcollection_arraylist_arraylist_comparable_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test49"); }

    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card1 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card3 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> linkedlist_arraylist_iterable_card4 = new java.util.LinkedList<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>>();
    boolean b5 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card1);
    boolean b6 = linkedlist_arraylist_iterable_card4.add(arraylist_iterable_card3);
    java.util.Iterator<java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>> iterator_arraylist_iterable_card7 = linkedlist_arraylist_iterable_card4.descendingIterator();
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card9 = new java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>>(0);
    java.util.ListIterator<java.lang.Iterable<org.cs362.dominion.Card>> listiterator_iterable_card10 = arraylist_iterable_card9.listIterator();
    boolean b11 = linkedlist_arraylist_iterable_card4.offer(arraylist_iterable_card9);
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card12 = linkedlist_arraylist_iterable_card4.peekLast();
    java.util.ArrayList<java.lang.Iterable<org.cs362.dominion.Card>> arraylist_iterable_card13 = linkedlist_arraylist_iterable_card4.pop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_arraylist_iterable_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_iterable_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_iterable_card13);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test50"); }

    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str0 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str1 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> arraylist_entry_iterable_entry_serializable_str_spliterator_card2 = new java.util.ArrayList<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>>();
    arraylist_entry_iterable_entry_serializable_str_spliterator_card2.ensureCapacity(2);
    java.util.ListIterator<java.util.Map.Entry<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>> listiterator_entry_iterable_entry_serializable_str_spliterator_card5 = arraylist_entry_iterable_entry_serializable_str_spliterator_card2.listIterator();
    int i6 = linkedlist_iterator_entry_serializable_str1.indexOf((java.lang.Object)arraylist_entry_iterable_entry_serializable_str_spliterator_card2);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str7 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str8 = arraylist_entry_serializable_str7.stream();
    arraylist_entry_serializable_str7.clear();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str10 = arraylist_entry_serializable_str7.iterator();
    java.util.ArrayList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> arraylist_iterator_entry_serializable_str11 = new java.util.ArrayList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b12 = arraylist_iterator_entry_serializable_str11.add(iterator_entry_serializable_str10);
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str13 = org.cs362.dominion.Randomness.randomMember((java.util.List<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)arraylist_iterator_entry_serializable_str11);
    java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_iterator_entry_serializable_str14 = new java.util.LinkedList<java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    boolean b15 = linkedlist_iterator_entry_serializable_str14.add(iterator_entry_serializable_str13);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str17 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str18 = arraylist_entry_serializable_str17.stream();
    arraylist_entry_serializable_str17.clear();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str20 = arraylist_entry_serializable_str17.iterator();
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str21 = linkedlist_iterator_entry_serializable_str14.set((int)(byte)0, iterator_entry_serializable_str20);
    boolean b22 = linkedlist_iterator_entry_serializable_str1.offerLast(iterator_entry_serializable_str21);
    java.util.Iterator<java.util.Map.Entry<java.io.Serializable,java.lang.String>> iterator_entry_serializable_str23 = linkedlist_iterator_entry_serializable_str1.peekLast();
    boolean b24 = linkedlist_iterator_entry_serializable_str0.add(iterator_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_entry_iterable_entry_serializable_str_spliterator_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test51"); }

    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj0 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>();
    linkedlist_abstractlist_obj0.clear();
    java.util.LinkedList<java.lang.Object> linkedlist_obj2 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card3 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b4 = linkedlist_obj2.offerLast((java.lang.Object)arraylist_card3);
    java.lang.Object obj5 = linkedlist_obj2.removeLast();
    java.lang.Object obj6 = linkedlist_obj2.peekFirst();
    java.lang.Object obj7 = linkedlist_obj2.pollFirst();
    java.lang.Object obj8 = linkedlist_obj2.peekFirst();
    boolean b9 = linkedlist_abstractlist_obj0.offerLast((java.util.AbstractList<java.lang.Object>)linkedlist_obj2);
    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj10 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>();
    linkedlist_abstractlist_obj10.clear();
    boolean b12 = linkedlist_abstractlist_obj0.addAll((java.util.Collection<java.util.AbstractList<java.lang.Object>>)linkedlist_abstractlist_obj10);
    java.util.Iterator<java.util.AbstractList<java.lang.Object>> iterator_abstractlist_obj13 = linkedlist_abstractlist_obj0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_abstractlist_obj13);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test52"); }

    java.util.LinkedList<java.lang.Object> linkedlist_obj0 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = linkedlist_obj0.offerLast((java.lang.Object)arraylist_card1);
    java.lang.Object obj3 = linkedlist_obj0.pollLast();
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card5 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>((int)(byte)10);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str7 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b9 = hashmap_serializable_str7.equals((java.lang.Object)1.0d);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str10 = new java.util.HashMap<java.io.Serializable,java.lang.String>((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str7);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str12 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b14 = hashmap_serializable_str12.equals((java.lang.Object)1.0d);
    int i15 = hashmap_serializable_str12.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str16 = hashmap_serializable_str12.entrySet();
    boolean b17 = hashmap_serializable_str10.equals((java.lang.Object)set_entry_serializable_str16);
    boolean b18 = arraylist_abstractcollection_card5.removeAll((java.util.Collection<java.util.Map.Entry<java.io.Serializable,java.lang.String>>)set_entry_serializable_str16);
    java.lang.Object[] obj_array19 = arraylist_abstractcollection_card5.toArray();
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    int i23 = arraylist_card21.size();
    boolean b25 = arraylist_card21.equals((java.lang.Object)(-1.0f));
    boolean b26 = arraylist_abstractcollection_card5.containsAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21);
    java.util.Spliterator<java.util.AbstractCollection<org.cs362.dominion.Card>> spliterator_abstractcollection_card27 = arraylist_abstractcollection_card5.spliterator();
    boolean b28 = linkedlist_obj0.offerFirst((java.lang.Object)spliterator_abstractcollection_card27);
    java.lang.Object obj29 = linkedlist_obj0.getLast();
    java.lang.Object obj30 = linkedlist_obj0.getFirst();
    linkedlist_obj0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_abstractcollection_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test53"); }

    java.util.HashMap<java.util.Collection<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.AbstractList<java.util.AbstractList<java.lang.Object>>> hashmap_collection_arraylist_entry_serializable_str_abstractlist_abstractlist_obj0 = new java.util.HashMap<java.util.Collection<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>,java.util.AbstractList<java.util.AbstractList<java.lang.Object>>>();
    java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_arraylist_entry_serializable_str1 = new java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> linkedlist_arraylist_entry_serializable_str2 = new java.util.LinkedList<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>();
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str3 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    int i4 = arraylist_entry_serializable_str3.size();
    java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>> hashmap_iterable_entry_serializable_str_spliterator_card5 = new java.util.HashMap<java.lang.Iterable<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.Spliterator<org.cs362.dominion.Card>>();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable7 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    java.lang.String str8 = hashmap_type_cloneable7.toString();
    java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable> hashmap_type_cloneable10 = new java.util.HashMap<org.cs362.dominion.Card.Type,java.lang.Cloneable>(10);
    boolean b12 = hashmap_type_cloneable10.containsValue((java.lang.Object)'#');
    org.cs362.dominion.Card.Type type13 = org.cs362.dominion.Card.Type.TREASURE;
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    org.cs362.dominion.Card.CardName cardName17 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i18 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    org.cs362.dominion.Card.CardName cardName22 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i23 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card20, cardName22);
    org.cs362.dominion.Card[] card_array24 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card25, card_array24);
    int i27 = arraylist_card25.size();
    java.util.RandomAccess[] randomAccess_array28 = new java.util.RandomAccess[] { arraylist_card20, arraylist_card25 };
    java.util.RandomAccess[] randomAccess_array29 = arraylist_card15.toArray(randomAccess_array28);
    org.cs362.dominion.Card.CardName cardName30 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card31 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card15, cardName30);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str33 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b35 = hashmap_serializable_str33.equals((java.lang.Object)1.0d);
    int i36 = hashmap_serializable_str33.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str37 = hashmap_serializable_str33.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str39 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b41 = hashmap_serializable_str39.equals((java.lang.Object)1.0d);
    hashmap_serializable_str33.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str39);
    java.util.HashMap[] hashMap_array44 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array45 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array44;
    hashmap_serializable_str_array45[0] = hashmap_serializable_str39;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array48 = arraylist_card15.toArray(hashmap_serializable_str_array45);
    java.lang.Cloneable cloneable49 = hashmap_type_cloneable10.replace(type13, (java.lang.Cloneable)hashmap_serializable_str_array45);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    org.cs362.dominion.Card.CardName cardName53 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i54 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card51, cardName53);
    java.util.List<org.cs362.dominion.Card> list_card55 = org.cs362.dominion.Card.createCards();
    boolean b56 = arraylist_card51.contains((java.lang.Object)list_card55);
    int i58 = arraylist_card51.indexOf((java.lang.Object)(byte)10);
    java.lang.Cloneable cloneable59 = hashmap_type_cloneable7.put(type13, (java.lang.Cloneable)arraylist_card51);
    java.util.Spliterator<org.cs362.dominion.Card> spliterator_card60 = hashmap_iterable_entry_serializable_str_spliterator_card5.remove((java.lang.Object)cloneable59);
    java.lang.Object obj61 = hashmap_iterable_entry_serializable_str_spliterator_card5.clone();
    int i62 = arraylist_entry_serializable_str3.indexOf(obj61);
    boolean b63 = linkedlist_arraylist_entry_serializable_str2.offerLast(arraylist_entry_serializable_str3);
    boolean b64 = linkedlist_arraylist_entry_serializable_str1.addAll((java.util.Collection<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)linkedlist_arraylist_entry_serializable_str2);
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str65 = null;
    linkedlist_arraylist_entry_serializable_str2.push(arraylist_entry_serializable_str65);
    java.util.ArrayList<java.util.AbstractList<java.lang.Object>> arraylist_abstractlist_obj68 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>((int)'4');
    java.util.ArrayList<java.util.AbstractList<java.lang.Object>> arraylist_abstractlist_obj70 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>((int)'4');
    boolean b71 = arraylist_abstractlist_obj68.addAll((java.util.Collection<java.util.AbstractList<java.lang.Object>>)arraylist_abstractlist_obj70);
    java.lang.Object[] obj_array72 = arraylist_abstractlist_obj70.toArray();
    java.util.LinkedList<java.util.AbstractList<java.lang.Object>> linkedlist_abstractlist_obj73 = new java.util.LinkedList<java.util.AbstractList<java.lang.Object>>();
    linkedlist_abstractlist_obj73.clear();
    java.util.LinkedList<java.lang.Object> linkedlist_obj75 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card76 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b77 = linkedlist_obj75.offerLast((java.lang.Object)arraylist_card76);
    java.lang.Object obj78 = linkedlist_obj75.removeLast();
    java.lang.Object obj79 = linkedlist_obj75.peekFirst();
    java.lang.Object obj80 = linkedlist_obj75.pollFirst();
    java.lang.Object obj81 = linkedlist_obj75.peekFirst();
    boolean b82 = linkedlist_abstractlist_obj73.offerLast((java.util.AbstractList<java.lang.Object>)linkedlist_obj75);
    java.lang.Object[] obj_array83 = linkedlist_abstractlist_obj73.toArray();
    java.lang.Object[] obj_array84 = linkedlist_abstractlist_obj73.toArray();
    boolean b85 = hashmap_collection_arraylist_entry_serializable_str_abstractlist_abstractlist_obj0.replace((java.util.Collection<java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)linkedlist_arraylist_entry_serializable_str2, (java.util.AbstractList<java.util.AbstractList<java.lang.Object>>)arraylist_abstractlist_obj70, (java.util.AbstractList<java.util.AbstractList<java.lang.Object>>)linkedlist_abstractlist_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type13.equals(org.cs362.dominion.Card.Type.TREASURE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    org.junit.Assert.assertTrue("'" + cardName17 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName17.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    org.junit.Assert.assertTrue("'" + cardName22 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName22.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array29);
    org.junit.Assert.assertTrue("'" + cardName30 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName30.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    org.junit.Assert.assertTrue("'" + cardName53 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName53.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloneable59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(spliterator_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test54"); }

    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str2 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str2.clear();
    java.util.Collection<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> collection_set_entry_serializable_str4 = hashmap_randomAccess_array_set_entry_serializable_str2.values();
    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str7 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str7.clear();
    java.util.Collection<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> collection_set_entry_serializable_str9 = hashmap_randomAccess_array_set_entry_serializable_str7.values();
    java.util.Collection<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> collection_set_entry_serializable_str10 = hashmap_randomAccess_array_set_entry_serializable_str7.values();
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str11 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str12 = arraylist_entry_serializable_str11.stream();
    java.lang.Object obj13 = arraylist_entry_serializable_str11.clone();
    java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>> arraylist_entry_player_i14 = new java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>();
    boolean b15 = arraylist_entry_serializable_str11.retainAll((java.util.Collection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>)arraylist_entry_player_i14);
    java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> hashmap_randomAccess_array_set_entry_serializable_str18 = new java.util.HashMap<java.util.RandomAccess[],java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>((int)(byte)10, (float)(short)1);
    hashmap_randomAccess_array_set_entry_serializable_str18.clear();
    java.util.Collection<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>> collection_set_entry_serializable_str20 = hashmap_randomAccess_array_set_entry_serializable_str18.values();
    boolean b21 = arraylist_entry_player_i14.retainAll(collection_set_entry_serializable_str20);
    java.util.ArrayList<java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> arraylist_iterable_set_entry_serializable_str22 = new java.util.ArrayList<java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>>();
    boolean b23 = arraylist_iterable_set_entry_serializable_str22.add((java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)collection_set_entry_serializable_str4);
    boolean b24 = arraylist_iterable_set_entry_serializable_str22.add((java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)collection_set_entry_serializable_str10);
    boolean b25 = arraylist_iterable_set_entry_serializable_str22.add((java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>)collection_set_entry_serializable_str20);
    java.util.ListIterator<java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> listiterator_iterable_set_entry_serializable_str26 = arraylist_iterable_set_entry_serializable_str22.listIterator();
    java.util.Random random27 = org.cs362.dominion.Randomness.random;
    org.cs362.dominion.Randomness.random = random27;
    boolean b29 = arraylist_iterable_set_entry_serializable_str22.contains((java.lang.Object)random27);
    java.util.function.UnaryOperator<java.lang.Iterable<java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>>>> unaryoperator_iterable_set_entry_serializable_str30 = null;
    // The following exception was thrown during execution in test generation
    try {
    arraylist_iterable_set_entry_serializable_str22.replaceAll(unaryoperator_iterable_set_entry_serializable_str30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_set_entry_serializable_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_set_entry_serializable_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_set_entry_serializable_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_set_entry_serializable_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(listiterator_iterable_set_entry_serializable_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(random27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test55"); }

    java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>> hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2 = new java.util.HashMap<java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>>,java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>>>((int)'4', (float)'a');
    java.util.LinkedList<java.lang.Object> linkedlist_obj3 = new java.util.LinkedList<java.lang.Object>();
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card4 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b5 = linkedlist_obj3.offerLast((java.lang.Object)arraylist_card4);
    java.lang.Object obj6 = linkedlist_obj3.removeLast();
    boolean b7 = linkedlist_obj3.isEmpty();
    java.lang.Object obj8 = linkedlist_obj3.poll();
    java.lang.Object[] obj_array9 = linkedlist_obj3.toArray();
    java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>> arraylist_entry_serializable_str10 = new java.util.ArrayList<java.util.Map.Entry<java.io.Serializable,java.lang.String>>();
    java.util.stream.Stream<java.util.Map.Entry<java.io.Serializable,java.lang.String>> stream_entry_serializable_str11 = arraylist_entry_serializable_str10.stream();
    java.lang.Object obj12 = arraylist_entry_serializable_str10.clone();
    java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>> arraylist_entry_player_i13 = new java.util.ArrayList<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>();
    boolean b14 = arraylist_entry_serializable_str10.retainAll((java.util.Collection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>)arraylist_entry_player_i13);
    boolean b15 = linkedlist_obj3.removeAll((java.util.Collection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>)arraylist_entry_player_i13);
    java.util.LinkedList<java.util.AbstractCollection<java.util.Map.Entry<org.cs362.dominion.Player,java.lang.Integer>>> linkedlist_abstractcollection_entry_player_i16 = hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2.remove((java.lang.Object)b15);
    java.lang.Object obj17 = null;
    boolean b19 = hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2.remove(obj17, (java.lang.Object)(short)10);
    boolean b20 = hashmap_stream_entry_serializable_str_linkedlist_abstractcollection_entry_player_i2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_entry_serializable_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(linkedlist_abstractcollection_entry_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test56"); }

    org.cs362.dominion.Card[] card_array0 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card1 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card1, card_array0);
    org.cs362.dominion.Card.CardName cardName3 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i4 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    org.cs362.dominion.Card.CardName cardName8 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i9 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card6, cardName8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    int i13 = arraylist_card11.size();
    java.util.RandomAccess[] randomAccess_array14 = new java.util.RandomAccess[] { arraylist_card6, arraylist_card11 };
    java.util.RandomAccess[] randomAccess_array15 = arraylist_card1.toArray(randomAccess_array14);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card1, cardName16);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str19 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b21 = hashmap_serializable_str19.equals((java.lang.Object)1.0d);
    int i22 = hashmap_serializable_str19.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str23 = hashmap_serializable_str19.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str25 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b27 = hashmap_serializable_str25.equals((java.lang.Object)1.0d);
    hashmap_serializable_str19.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str25);
    java.util.HashMap[] hashMap_array30 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array31 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array30;
    hashmap_serializable_str_array31[0] = hashmap_serializable_str25;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array34 = arraylist_card1.toArray(hashmap_serializable_str_array31);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card35 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b36 = arraylist_abstractcollection_card35.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card1);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card37 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card35);
    java.lang.Object[] obj_array38 = linkedlist_abstractcollection_card37.toArray();
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i43 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName42);
    org.cs362.dominion.Card[] card_array44 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card45 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card45, card_array44);
    org.cs362.dominion.Card.CardName cardName47 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i48 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card45, cardName47);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    int i52 = arraylist_card50.size();
    java.util.RandomAccess[] randomAccess_array53 = new java.util.RandomAccess[] { arraylist_card45, arraylist_card50 };
    java.util.RandomAccess[] randomAccess_array54 = arraylist_card40.toArray(randomAccess_array53);
    org.cs362.dominion.Card.CardName cardName55 = org.cs362.dominion.Card.CardName.Gold;
    org.cs362.dominion.Card card56 = org.cs362.dominion.Card.getCard((java.util.List<org.cs362.dominion.Card>)arraylist_card40, cardName55);
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str58 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b60 = hashmap_serializable_str58.equals((java.lang.Object)1.0d);
    int i61 = hashmap_serializable_str58.size();
    java.util.Set<java.util.Map.Entry<java.io.Serializable,java.lang.String>> set_entry_serializable_str62 = hashmap_serializable_str58.entrySet();
    java.util.HashMap<java.io.Serializable,java.lang.String> hashmap_serializable_str64 = new java.util.HashMap<java.io.Serializable,java.lang.String>((int)'4');
    boolean b66 = hashmap_serializable_str64.equals((java.lang.Object)1.0d);
    hashmap_serializable_str58.putAll((java.util.Map<java.io.Serializable,java.lang.String>)hashmap_serializable_str64);
    java.util.HashMap[] hashMap_array69 = new java.util.HashMap[ 1 ];
    @SuppressWarnings("unchecked")
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array70 = (java.util.HashMap<java.io.Serializable,java.lang.String>[])hashMap_array69;
    hashmap_serializable_str_array70[0] = hashmap_serializable_str64;
    java.util.HashMap<java.io.Serializable,java.lang.String>[] hashmap_serializable_str_array73 = arraylist_card40.toArray(hashmap_serializable_str_array70);
    java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>> arraylist_abstractcollection_card74 = new java.util.ArrayList<java.util.AbstractCollection<org.cs362.dominion.Card>>();
    boolean b75 = arraylist_abstractcollection_card74.add((java.util.AbstractCollection<org.cs362.dominion.Card>)arraylist_card40);
    java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>> linkedlist_abstractcollection_card76 = new java.util.LinkedList<java.util.AbstractCollection<org.cs362.dominion.Card>>((java.util.Collection<java.util.AbstractCollection<org.cs362.dominion.Card>>)arraylist_abstractcollection_card74);
    java.lang.Object[] obj_array77 = linkedlist_abstractcollection_card76.toArray();
    java.util.AbstractCollection<org.cs362.dominion.Card> abstractcollection_card78 = linkedlist_abstractcollection_card76.getLast();
    linkedlist_abstractcollection_card37.addFirst(abstractcollection_card78);
    org.cs362.dominion.Card[] card_array80 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card81 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81, card_array80);
    org.cs362.dominion.Card.CardName cardName83 = org.cs362.dominion.Card.CardName.Great_Hall;
    int i84 = org.cs362.dominion.Card.getCardIndex((java.util.List<org.cs362.dominion.Card>)arraylist_card81, cardName83);
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.createCards();
    boolean b86 = arraylist_card81.contains((java.lang.Object)list_card85);
    int i88 = arraylist_card81.indexOf((java.lang.Object)(byte)10);
    boolean b89 = abstractcollection_card78.containsAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card81);
    org.cs362.dominion.GameState gameState90 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card81);
    java.util.List<org.cs362.dominion.Card> list_card91 = gameState90.cards;
    boolean b92 = gameState90.isGameOver();
    java.util.List<org.cs362.dominion.Player> list_player93 = gameState90.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i94 = gameState90.play();
    java.util.List<org.cs362.dominion.Card> list_card95 = gameState90.embargo;
    org.cs362.dominion.GameState gameState96 = gameState90.clone();
    java.util.List<org.cs362.dominion.Card> list_card97 = gameState96.cards;
    gameState96.initializeGame();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i99 = gameState96.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName42.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    org.junit.Assert.assertTrue("'" + cardName47 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName47.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(randomAccess_array54);
    org.junit.Assert.assertTrue("'" + cardName55 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName55.equals(org.cs362.dominion.Card.CardName.Gold));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_serializable_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_serializable_str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractcollection_card78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    org.junit.Assert.assertTrue("'" + cardName83 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName83.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(list_card95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i99);

  }

}
