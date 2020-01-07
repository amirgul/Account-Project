public class Main
{

    public static void main(String[] args)
    {
        SavingAccount.setInterestRate(0.01);
        SavingAccount mySavings = new SavingAccount();
        SavingAccount yourSavings = new SavingAccount();
        System.out.println("i depostit 10.75");
        mySavings.deposit(10.75);
        System.out.println("you depost 75");
        yourSavings.deposit(75.00);
        System.out.println("you deposit 55");
        yourSavings.deposit(55.0);
        double cash = yourSavings.withDraw(15.75);
        System.out.println("you withdraw: " + cash);
        if(yourSavings.getBalance() >100.0)
        {
            System.out.println("you received interest");
            yourSavings.addInterest();
        }
        System.out.println("your saving is: "+ yourSavings.getBalance());
        System.out.println("my saving is: ");
        SavingAccount.showBalance(mySavings);
        System.out.println();
        int count = SavingAccount.getNumberOfAccounts();
        System.out.println("we opeened: "+ count + " Saving account today");


    }
}
