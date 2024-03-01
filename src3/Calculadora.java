public class Calculadora {
    int total;

    public void multiplicar (int x, int y) {
        total = x * y;
        System.out.println(total);
    }

    public void somar (int x , int y) {
        total = x + y;
        System.out.println(total);

    }

    public void subtrair (int x, int y) {
        total = x - y;
        System.out.println(total);
    }
}