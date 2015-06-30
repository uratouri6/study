
public class fibo {
    public static void main(String[] args){
        long x1=1;
        long x2=1;
        long temp;
        int n=10;

        System.out.println(x1+"\n"+x2);

        for(int i=0;i<n;i++){
            temp=x2;
            x2+=x1;
            System.out.println(x2);
            x1=temp;
        }
    }
}
