public class Ex3CalculadoraCientifica {
    public double raiz(int a){
        return (Math.sqrt(a));
    }

    public double raiz(double a){
        return Math.sqrt(a);
    }

    public double raiz(String s1){
        return Math.sqrt(Double.parseDouble(s1));
    }

    public double potência(Byte a, Byte b){
        return Math.pow(a, b);
    }

    public double potência(String s1, String s2){
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }

    public double potência(int a, double b){
        return Math.pow(a, b);
    }

}
