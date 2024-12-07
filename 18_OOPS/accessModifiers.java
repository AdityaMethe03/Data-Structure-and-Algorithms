public class accessModifiers{

    public static void main(String[] args) {
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aditya";
        myAcc.setPassword("asdfghjkl");
    }

}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}