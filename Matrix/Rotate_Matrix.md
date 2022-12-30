# Rotate Matrix

## Question

    Given NxN Matrix
    Rotate matrix by 90 Degrees Anti-Clock Wise

## Solution

    Step 1: Find Transpose of a Matrix
    Step 2: Reverse the columns

# Code

```java

static int[][] rotate(int[][] arr){

    //Find Transpose of the matrix
    transpose(arr);

    //Reverse the Columns
    swapColumns(arr);

    //Print the Matrix
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[0].length; j++)
            System.out.print(arr[i][j]+" ");
        System.out.println();
    }

}

static int[][] transpose(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    return arr;
}

static int[][] swapColumns(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        int low = 0, high = arr.length - 1;
        while(low < high){
            int temp = arr[low][i];
            arr[low++][i] = arr[high][i];
            arr[high--][i] = temp;
        }
    }
    return arr;
}

```
