public interface IAccount {
    static String username = "";
    static String email = "";
    static String cpf = "";

    void withdraw(double value);
    
    void deposit(double value);
    
    void transfer(double value, IAccount receiverAccount);

    void printStatement();
}
