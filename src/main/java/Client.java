public class Client {

    private String fullName;
    private int age;
    private double wallet;

    public Client(String fullName,int age,double wallet){
        this.fullName = fullName;
        this.age = age;
        this.wallet = wallet;
    }

    public String getName(){
        return this.fullName;
    }

    public double getWalletAmount(){
        return this.wallet;
    }


}
