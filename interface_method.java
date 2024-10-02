import java.util.Scanner;
interface clients{
     void input();
     void output();
}
class Anurag implements clients{
    String name;
    double salary;
    public void input(){
    try(Scanner r = new Scanner(System.in)){

        System.out.println("Enter Username : ");
        name = r.nextLine();
        System.out.println("Enter the salary of user : ");
        salary = r.nextDouble();
    }
}
    public void output(){
        System.out.println(name+"  " + salary);
    }
}
public class interface_method {
    public static void main(String[] args) {
        clients y = new Anurag();
        y.input();
        y.output();
    }
}
