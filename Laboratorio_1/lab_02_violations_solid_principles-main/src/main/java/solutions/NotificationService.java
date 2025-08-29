package solutions;

import violations.User;

public class NotificationService {
    private User user;

    public NotificationService(User user) {
        this.user = user;
    }
    
    // Responsabilidad 3: Envío de notificaciones
    public void sendWelcomeEmail() {
        System.out.println("Enviando email de bienvenida a: " + user.getEmail());
        System.out.println("Asunto: ¡Bienvenido " + user.getName()+ "!");
        System.out.println("Cuerpo: Gracias por registrarte como usuario " + user.getUserType());
    }
}