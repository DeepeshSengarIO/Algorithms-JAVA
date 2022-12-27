# Count Distinct Pairs

## Question

    Given an array of distinct integer values. count the number of pairs of integers that have the difference k.

    I/P: arr = {1, 7, 5, 9, 2, 12, 3}
           k = 2

    O/P: (1, 3) (3, 5) (5, 7) (7, 9)

## Solution

    Step 1: Throw everything into the array in the hash table
    Step 2: Then, to look up if x+k, x-k exist in the array, we look it up inside the hash table

## Code

```java

static void countPairs(int[] arr, int k){
    HashSet<Integer> set = new HashSet<>();
    for(int i: arr) set.add(i);

    for(int x: arr)
        if(set.contains(x+k))
            System.out.print("("+x+", "+(x+k)+") ");
}

```
