public class HelloWorld {

    public static int calcularValores(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        int resultado = HelloWorld.calcularValores(2, 4);
        System.out.println("O resultado da soma é: " + resultado);
    }

}
