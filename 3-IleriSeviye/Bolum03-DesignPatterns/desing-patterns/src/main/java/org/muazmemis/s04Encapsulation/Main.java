package org.muazmemis.s04Encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
//        muazAccount.balance = 1000;
//        System.out.println(muazAccount.balance);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
