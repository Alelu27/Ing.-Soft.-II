package solutions;

import violations.User;

public class UserReportGenerator {
    
    private User user;
    private DiscountCalculator discal;

    public UserReportGenerator(User user) {
        this.user = user;
        this.discal = new DiscountCalculator(user);
    }
    
    // Responsabilidad 4: Generación de reportes
    public String generateUserReport() {
        return "=== REPORTE DE USUARIO ===\n"
                + "Nombre: " + user.getName() + "\n"
                + "Email: " + user.getEmail() + "\n"
                + "Tipo: " + user.getUserType() + "\n"
                + "Total Compras: $" + user.getTotalPurchases() + "\n"
                + "Descuento Aplicable: " + (discal.calculateDiscount() * 100) + "%\n";
    }
}
