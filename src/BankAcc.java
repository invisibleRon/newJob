public class BankAcc {

private String accNumber;
private double balance;
private String Customer_name;
private String Customer_email;
private String Customer_Phonenumber;

public BankAcc(String accNumber, double balance, String Customer_name, String Customer_email, String Customer_Phonenumber){
    this.accNumber = accNumber;
    this.balance = balance;
    this.Customer_name = Customer_name;
    this.Customer_email = Customer_email;
    this.Customer_Phonenumber = Customer_Phonenumber;
}

public void setAccNumber(String accNumber){
    this.accNumber = accNumber;
}
public String getAccNumber(){
       return this.accNumber;
    }
public void setBalance(double balance){
    this.balance = balance;
    }
public double getBalance() {
    return this.balance;
}
public void setCustomer_name(String Customer_name){
    this.Customer_name = Customer_name;
}
public String getCustomer_name(){
    return this.Customer_name;
}
public void setCustomer_email(String customer_email){
    this.Customer_email = Customer_email;
}
public String getCustomer_email(){
    return this.Customer_email;
    }
public void setCustomer_Phonenumber(String Customer_Phonenumber) {
    this.Customer_Phonenumber = Customer_Phonenumber;
}
public String getCustomer_Phonenumber(){
    return this.Customer_Phonenumber;
}
public void deposit(double depositAmount){
    this.balance += depositAmount;
}
public void withdraw(double withdrawFund){
    if(balance-withdrawFund<0){
        System.out.println("Insufficient Fund");
    }else{
        this.balance -= withdrawFund;
    }
}
public void transaction(){

}


}
