import java.util.List;

public class Bank {
    private String nome;
    private List<Account> accounts;

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getNome() {
        return nome;
    } 
}