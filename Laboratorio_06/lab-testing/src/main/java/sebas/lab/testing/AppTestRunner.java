
import sebas.mavenproject1.UserServiceTest; // Necesitas importar la clase de Mockito

/**
 * Clase temporal con el método main para ejecutar manualmente todas las suites de tests.
 * Solución de último recurso cuando el Test Runner falla en el IDE.
 */
public class AppTestRunner {

    public static void main(String[] args) {
        System.out.println("--- INICIANDO EJECUCIÓN MANUAL DE TESTS ---");
        
        // Ejecuta la suite de pruebas de GestionBiblioteca.java (Puntos 1-5)
        System.out.println("\n[1] Ejecutando: TestGestionBiblioteca");
        Result resultGestionBiblioteca = JUnitCore.runClasses(TestGestionBiblioteca.class);
        printResult(resultGestionBiblioteca);
        
        // Ejecuta la suite de pruebas de UserServiceTest (Punto 6 - Mockito)
        // Nota: Esta ejecución NO ejecutará Mockito correctamente si el proyecto no está compilado.
        System.out.println("\n[2] Ejecutando: UserServiceTest (¡REQUIERE MOCKITO!)");
        Result resultUserService = JUnitCore.runClasses(UserServiceTest.class);
        printResult(resultUserService);
        
        System.out.println("\n--- EJECUCIÓN MANUAL FINALIZADA ---");
        
        // Finaliza con un código de error si alguna prueba falló
        if (!resultGestionBiblioteca.wasSuccessful() || !resultUserService.wasSuccessful()) {
            System.exit(1);
        }
    }
    
    // Método auxiliar para imprimir los resultados de JUnit
    private static void printResult(Result result) {
        System.out.println("  > Tests ejecutados: " + result.getRunCount());
        System.out.println("  > Fallos: " + result.getFailureCount());
        
        for (Failure failure : result.getFailures()) {
            System.err.println("  > FALLO: " + failure.toString());
        }
        
        if (result.wasSuccessful()) {
            System.out.println("  > Resultado: ¡EXITOSO! (Todas las pruebas pasaron)");
        } else {
            System.err.println("  > Resultado: ¡FALLIDO! Hay fallos en las pruebas.");
        }
    }
}
