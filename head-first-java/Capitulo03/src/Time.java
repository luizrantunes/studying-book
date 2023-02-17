public class Time {
    String nome;
    int classificacao;
    int pontuacao;
    double torcedores;
    boolean vitoria;
    boolean derrota;
    boolean empate;

    void tabela() {
        if (this.vitoria && !this.derrota && !this.empate) {
            System.out.println(this.nome + " venceu e terminou o campeonato em " + this.classificacao + "º lugar com " + this.pontuacao + " pontos.");
        }
        if (!this.vitoria && !this.derrota && this.empate) {
            System.out.println(this.nome + " empatou e terminou o campeonato em " + this.classificacao + "º lugar com " + this.pontuacao + " pontos.");
        }
        if (!this.vitoria && this.derrota && !this.empate) {
            System.out.println(this.nome + " perdeu e terminou o campeonato em " + this.classificacao + "º lugar com " + this.pontuacao + " pontos.");
        }
    }
}

class Campeonato {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("##############################################");
        System.out.println("########## Tabela do Paulistão 2023 ##########");
        System.out.println("##### Time        - Posição  - Pontuação #####");
        System.out.println("##### São Paulo   - 1º lugar - 28 pontos #####");
        System.out.println("##### Corinthians - 2º lugar - 25 pontos #####");
        System.out.println("##### Palmeiras   - 3º lugar - 22 pontos #####");
        System.out.println("##### Santos      - 4º lugar - 18 pontos #####");
        System.out.println("##############################################");
        System.out.println("\n");

        Time t1 = new Time();
        t1.nome = "São Paulo";
        t1.classificacao = 1;
        t1.pontuacao = 28;
        t1.torcedores = 7.500;
        t1.vitoria = true;
        t1.derrota = false;
        t1.empate = false;
        t1.tabela();

        Time t2 = new Time();
        t2.nome = "Corinthians";
        t2.classificacao = 2;
        t2.pontuacao = 25;
        t2.torcedores = 10.000;
        t2.vitoria = false;
        t2.derrota = false;
        t2.empate = true;
        t2.tabela();

        Time t3 = new Time();
        t3.nome = "Palmeiras";
        t3.classificacao = 3;
        t3.pontuacao = 22;
        t3.torcedores = 5.000;
        t3.vitoria = false;
        t3.derrota = false;
        t3.empate = true;
        t3.tabela();

        Time t4 = new Time();
        t4.nome = "Santos";
        t4.classificacao = 4;
        t4.pontuacao = 18;
        t4.torcedores = 3.800;
        t4.vitoria = false;
        t4.derrota = true;
        t4.empate = false;
        t4.tabela();
    }
}
