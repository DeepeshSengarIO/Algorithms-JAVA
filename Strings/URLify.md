# URLify

## Question

    Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters.

    I/P: "Mr John Smith"
    O/P: "Mr%20John%20Smith"

## Solution

    Step 1: Make new string res
    Step 2: iterate throught given string, if found space character add '%20'

# Code

```java

static String fun(String str){
    StringBuffer res = new StringBuffer();
    for(char c: str.toCharArray()){
        if(c==' ') res.append("%20");
        else res.append(c);
    }
    return res.toString();
}

```
