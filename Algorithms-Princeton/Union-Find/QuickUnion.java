public class QuickUnion {
    private int[] arr;
    public QuickUnion(int N){
        arr = new int[N];
        for(int i = 0; i < arr.length; i++)
            arr[i] = i;
    }
    public int[] getArr(){
        return arr;
    }
    public void find(int x, int y){
        int i = x;
        while(arr[i]!=i){}

    }
    public static void main(String[] args) {
        QuickUnion QU = new QuickUnion(10);

    }
}
