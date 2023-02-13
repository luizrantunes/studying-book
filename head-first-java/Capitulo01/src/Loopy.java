public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Antes do Loop");
        while (x < 4) {
            System.out.println("No loop");
            System.out.println("O valor de x é " + x);
            x = x + 1;
        }
        System.out.println("Esse é o fim do loop");
    }
}

class IfTest {
    public static void main(String[] args) {
        int x = 3;
        if (x == 3) {
            System.out.println("x deve ser igual a 3");
        }
        System.out.println("Isso será executado de qualquer forma");
    }
}

class IfTest2 {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x deve ser igual a 3");
        } else {
            System.out.println("x NÃO é igual a 3");
        }
        System.out.println("Isso será executado de qualquer forma");
    }
}