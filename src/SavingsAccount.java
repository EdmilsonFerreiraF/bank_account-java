public class SavingsAccount extends Account {
    public SavingsAccount(String username, String cpf, String password) {
        super(username, cpf, password);
    } 
    
    @Override
    public void printStatement() {
        System.out.println("==== Bank statement - Savings account ====");
        System.out.println(String.format("Branch: %d", super.branch));
        System.out.println(String.format("Number: %d", super.number));
        System.out.println(String.format("Balance: %.2f", super.balance));
    }
}
