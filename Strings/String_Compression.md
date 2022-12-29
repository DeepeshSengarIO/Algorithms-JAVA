# String Compression

## Question

    Implement a method to perform basic string compression using the counts of repeated characters. Return the original string is compressed string is bigger than the orginal string

    I/P: aabcccccaaa
    O/P: a2b1c5a3

    I/P: abcd
    O/P: abcd

## Solution

    Step 1: init StringBuilder res, countConsecutive = 0 and iterate through string
    Step 2: countConsecutive++
    Step 3: if index char != index+1 char || index+1 is greater than str length, then: res += current char + countConsecutive, set countConsecutive back to 0
    Step 4: return the smaller string between str and res

## Code

```java

static String fun(String str){

        StringBuilder res = new StringBuilder();
        int countConsecutive = 0;

        for(int i = 0; i < str.length(); i++){

            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i)!=str.charAt(i+1) ){
                res.append(str.charAt(i));
                res.append(countConsecutive);
                countConsecutive = 0;
            }

        }

        return res.length() < str.length() ? res.toString() : str;
    }

```
