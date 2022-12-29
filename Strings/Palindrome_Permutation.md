# Palindrome Permutation

## Question

    Given a String, write a function to ckeck if it is a permutation of palindrome. A palindrome is a word or phrase that is the same forward and backwords. A permutation is rearrangement of letters. The Palindrome does not need to be limited to just dictionary words. Input can be "taco% c#at" but you have to read it as "taco cat"

    I/P: str = Tact Coa
    O/P: True ("taco cat", "atco cta")

## Intuition

    For Palindrome, at max one odd character count is allowed. For example tacocat has 2 t, 2 a, 2 c and 1 o. Therefore, it can be arranged as a palindrome permuation.

## Solution

    Step 1: Initialize countOdd = 0, table[] array of 26 size
    Step 2: Iterate the str
    Step 3: Increment the index of char in table[]
    Step 4: if current index value % 2 == 1 increment countOdd, else decrement countOdd

## Code

```java

static boolean fun(String str){
    int countOdd = 0;
    int[] table = new int[26];
    for(char c: str.toCharArray()){
        int x = getCharValue(c);
        if(x!=-1){
            table[x]++;
            if(table[x]%2 == 1) countOdd++;
            else countOdd--;
        }
    }
    return countOdd <=1;
}

static int getCharValue(char c){
    int val = Character.getNumericValue(c);
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    if(val >= a && val <= z) return val - a;
    return -1;
}

```
