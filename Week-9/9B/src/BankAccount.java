class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted an invalid deposit.");
        }
    }

   
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " | Insufficient funds.");
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted an invalid withdrawal.");
        }
    }


    public synchronized double getBalance() {
        return balance;
    }
}

class UserTransaction implements Runnable {
    private final BankAccount account;
    private final String transactionType;
    private final double amount;

    public UserTransaction(BankAccount account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        if ("deposit".equalsIgnoreCase(transactionType)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(transactionType)) {
            account.withdraw(amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted an invalid transaction.");
        }
    }
}

class BankAccountManager {
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
