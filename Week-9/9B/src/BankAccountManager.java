public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Thread user1 = new Thread(new UserTransaction(sharedAccount, "deposit", 500), "User1");
        Thread user2 = new Thread(new UserTransaction(sharedAccount, "withdraw", 300), "User2");
        Thread user3 = new Thread(new UserTransaction(sharedAccount, "withdraw", 200), "User3");
        Thread user4 = new Thread(new UserTransaction(sharedAccount, "deposit", 700), "User4");
        Thread user5 = new Thread(new UserTransaction(sharedAccount, "withdraw", 1200), "User5");

    
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();


        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + sharedAccount.getBalance());
    }
}