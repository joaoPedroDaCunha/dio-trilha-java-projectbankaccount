package Terminal.Domain.Controller;

import java.util.Scanner;

import Bank.Domain.Account.TerminalAccount;

public class Program {

    public static void main(String [] args) throws Exception{

        Scanner sc = new Scanner (System.in);
        TerminalAccount Account = new TerminalAccount();

        System.out.print("Digite o numero da Conta : ");
        Account.setNumber(sc.nextInt());

        System.out.print("Digite o numero da Agencia : ");
        Account.setAgency(sc.next());
        sc.nextLine();

        System.out.print("Digite o seu Nome : ");
        Account.setCustomerName(sc.nextLine());

        System.out.print("Digite seu Saldo : ");
        Account.setBalance(sc.nextFloat());

        System.out.println(Account.toString());

        sc.close();
    }
    
}
