import org.junit.Test;
import static org.junit.Assert.*;

public class TesteMain {
  @Test
  public void testIdade1() {
    // Teste para idade menor que 16 anos
    assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(15));

    // Teste para idade entre 16 e 17 anos
    assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
    assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

    // Teste para idade maior ou igual a 18 anos
    assertEquals("Você pode votar e dirigir.", Main.verificarIdade(18));
    assertEquals("Você pode votar e dirigir.", Main.verificarIdade(19));
  }

@Test
public void testIdade2() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(10));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(18));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(29));
}
@Test
public void testIdade3() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(12));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(20));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(32));
}
@Test
public void testIdade4() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(11));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(54));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(18));
}
@Test
public void testIdade5() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(14));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(31));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(22));
}
@Test
public void testIdade6() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(12));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(42));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(18));
}
@Test
public void testIdade7() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(8));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(25));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(30));
}
@Test
public void testIdade8() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(13));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(50));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(29));
}
@Test
public void testIdade9() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(9));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(20));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(21));
}
@Test
public void testIdade10() {
  // Teste para idade menor que 16 anos
  assertEquals("Você não pode votar nem dirigir.", Main.verificarIdade(10));

  // Teste para idade entre 16 e 17 anos
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(16));
  assertEquals("Você pode votar, mas não pode dirigir.", Main.verificarIdade(17));

  // Teste para idade maior ou igual a 18 anos
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(25));
  assertEquals("Você pode votar e dirigir.", Main.verificarIdade(48));
}
}