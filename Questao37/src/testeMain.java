import org.junit.Assert;
import org.junit.Test;

public class testeMain {
  @Test
  public void testMain1() {
    int[] vetor = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    Assert.assertArrayEquals(expected, vetor);
  }

@Test
public void testMain2() {
  int[] vetor = {22, 5, 11, 3, 1};
  int[] expected = {22, 5, 11, 3,1};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain3() {
  int[] vetor = {100, 40, 22, 1, 9};
  int[] expected = {100, 40, 22, 1, 9};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain4() {
  int[] vetor = {33, 2, 90, 91, 92};
  int[] expected = {33, 2, 90, 91, 92};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain5() {
  int[] vetor = {30,31,32,33,34};
  int[] expected = {30,31,32,33,34};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain6() {
  int[] vetor = {11,12,13,14,15};
  int[] expected = {11,12,13,14,15};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain7() {
  int[] vetor = {20,30,40,50,60};
  int[] expected = {20,30,40,50,60};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain8() {
  int[] vetor = {22,32,42,52,62};
  int[] expected = {22,32,42,52,62};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain9() {
  int[] vetor = {100,101,102,103,104};
  int[] expected = {100,101,102,103,104};
  Assert.assertArrayEquals(expected, vetor);
}
@Test
public void testMain10() {
  int[] vetor = {-1, 15, 9, 20, 18};
  int[] expected = {-1, 15, 9, 20, 18};
  Assert.assertArrayEquals(expected, vetor);
}
}