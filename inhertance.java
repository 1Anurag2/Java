class student{
    int roll , marks;
    String name;
    void input(){
        System.out.println("Enter the roll number and name and marks");
    }
}
class friend extends student{
    int a = 5, b = 11;
    void sum(){
         System.out.println("Sum of the numbers " + (a+b));
    }
}
class multiply extends friend{
    void mul(){
        System.out.println("Multiply of the numbers " + (a*b));
    }
}
class topper extends multiply{
    void display(){
     System.out.println("11 "+" Anurag Verma "+" 8.46");
    }
}
    class inhertance{
    public static void main(String[] args) {
        topper r = new topper();
        r.input();
        r.display();
        r.mul();
        r.sum(  );
    }
}
