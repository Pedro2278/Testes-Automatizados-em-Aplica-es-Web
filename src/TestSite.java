package TestSite;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSite {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        // Definir o caminho para o WebDriver (Chrome no exemplo)
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Teste de login válido
    @Test
    public void testLoginValido() {
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String sucessoMensagem = driver.findElement(By.id("flash")).getText();
        Assertions.assertTrue(sucessoMensagem.contains("You logged into a secure area!"));
    }

    // Teste de login inválido
    @Test
    public void testLoginInvalido() {
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("invalidUser");
        driver.findElement(By.id("password")).sendKeys("wrongPassword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String erroMensagem = driver.findElement(By.id("flash")).getText();
        Assertions.assertTrue(erroMensagem.contains("Your username is invalid!"));
    }

    // Teste de formulário preenchido corretamente
    @Test
    public void testFormularioPreenchidoCorretamente() {
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        driver.findElement(By.name("firstname")).sendKeys("João");
        driver.findElement(By.name("lastname")).sendKeys("Silva");
        driver.findElement(By.name("email")).sendKeys("joao@email.com");
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.name("datepicker")).sendKeys("01/01/2000");

        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("submit")).click();

        String sucessoMensagem = driver.findElement(By.className("valid")).getText();
        Assertions.assertTrue(sucessoMensagem.contains("Form has been successfully submitted!"));
    }

    // Teste de campos obrigatórios no formulário
    @Test
    public void testCamposObrigatorios() {
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        driver.findElement(By.name("firstname")).sendKeys("");
        driver.findElement(By.name("lastname")).sendKeys("");

        driver.findElement(By.id("submit")).click();

        String errorMessage = driver.findElement(By.xpath("//div[contains(text(),'This field is required')]")).getText();
        Assertions.assertEquals("This field is required", errorMessage);
    }

    // Teste de adicionar produto ao carrinho
    @Test
    public void testAdicionarProdutoCarrinho() {
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assertions.assertEquals("1", cartCount);
    }

    // Teste de remover produto do carrinho
    @Test
    public void testRemoverProdutoCarrinho() {
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        // Verificar que o ícone do carrinho foi removido (ficando vazio)
        boolean isCartEmpty = driver.findElements(By.className("shopping_cart_badge")).isEmpty();
        Assertions.assertTrue(isCartEmpty);
    }

    // Método de encerramento após cada teste
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
