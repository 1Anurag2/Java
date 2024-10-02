// By extending class
class A extends Thread {
    @Override
     public void run(){
        try{
        for(int i=0; i<=5;i++){
            System.out.println("Hello world...!");
           Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){

    }
 }

}
class D extends Thread {
    @Override
     public void run(){
        try{
        for(int i=0; i<=5;i++){
            System.out.println("Hello Anurag...!");
           Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){

    }
 }

}

class multithread {
    public static void main(String[] args) throws InterruptedException{
        A obj = new A();
        D obj1 = new D();
        obj.start();
        obj1.start();
        for (int i = 0; i <=8; i++) {
            System.out.println("🙏 Jai shri Ram 🙏");
            Thread.sleep(1000);
        }
    }
}
