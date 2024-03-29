package demo;


public class Quuen8 {
    int max = 8;
    static int count = 0;
    int[] arr = new int[max];
    public static  void main(String[] args){
        Quuen8 quuen=new Quuen8();
        quuen.PutQuuen(0);
        System.out.println(count+"种摆法");
    }

    private void PutQuuen(int n){
        if(n==max){
            Print();
            return;
        }
        for (int i =0; i < max ; i++){
            arr[n] =i;
            if(judge(n)){
                PutQuuen(n+1);
            }
        }
    }

    private boolean judge(int n){
        for (int i = 0 ; i < n ; i++){
            if (arr[i]== arr[n]||Math.abs(n-i)==Math.abs(arr[i]-arr[n])){
                return false;
            }
        }
        return true;
    }

    private void Print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "); 
        }
        count++;
        System.out.println();
    }
}