abstract class Animal {
     Animal() {
        System.out.println("All animal .....!");
    }
    public abstract void sound();
    public abstract void foot();
} 
abstract class dog extends Animal{
    dog(){
       super();
    }
    @Override                        // yha pr dono method ko override nahi kiya hai 
   public void sound(){      // jiske karan dog class abstract ban haya
        System.out.println("Dog is barking");
    }
}
class lion extends dog{
    @Override
    public void foot(){
        System.out.println("lion has four foot");
    }
}
// class lion extends Animal{
//     @Override
//     public void sound(){
//         System.out.println("lion is roaring");   // dono method ko abstract karna padhega nahi to lion vala class abstract class bn jayega 
//     }
//     public void foot(){
//         System.out.println("lion has four foot");
//     }
//     lion(){
//         super();
//     }
// }

public class Abstraction {
    public static void main(String[] args) {
        // dog r = new dog();
        lion l = new lion();
        l.sound();
        l.foot();
    }
}
