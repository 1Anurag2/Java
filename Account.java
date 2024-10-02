 class MainAccount {
    int acc_no;
    String name ;
    float amount ;
    void insert(int a , String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println("Deposited amount " +amt);
    }
    void withdraw(float money){
        if(amount<money){
            System.out.println("Insuficiant money");
        }
        else{
            amount = amount - money;
            System.out.println("withdraw amount " +money);
        }
    }
    void checkBalance(){
        System.out.println("Available blance " +amount);
    }
    void acountinformation(){
       System.out.printf("Name of the bank holder " +name  +" Account number "+acc_no +" Aviable blance "+amount);
    }
}
class Account{
    public static void main(String[] args){
        MainAccount r1 = new MainAccount();
        r1.insert(210026663 ,"Anurag Verma" ,5400);
        r1.deposit(2400);
        r1.withdraw(500);
        r1.checkBalance();
        r1.acountinformation();
    }
}