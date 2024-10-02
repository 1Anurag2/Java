class A implements Runnable{
    public void run(){
        try{
            for(int i=0; i<=5;i++){
                System.out.println("Enter the first number ");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException i){
        }
    }
}
public class multithread1 {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        Thread t = new Thread(obj);
        t.start();
        for(int i=0;i<=7;i++){
            System.out.println("Enter the second number");
            Thread.sleep(6000);
        }
    }
}
