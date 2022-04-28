public class Ex4TesteCalculadoraCientifica {
    public static void main(String[] args) {
       int a = 9;
       double b = 4.0;
       String s1 = "2", s2 = "5";
       Byte c = 2, d = 3;

       Ex3CalculadoraCientifica Calcular = new Ex3CalculadoraCientifica();

       System.out.println(Calcular.raiz(a));
       System.out.println(Calcular.raiz(b));
       System.out.println(Calcular.raiz(s1));
       System.out.println("\nEx 3.1 feito, abaixo está o 3,2\n");
       System.out.println(Calcular.potência(c, d));
       System.out.println(Calcular.potência(s1, s2));
       System.out.println(Calcular.potência(a, b));
    }
}
