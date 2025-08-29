package tests;

import solutions.DiscountCalculator;
import solutions.NotificationService;
import solutions.UserReportGenerator;
import solutions.UserValidator;
import violations.User;

public class E1_SRP {
    public static void main(String[] args) {
        User user = new User("Marcos", "marcos53@gmail.com", "VIP", 3500);
        
        UserValidator validador = new UserValidator(user);
        if(!validador.validateUser()){
            System.out.println("Usuario invalido.");
            return;
        }
        
        DiscountCalculator desc = new DiscountCalculator(user);
        double descuento = desc.calculateDiscount();
        System.out.println("Descuento: " + (descuento * 100) + "%");
        
        NotificationService noti = new NotificationService(user);
        noti.sendWelcomeEmail();
        
        UserReportGenerator repor = new UserReportGenerator(user);
        System.out.println(repor.generateUserReport());
    }
}
