# Subarray with 0 Sum

## Question

    Case 1
    I/P :   arr[] = {1,4,13,-3,-10,5}
    O/P :   True

    Case 2
    I/P :   arr[] = {3,1,-2,5,6}
    O/P :   False

    Example: Subarrays (contiguous elements only) of {10, 20, 30} are:
    {10}
    {10,20}
    {10,20,30}
    {20}
    {20,30}
    {30}

## Solution

    Use Prefix-Sum and Hashing

## Psuedo-Code

    init prefix_sum = 0
    init HashTable = []

    In each iteration i from 0 to n:

        prefix_sum = prefix_sum + arr[i]
        if prefix_sum found in HashTable return true
        if prefix_sum is 0 return true
        add prefix_sum to HashTable

    return false if loop ended and each item in HashTable is unique

## Code

```java

static boolean subarray_with_0_sum(int[] arr){

    int prefix_sum = 0;
    HashSet<Integer> hashTable = new HashSet<Integer>();

    for(int i: arr){
        prefix_sum+=i;
        if(hashTable.contains(prefix_sum)) return true;
        if(prefix_sum==0) return true;
        hashTable.add(prefix_sum);
    }

    return false;
}

```
