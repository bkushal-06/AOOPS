public class BankingOperations {
    private UserSession userSession;
    public BankingOperations() {
        userSession = UserSession.getInstance();
    }
    public void viewBalance() {
        if (userSession.isLoggedIn()) {
            System.out.println("Viewing balance...");
        } else {
            System.out.println("Please log in to view balance.");
        }
    }
    public void deposit() {
        if (userSession.isLoggedIn()) {
            System.out.println("Depositing funds...");
        } else {
            System.out.println("Please log in to deposit funds.");
        }
    }
    public void withdraw() {
        if (userSession.isLoggedIn()) {
            System.out.println("Withdrawing funds...");
        } else {
            System.out.println("Please log in to withdraw funds.");
        }
    }
}
