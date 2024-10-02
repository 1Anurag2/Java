class Math{
    void sum(){
        int x = 5, y = 7;
        int c = x+y;
        System.out.println("Sum of the numbers " +c);
    }
    int sum(int x,int y){
        int d = x+y;
        return d;
    }
    void sum(int x,double y){
        double d = x+y;
        System.out.println(d);
    }
    void sum(double x,double y){
        double a = x+y;
        System.out.println(a);
    }
}
public class polymorphism_compiletime {
    public static void main(String[] args) {
        Math r = new Math();
        r.sum();
        int B = r.sum(4 ,6);
        System.out.println(B);
        r.sum(5,8.893);
        r.sum(5.567,8.84);
    }
}
