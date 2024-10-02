class Animal{
    void dog(){
        System.out.println("It is a super class");
    }
}
class pet extends Animal{
    @Override
    void dog(){
        System.out.println("It is a sub class");
    }
}
class overiding{
    public static void main(String[] args){
        Animal r1 = new pet();   // yha pr refrence super class(Animal) ka and object sub class(pet) ka hoga 
        r1.dog();
    }
}