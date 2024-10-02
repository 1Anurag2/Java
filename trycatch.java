class trycatch {
    public static void main(String[] args) {
       try{
            System.out.println("try");
            int a = 5,b=1,c;
              c = a/b;
             System.out.println(c);
             System.out.println("It is try block");
       }
       catch(ArithmeticException r){
          System.out.println("It is not divided by zero");
       }
       finally{
        System.out.println("It is always exceuted ");
       }
       System.out.println("Main method is ended ");
    }
}