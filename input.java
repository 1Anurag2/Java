import java.util.Scanner;
class input {
    public static void main(String[] args){
        int x,y;
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the first number" );
            x=obj.nextInt();
            System.out.println("Enter the second number");
            y=obj.nextInt();
        }
        System.out.println("Sum of the number " +(x+y));
    }
}