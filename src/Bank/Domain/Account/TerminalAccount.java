package Bank.Domain.Account;

public class TerminalAccount {
    
    private int number ;
    private String agency;
    private String customerName;
    private float balance;

    public TerminalAccount(){
        
    }
    
    public int getNumber(){
        return this.number;
    }
    public String getAgency(){
        return this.agency;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public float gatBalance(){
        return this.balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setAgency(String agency){
        this.agency = agency;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String toString(){
        return "Olá "+customerName+", obrigado por criar uma conta no nosso banco, sua agencia é "+agency+", conta "+number+" e seu saldo "+balance+" ja esta disponivel para saque.";
    }
}
