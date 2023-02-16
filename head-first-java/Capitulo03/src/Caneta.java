public class Caneta {
    String modelo;
    String cor;
    boolean carga;
    boolean tampa;
    double ponta;

    void escrever() {
        if (this.carga && !this.tampa) {
            System.out.print("Status da caneta " + this.cor + ": ");
            System.out.println("Estou escrevendo.");
        } if (this.carga && this.tampa) {
            System.out.print("Status da caneta " + this.cor + ": ");
            System.out.println("Não é possível escrever com a tampa.");
        } if (!this.carga && !this.tampa) {
            System.out.print("Status da caneta " + this.cor + ": ");
            System.out.println("Não é possível escrever sem carga de tinta.");
        } if (!this.carga && this.tampa) {
            System.out.print("Status da caneta " + this.cor + ": ");
            System.out.println("Não é possível escrever sem carga de tinta e com a tampa.");
        }
    }
}

class FabricaDeCanetas {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "slim";
        c1.cor = "preta";
        c1.carga = true;
        c1.tampa = false;
        c1.ponta = 0.7;
        c1.escrever();

        Caneta c2 = new Caneta();
        c2.modelo = "canetinha";
        c2.cor = "vermelha";
        c2.carga = true;
        c2.tampa = true;
        c2.ponta = 3.0;
        c2.escrever();

        Caneta c3 = new Caneta();
        c3.modelo = "esferográfica";
        c3.cor = "azul";
        c3.carga = false;
        c3.tampa = false;
        c3.ponta = 1.0;
        c3.escrever();

        Caneta c4 = new Caneta();
        c4.modelo = "canetão";
        c4.cor = "verde";
        c4.carga = false;
        c4.tampa = true;
        c4.ponta = 5.0;
        c4.escrever();
    }
}
