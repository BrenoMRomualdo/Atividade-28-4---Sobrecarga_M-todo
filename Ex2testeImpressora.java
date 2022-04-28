public class Ex2testeImpressora {
    public static void main(String[] args) {
        float a = 2.4f, b = 5.2f;
        String s1 = "batata", s2 = "Chuva", s3 = "Ichidai sanzem daisen sekai";
        int x = 81, y = 100;

        Ex1Impressora Imprimir = new Ex1Impressora();

        Imprimir.exibir(a);
        Imprimir.exibir(a, b);
        Imprimir.exibir(a, s1);
        Imprimir.exibir(s1, a);
        Imprimir.exibir(s1, s2, s3);
        Imprimir.exibir(x, y, s1);
    }
}
