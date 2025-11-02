import org.junit.Before; 
import org.junit.Test;   
import static org.junit.Assert.*; 

public class TestGestionBiblioteca { 

    private GestionBiblioteca gestionBiblioteca;

    @Before
    public void setUp() {
        gestionBiblioteca = new GestionBiblioteca();
    }

    // =========================================================================
    // 1. Tests para calcularPrecioConDescuento()
    // =========================================================================

    // Precio sin descuento (0%)
    @Test
    public void testCalPreDesc_Cero() {
        double precioBase = 150.0;
        double porcentajeDescuento = 0.0;
        double expectedPrice = 150.0;

        double actualPrice = gestionBiblioteca.calcularPrecioConDescuento(precioBase, porcentajeDescuento);
        
        assertEquals("El precio con 0% de descuento debe ser igual al precio base.", expectedPrice, actualPrice, 0.001); 
    }

    // Precio con 50% de descuento    
    @Test
    public void testCalPreDesc_Cincuenta() {
        double precioBase = 400.0;
        double porcentajeDescuento = 50.0;
        double expectedPrice = 200.0;
        
        double actualPrice = gestionBiblioteca.calcularPrecioConDescuento(precioBase, porcentajeDescuento);
        
        assertEquals("El precio con 50% de descuento debe ser la mitad.", expectedPrice, actualPrice, 0.001);
    }

    // Excepción con descuento mayor a 100
    @Test(expected = IllegalArgumentException.class) 
    public void testCalPreDesc_MayorCien() {
        double precioBase = 10.0;
        double porcentajeDescuento = 120.0;
        
        gestionBiblioteca.calcularPrecioConDescuento(precioBase, porcentajeDescuento); 
    }

    // =========================================================================
    // 2. Tests para estaDisponible()
    // =========================================================================

    // Libro no disponible (no agregado)
    @Test
    public void testEsDisp_LibNoAgre() {
        String tituloNoExiste = "Avatar, The Last Airbender";
        boolean disponible = gestionBiblioteca.estaDisponible(tituloNoExiste);
        assertFalse("Un libro que nunca se agregó debe reportarse como no disponible.", disponible);
    }
    
    // Libro disponible después de agregarlo
    @Test
    public void testEsDisp_LibAgre() {
        String tituloAgregado = "Snoopy";
        gestionBiblioteca.agregarLibro(tituloAgregado);
        boolean disponible = gestionBiblioteca.estaDisponible(tituloAgregado);
        assertTrue("Un libro agregado exitosamente debe estar disponible.", disponible);
    }

    // =========================================================================
    // 3. Tests para agregarLibro()
    // =========================================================================

    // Agregar libro exitosamente
    @Test
    public void testAgreLib_Exitoso() {
        String titulo = "Viernes 13";
        boolean agregado = gestionBiblioteca.agregarLibro(titulo);
        assertTrue("El libro debe agregarse exitosamente.", agregado);
        assertTrue("El libro agregado debe estar disponible.", gestionBiblioteca.estaDisponible(titulo));
    }

    // Agregar null retorna false
    @Test
    public void testAgreLib_null() {
        assertFalse("Agregar libro nulo debe retornar false.", gestionBiblioteca.agregarLibro(null));
    }

    // =========================================================================
    // 4. Tests para obtenerCategoriaLector()
    // =========================================================================

    // 0 libros → "Principiante"
    @Test
    public void testObtCatLector_Principiante() {
        int librosLeidos = 0;
        String categoria = gestionBiblioteca.obtenerCategoriaLector(librosLeidos);
        assertEquals("La categoría para 0 libros leídos debe ser 'Principiante'.", "Principiante", categoria);
    }
    
    // 100 libros → "Experto"
    @Test
    public void testObtCatLector_Experto() {
        int librosLeidos = 75;
        String categoria = gestionBiblioteca.obtenerCategoriaLector(librosLeidos);
        assertEquals("La categoría para más de 50 libros leídos debe ser 'Experto'.", "Experto", categoria);
    }
    
    // Excepción con número negativo
    @Test(expected = IllegalArgumentException.class)    
    public void testObtCatLector_Negativo() {
        int librosLeidos = -5;
        gestionBiblioteca.obtenerCategoriaLector(librosLeidos);
    }

    // =========================================================================
    // 5. Tests para obtenerLibrosDisponibles()
    // =========================================================================

    // Lista vacía inicialmente
    @Test
    public void testObtLibDisp_InicioVacio() {
        List<String> libros = gestionBiblioteca.obtenerLibrosDisponibles();
        assertTrue("La lista de libros disponibles está vacía inicialmente.", libros.isEmpty());
    }
    
    // Contiene libros después de agregarlos
    @Test
    public void testObtLibDisp_DespuesAgre() {
        String libro1 = "El Principito";
        String libro2 = "1984";
        gestionBiblioteca.agregarLibro(libro1);
        gestionBiblioteca.agregarLibro(libro2);
        
        List<String> libros = gestionBiblioteca.obtenerLibrosDisponibles();
        
        assertEquals("La lista debe contener 2 libros después de agregarlos.", 2, libros.size());
        assertTrue("La lista debe contener 'El Principito'.", libros.contains(libro1));
        assertTrue("La lista debe contener '1984'.", libros.contains(libro2));
    }
}