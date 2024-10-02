import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        int a=0,b=1,c=0,n;
       try (Scanner r = new Scanner(System.in)){

            System.out.println("Enter the number upto nth fibonacci series :");
            n = r.nextInt();
            System.out.println("Fibonacci series : ");
            while(c<=n){
                System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
}