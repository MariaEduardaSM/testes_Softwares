import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteMain {
    @Test
    public void testMaiorNumero1() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int maior = Main.maiorNumero(numeros);
        assertEquals(15, maior);
    }
    
    @Test
    public void testMaiorNumero2() {
        int[] numeros = {-1,62,100,555,2,22,5,11,6,9,15,77,4,28,50};
        int maior = Main.maiorNumero(numeros);
        assertEquals(555, maior);
    }
    
    @Test
    public void testMaiorNumero3() {
        int[] numeros = {0,80,17,62,1,10,9,68,44,3,1,-10,90,33,70};
        int maior = Main.maiorNumero(numeros);
        assertEquals(90, maior);
    }
    
    @Test
    public void testMaiorNumero4() {
        int[] numeros = {8,99,675,3,8,9,4,22,10,7,30,12,51,69,88};
        int maior = Main.maiorNumero(numeros);
        assertEquals(675, maior);
    }
    @Test
    public void testMaiorNumero5() {
        int[] numeros = {9,6,44,15,82,678,100,667,30,11,50,99,74,69,16};
        int maior = Main.maiorNumero(numeros);
        assertEquals(678, maior);
    }
    @Test
    public void testMaiorNumero6() {
        int[] numeros = {6,3,2,8,41,86,22,3,5,20,19,18,85,87,47};
        int maior = Main.maiorNumero(numeros);
        assertEquals(87, maior);
    }
    @Test
    public void testMaiorNumero7() {
        int[] numeros = {14,16,20,21,18,51,19,44,41,35,38,55,28,70,33};
        int maior = Main.maiorNumero(numeros);
        assertEquals(70, maior);
    }
    @Test
    public void testMaiorNumero8() {
        int[] numeros = {140,555,230,100,40,32,782,444,3,-5,80,31,215,1,9};
        int maior = Main.maiorNumero(numeros);
        assertEquals(782, maior);
    }
    @Test
    public void testMaiorNumero9() {
        int[] numeros = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15};
        int maior = Main.maiorNumero(numeros);
        assertEquals(-1, maior);
    }
    @Test
    public void testMaiorNumero10() {
        int[] numeros = {75,9,6,14,8,0,100,63,12,87,59,102,266,75,1,};
        int maior = Main.maiorNumero(numeros);
        assertEquals(266, maior);
    }
    
}