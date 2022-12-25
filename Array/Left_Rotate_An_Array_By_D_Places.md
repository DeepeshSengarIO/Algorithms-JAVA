# Left rotate an array by D Places

## Question

    Case 1
    I/P :   arr[] = {1,2,3,4,5}
                d = 2
    O/P :   arr[] = {3,4,5,1,2}

    Case 2
    I/P :   arr[] = {10,5,30,15}
                d = 3
    O/P :   arr[] = {15,10,5,30}

    Assumption: d <= n (number of elements)

## Solution

    Step 1: reverse the array from 0 to d-1 index.
    Step 2: reverse the array from d to n-1 index.
    Step 3: reverse the array from 0 to n-1 index.

## Code

```

static int[] rotate(int[] arr, int d){
    arr = reverse(arr, 0, d-1);
    arr = reverse(arr, d, arr.length-1);
    arr = reverse(arr, 0, arr.length-1);
    return arr;
}

static int[] reverse(int[] arr, int start, int end){
    while(start<=end){
        int x = arr[start];
        arr[start++] = arr[end];
        arr[end--] = x;
    }
    return arr;
}

```
