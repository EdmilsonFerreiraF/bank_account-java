public class CheckoutAccount extends Account {
    public CheckoutAccount(String username, String cpf, String password) {
        super(username, cpf, password);
    } 
    
    @Override
    public void printStatement() {
        System.out.println("==== Bank statement - Checkout account ====");
        super.printCommonInfo();
    }
}
