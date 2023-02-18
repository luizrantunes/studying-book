public class Jogador {
    String nome;

    void treinar() {
        System.out.println(this.nome + " está treinando.");
    }
}

class Escalacao {
    public static void main(String[] args) {
        Jogador[] j = new Jogador[5];

        int x;
        x = 0;

        while(x < 4) {
            x = x + 1;
            j[x] = new Jogador();
            j[x].nome = "Rogério Ceni";

            if(x == 2) {
                j[x].nome = "Zidane";
            }
            if(x == 3) {
                j[x].nome = "Ronaldo";
            }
            if(x == 4) {
                j[x].nome = "Messi";
            }

            j[x].treinar();
            System.out.println(j[x].nome + " é o craque do time.");
        }
    }
}
