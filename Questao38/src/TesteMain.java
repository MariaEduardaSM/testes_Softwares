import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteMain {
    @Test
    public void testMain1() {
        double[] numeros = {-1.0, 2.0, -3.0, 4.0, -5.0};
        int negativos = 0;

        for (double numero : numeros) {
            if (numero < 0) {
                negativos++;
            }
        }

        Assertions.assertEquals(3, negativos, "O número, de números negativos está incorreto.");
    }
        @Test
        public void testMain2() {
            double[] numeros = {-1.0, -2.0, -3.0, -4.0, -5.0};
            int negativos = 0;

            for (double numero : numeros) {
                if (numero < 0) {
                    negativos++;
                }
            }

            Assertions.assertEquals(5, negativos, "O número, de números negativos está incorreto.");
        }
            @Test
            public void testMain3() {
                double[] numeros = {1,2,3,4,-5};
                int negativos = 0;

                for (double numero : numeros) {
                    if (numero < 0) {
                        negativos++;
                    }
                }

                Assertions.assertEquals(1, negativos, "O número, de números negativos está incorreto.");
            }
                @Test
                public void testMain4() {
                    double[] numeros = {0,1,2,3,4,5};
                    int negativos = 0;

                    for (double numero : numeros) {
                        if (numero < 0) {
                            negativos++;
                        }
                    }

                    Assertions.assertEquals(0, negativos, "O número, de números negativos está incorreto.");
                }
                    @Test
                    public void testMain5() {
                        double[] numeros = {60,8,-2,90,-7};
                        int negativos = 0;

                        for (double numero : numeros) {
                            if (numero < 0) {
                                negativos++;
                            }
                        }

                        Assertions.assertEquals(2, negativos, "O número,de números negativos está incorreto.");
                    }
          
                        @Test
                        public void testMain6() {
                            double[] numeros = {-1.0, 2.0, -3.0, -4.0, -5.0};
                            int negativos = 0;

                            for (double numero : numeros) {
                                if (numero < 0) {
                                    negativos++;
                                }
                            }

                            Assertions.assertEquals(4, negativos, "O número, de números negativos está incorreto.");
                        }
                            @Test
                            public void testMain7() {
                                double[] numeros = {-1,-12,-13,9,30};
                                int negativos = 0;

                                for (double numero : numeros) {
                                    if (numero < 0) {
                                        negativos++;
                                    }
                                }

                                Assertions.assertEquals(3, negativos, "O número,de números negativos está incorreto.");
                            }
                                @Test
                                public void testMain8() {
                                    double[] numeros = {-1.0, -2.0, -3.0, -4.0, -5.0};
                                    int negativos = 0;

                                    for (double numero : numeros) {
                                        if (numero < 0) {
                                            negativos++;
                                        }
                                    }

                                    Assertions.assertEquals(5, negativos, "O número, de números negativos está incorreto.");
                                }
                                    @Test
                                    public void testMain9() {
                                        double[] numeros = {-1.0, -2.0, 3.0, 4.0, -5.0};
                                        int negativos = 0;

                                        for (double numero : numeros) {
                                            if (numero < 0) {
                                                negativos++;
                                            }
                                        }

                                        Assertions.assertEquals(3, negativos, "O número, de números negativos está incorreto.");
                                    }
                                        @Test
                                        public void testMain10() {
                                            double[] numeros = {-1.0, -2.0, -3.0, -4.0, 5.0};
                                            int negativos = 0;

                                            for (double numero : numeros) {
                                                if (numero < 0) {
                                                    negativos++;
                                                }
                                            }

                                            Assertions.assertEquals(4, negativos, "O número, de números negativos está incorreto.");
                                        }

}