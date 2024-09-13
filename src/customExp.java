 class Bank
{

    private double balance;

    public Bank(double balance)
    {
        this.balance=balance;
    }

    //withdraw

    public double withdraw(double withdraw) {
        if (balance < withdraw) {
            throw new InsufficientBalanceException("You can not withdraw more money than you have..");

        }
        balance = balance - withdraw;
        return balance;
        //deposite
    }
    public double deposite(double deposite)
    {
        balance=balance+deposite;
        return balance;
    }

    //balance

    public double getBalance()
    {
        return balance;
    }
}

class InsufficientBalanceException extends RuntimeException{
     InsufficientBalanceException(String message){
         super(message);
     }
 }


public class customExp {
    public static void main(String[] args) {


        Bank b=new Bank(1000);
        double balace=b.getBalance();
        System.out.println("current balance: "+balace);

        //got pay 1500

        double balaceafterdeposite=b.deposite(1500);
        System.out.println("after 1500 deposite: "+balaceafterdeposite);


        try{
            b.withdraw(3000);
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }

        //overdraft
        System.out.println("total balance :"+b.getBalance());


    }
}
