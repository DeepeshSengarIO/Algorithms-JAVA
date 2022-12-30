# Zero Matrix

# Question

    Write an algorithm such that if an element in an MxN Matrix is 0, its entire row and column are set to 0.

    I/P: arr =  1 1 2
                0 3 5
                4 5 8

    O/P: 0 1 2
         0 0 0
         0 5 8

# Solution

    Step 1: Make a boolean matrix of similar size setting all initial values to false, run a loop through arr
    Step 2: if current value in arr is 0, mark the same index in boolean matrix as true
    Step 3: Again run the loop, check if the value in boolean matrix is zero
    Step 4: Make the whole row and column as 0 in the arr matrix.

# Code

```java

static int[][] fun(int[][] arr){

    boolean[][] temp = new boolean[arr.length][arr[0].length];
    for(int i = 0; i < arr.length; i++)
        for(int j = 0; j < arr[0].length; j++)
            if(arr[i][j]==0) temp[i][j] = true;

    for(int i = 0; i < arr.length; i++){

        for(int j = 0; j < arr[0].length; j++){

            if(temp[i][j]){
                for(int k = 0; k < arr.length; k++){
                    arr[i][k] = 0;
                    arr[k][j] = 0;
                }
            }

        }
    }
    return arr;
}

```
