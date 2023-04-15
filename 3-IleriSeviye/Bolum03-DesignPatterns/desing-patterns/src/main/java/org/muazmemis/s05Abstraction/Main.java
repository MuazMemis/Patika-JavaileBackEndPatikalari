package org.muazmemis.s05Abstraction;

import org.muazmemis.s04Encapsulation.Account;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("Hello World!", "Muaz");
    }
}
