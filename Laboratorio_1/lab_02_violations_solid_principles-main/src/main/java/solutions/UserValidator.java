package solutions;

import java.util.regex.Pattern;
import violations.User;

public class UserValidator {
    private User user;

    public UserValidator(User user) {
        this.user = user;
    }
  
    // Responsabilidad 1: Validación de usuario
    public boolean validateUser() {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            return false;
        }
        if (user.getEmail() == null || !isValidEmail(user.getEmail())) {
            return false;
        }
        return user.getUserType() != null && (user.getUserType().equals("PREMIUM")
                || user.getUserType().equals("REGULAR") || user.getUserType().equals("VIP"));
    }

    private boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email).matches();
    }
}
