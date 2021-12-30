public class App {
  public static void main(String[] args) {
      String username = "Username1";
      String email = "User_email@email.com";
      String password = "User_password";
      
      CheckoutAccount ca = new CheckoutAccount(username, email, password);
      ca.deposit(100);
      SavingsAccount sa = new SavingsAccount(username, email, password);

      ca.transfer(100, sa);

      ca.printStatement();
      sa.printStatement();
  }
}
