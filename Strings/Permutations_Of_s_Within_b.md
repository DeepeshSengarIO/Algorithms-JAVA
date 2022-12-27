# Permutations of s within b

## Question

    What are the permutations of s within b

    I/P: s = abbc
         b = cbabadcbbabbcbabaabccbabc

    O/P: cbab cbba abbc bcba cbab cbab babc

## Solution

    Walk through b and look at sliding window of 4 characters

## Code

```java

static void fun(String s, String b){

    for(int i = 0; i <= b.length()-s.length(); i++){

        String str = "";

        for(int j = i; j < 4+i; j++){
            str+=b.charAt(j);
        }

        if(isPerm(str, s)){
            System.out.print(str+" ");
        }

    }
}

static boolean isPerm(String a, String b){

    int[] arr = new int[128];

    for(int i = 0; i < a.length(); i++){
        arr[a.charAt(i)]++; arr[b.charAt(i)]--;
    }

    for(int i = 0; i < 128; i++)
        if(arr[i]!=0) return false;

    return true;

}

```
