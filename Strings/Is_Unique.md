# Is Unique

## Question

    Implement an algorith to determine is a string has all unique characters
    You can not use addtional data structures.

    I/P: "abbcde"
    O/P: false

    I/P: "abdklfy"
    O/P: true

    Assumtion: All char in string are Lower Case

## Solution

    Step 1: Make an int array of 128 size assuming all chars in string are smaller case. If not, make array of size 256
    Step 2: iterate through array, increment the index of current "char" according to ASCII values.
    Step 3: If cuurent index value becomes greater than 1 return false
    Step 4: After the end of iteration, Return True

## Code

```java

static boolean fun(String str){
    int[] arr = new int[128];
    for(char c: str.toCharArray())
        if(++arr[c]>1) return false
    return true;
}

```
