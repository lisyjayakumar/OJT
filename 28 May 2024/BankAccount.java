class Account{
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double initialbalance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialbalance;
}
public void deposit(double deposit){
    balance = balance + deposit;
    System.out.println("Your deposit amount is "+ deposit );

}
public void withdrow(double withdrow){
    if(balance > 0 && balance > withdrow){
        balance = balance - withdrow;
        System.out.println("Your withdrowal amount is : "+ withdrow);
    }
    
}
public void getblance(){
    if(balance > 0){
        System.out.println("Account Number  :" +accountNumber);
        System.out.println("Holde Name :" +holderName);
        System.out.println("Balance :" +balance);
    }
    else{
        System.out.println("Account Number  :" +accountNumber);
        System.out.println("Holde Name :" +holderName);
        System.out.println("Zero Balance");
    }
    
}
}

public class BankAccount{
    public static void main(String[] args){
        Account firstAccount = new Account("1001","lisy",2000);
        Account SecondAccount = new Account("1002","Ahalya",3000);
        
        //firstAccount.deposit(4500);
       // firstAccount.withdrow(3000);
       SecondAccount.withdrow(3000);
       SecondAccount.getblance();
        //firstAccount.deposit(1000);
    }

}