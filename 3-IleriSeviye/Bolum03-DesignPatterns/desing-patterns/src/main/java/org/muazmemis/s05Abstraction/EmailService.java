package org.muazmemis.s05Abstraction;

public class EmailService {
    public void sendEmail(String message, String receiver) {
        connect(1000);
        authenticate();
        // Send email
        System.out.println("Sending email to " + receiver + " with Message= " + message);
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connecting to mail server...");
    }

    private void authenticate() {
        System.out.println("Authenticating with mail server...");
    }

    private void disconnect() {
        System.out.println("Disconnecting from mail server...");
    }


}
