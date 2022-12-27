# Generate Sort Kep Track of Median

## Question

    Numbers are randomly generated and stores into an expanding array. Also, keep track of the median.

         >> 2
         >> [2] Median = 2
         >> 5
         >> [2, 5] Median = 3.5
         >> 3
         >> [2, 3, 5] Median = 3

## Code

```java

static ArrayList<Integer> list;

public static void main(String[] args) {
    list = new ArrayList<>();
    fun(2);
    fun(5);
    fun(3);
}

static void fun(int x){
    list.add(x);
    Collections.sort(list);
    int n = list.size();
    if(n%2==0)
        System.out.print( ((double)(list.get(n/2) + list.get((n/2)-1))/2)+" " );
    else System.out.print( ((double)(list.get(n/2)))+" " );
}

```
