# Common Elements in Two Sorted Arrays

## Question

    I/P: arr1 = {13, 27, 35, 40, 49, 55, 59};
         arr2 = {17, 35, 39, 40, 55, 58, 60};

    O/P: 35 40 55

## Solution

    Step 1: Attatch 1 pointer to each array, Therefore, total 2 pointers
    Step 2: Move the pointer forward which ever has smallest value.
    Step 3: If found same return it
    Step 4: Iterate till end of the array

## Code

```java

static void fun(int[] arr1, int[] arr2){
    int i = 0, j = 0;
    while(i!=arr1.length-1 || j!=arr2.length-1){
        if(arr1[i]==arr2[j])
            System.out.print(arr1[i++] + " ");
        else if(arr1[i]<arr2[j]) i++;
        else j++;
    }
}

```
