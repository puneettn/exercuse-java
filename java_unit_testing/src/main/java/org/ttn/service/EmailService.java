package org.ttn.service;
import org.ttn.domain.Order;
public class EmailService {

    private static EmailService instance;

    public EmailService() {
    }

    public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    void sendEmail(Order order) {
        order.setCustomerNotified(false);
        throw new RuntimeException("An Exception Occurred");
    }

    boolean sendEmail(Order order, String cc) {
        order.setCustomerNotified(true);
        return true;
    }
}