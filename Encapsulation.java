class student {
    private int age ; // data hidding

    public void setage(int x) { // data Abstraction
        age = x;
    }

    int getage() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        student r = new student();
        r.setage(21);
        int Age = r.getage();
        System.out.println("Age of the student : " + Age);
    }
}
