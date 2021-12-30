public abstract class Account implements IAccount {
    protected static final int DEFAULT_BRANCH = 0;
    protected static int COUNT = 1;
    
    protected String username;
    protected String cpf;
    protected String password;
    protected int branch;
    protected int number;
    protected double balance;

    public Account(String username, String cpf, String password) {
        this.username = username;
        this.cpf = cpf;
        this.password = password;
        this.branch = Account.DEFAULT_BRANCH;
        this.number = COUNT++;
    }

    @Override
    public void withdraw(double value) {
        if (value > balance) {
            System.out.println("Cannot withdraw money greater than balance value.");
        }

        if (value <= 0) {
            System.out.println("Invalid value. The value must be greater than 0.");
        }
        
        balance -= value;
    }
    
    @Override
    public void deposit(double value) {
        if (value <= 0) {
            System.out.println("Invalid value. Insert a value greater than 0.");
        }
        
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount receiverAccount) {
        if (receiverAccount.cpf == cpf) {
            System.out.println("Cannot transfer to your own account.");

        }

        if (value > 5000) {
            System.out.println("Money value can't be greater than 5000.");
        }
        
        if (value <= 0) {
            System.out.println("Invalid value. The value must be greater than 0.");
        }
        
        this.withdraw(value);
        receiverAccount.deposit(value);
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void printCommonInfo() {
        System.out.println(String.format("Branch: %d", this.branch));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
