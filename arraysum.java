import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
       try (Scanner r = new Scanner(System.in)){
           System.out.println("Enter size of Array : ");
           int size = r.nextInt();
           // create array
           int[] arr = new int[size];
           // input array size
           
           // input array elements
           System.out.println("Enter array elements : ");
           for (int i = 0; i < size; i++) {
               arr[i] = r.nextInt();
            }
            
            // Display array elements
            System.out.println("Array elements are : ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
            // sum of the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array : "+sum);
    }
}
}
