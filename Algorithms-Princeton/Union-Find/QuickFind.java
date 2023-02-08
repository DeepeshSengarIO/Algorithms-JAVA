import java.util.Arrays;

class QuickFind {

    private int[] arr;

    public QuickFind(int N){
        arr = new int[N];
        for(int i = 0 ; i < arr.length; i++)
            arr[i] = i;
    }

    public void union(int x, int y){

        // for(int i = 0;i < arr.length; i++)
        //     if(arr[i]==arr[x])
        //         arr[i] = arr[y];
        arr[y] = arr[x];
    }

    public boolean isConnected(int x, int y){
        return arr[x] == arr[y];
    }

    public int[] getArr(){
        return arr;
    }

    public static void main(String[] args) {
        QuickFind QF = new QuickFind(10);
        QF.union(0, 5);
        QF.union(5, 6);
        QF.union(6, 1);
        QF.union(1, 2);
        QF.union(2, 7);
        QF.union(8, 3);
        QF.union(3, 4);
        QF.union(4, 9);
        System.out.println(Arrays.toString(QF.getArr()));
    }
    
}
