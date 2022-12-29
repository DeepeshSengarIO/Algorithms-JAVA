# One Away

## Question

    There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit away (or zero edits away)

    I/P: str1 = ple, str2 = pale
    O/P: true (add a to str1)

    I/P: str1 = pales, str2 = pale
    O/P: true (remove s from str1)

    I/P: str1 = pale, str2 = bale
    O/P: true (replace p to b from str1)

    I/P: str1 = pale, str2 = bae
    O/P: false

## Solution

    Replacement: Step 1: Initialize found as false
                 Step 2: iterate both strings simultaneously, if current index in str1 != current index in str2. mark found as true
                 Step 3: if found is false mark it as true (this means we found one replacement)
                 Step 4: if found is true (this means 2nd edit appeared) immidiately return false
                 Step 5: at the end of the loop return true


    Insertion:   Step 1: attacth 2 pointers index1, index2 to both strings
                 Step 2: iterate simultaneoulsy, if index1 of str1 != index2 of str2
                                                    if index1!=index2 return false
                                                    increment index2
                                                 else increment both indexes
                Step 3: return true if reached end of loop

    Removal:     Step 1: apply same Insertion. just reverse the str1 and str2. We will check if we can insert in str2.

## Code

```java

static boolean fun(String str1, String str2){

    // Length Check
    if(Math.abs(str1.length() - str2.length()) > 1) return false;

    String s1 = str1.length() < str2.length() ? str1 : str2; // shorter
    String s2 = str1.length() < str2.length() ? str2 : str1; // longer

    int index1 = 0, index2 = 0;
    boolean foundDifference = false;
    while(index1 < s1.length() && index2 < s2.length()){
        if(s1.charAt(index1) != s2.charAt(index2)){
            if(foundDifference) return false;
            foundDifference = true;
            if(s1.length() == s2.length()) index1++; //On replace, move shorter pointer
        }else index1++; // If matching, move shorter pointer
        index2++; //always move longer pointer
    }
    return true;
}

```
