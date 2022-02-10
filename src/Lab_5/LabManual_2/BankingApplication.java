package Lab_5.LabManual_2;

class Account {
   public double money = 0; // starting with 0 Balance

    // depositing
    public void deposit(double dep) {
        this.money = dep + money;
//        System.out.println("after depositing " + dep + ", current money is : " + this.money);
    }

    public void withdraw(double wd) {
        if(wd<this.money) {
            this.money = money - wd;
//            System.out.println("after withdrawing " + wd + ", current money is : " + this.money);
        }
        else
            System.out.println("don't have enough money to withdraw");
    }

    public void checkMoney() {
        System.out.println("current money : " + this.money);
    }
}

public class BankingApplication {
    public static void main(String[] args)
    {
        //to create new acc(s)
        Account acc1 = new Account();

        acc1.deposit(10);
        acc1.withdraw(5);

        acc1.checkMoney();
    }
}
