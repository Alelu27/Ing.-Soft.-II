import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestUserService {

    // Crear mock de UserRepository con Mockito.mock()
    @Mock
    private UserRepository userRepositoryMock;

    // Inyectar el mock en UserService
    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    // Usar when().thenReturn() para configurar respuestas

    // =========================================================================
    // Test 1: Usuario Existe (Happy Path)
    // =========================================================================

    @Test
    public void testGetUserName_UsuarioExiste() {
        String userId = "123";
        String userName = "Juan Perez";
        
        User expectedUser = new User(userId, userName); 

        when(userRepositoryMock.findById(userId)).thenReturn(expectedUser);

        String actualName = userService.getUserName(userId);

        assertEquals("Debe retornar el nombre del usuario encontrado.", userName, actualName);

    }

    // =========================================================================
    // Test 2: Usuario No Existe (Error)
    // =========================================================================

    @Test
    public void testGetUserName_UsuarioNoExiste() {
        String nonExistingId = "999";
        String expectedMessage = "User not found";

        when(userRepositoryMock.findById(nonExistingId)).thenReturn(null);

        try {
            userService.getUserName(nonExistingId);
            fail("Se esperaba que se lanzara una IllegalArgumentException."); 
        } catch (IllegalArgumentException e) {
            assertEquals("El mensaje de la excepción debe ser 'User not found'.", expectedMessage, e.getMessage());
        } catch (Exception e) {
             fail("Se lanzó un tipo de excepción incorrecto: " + e.getClass().getSimpleName());
        }
    }
}