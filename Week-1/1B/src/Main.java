public class Main {
    public static void main(String[] args) {
        BankingOperations operations = new BankingOperations();

        operations.viewBalance();

        UserSession.getInstance().login();
  
        operations.viewBalance();
        operations.deposit();
        operations.withdraw();

        UserSession.getInstance().logout();

        operations.viewBalance();
        operations.deposit();
        operations.withdraw();
    }
}
