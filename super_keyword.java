class Math{
    int x = 5;
    Math(){
        System.out.println("Sum of two number ");
    }
}
class addition extends Math{
    // int x = 4;
    int y =6; 
    // System.out.println(super.x);
     addition(){
        super();
        System.out.println(" Hello Anurag ");
    }
    void show(){
        System.out.println("22cs11");
    }
   
}
public class super_keyword {
public static void main(String[] args) {
  addition r = new addition();
      r.show();
}
}
