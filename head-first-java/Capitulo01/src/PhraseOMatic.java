public class PhraseOMatic {
    public static void main(String[] args) {

        // 1. Crie três conjuntos de palavras onde será feita a seleção.
        // 2. Adicione o que quiser!

        String [] listaDePalavrasUm = {"menino", "gay", "velho",
                "pé rapado", "hetero", "arrombado",
                "pegador", "estudante", "programador",
                "trans", "pequeno", "mano"};

        String [] listaDePalavrasDois = {"que ama", "que faz", "que trabalha",
                "que fala", "que come", "que experimenta",
                "que ja foi", "que vai ser", "que estuda",
                "que canta", "que pega", "que da"};

        String [] listaDePalavrasTres = {"chocolate", "carambola", "danone",
                "frango assado", "leite", "refri",
                "bolo", "xandão", "paçoca",
                "herói", "maconha", "macarrão"};

        // 3. Descubra quantas palavras existem em cada lista

        int tamanhoUm = listaDePalavrasUm.length;
        int tamanhoDois = listaDePalavrasDois.length;
        int tamanhoTres = listaDePalavrasTres.length;

        // 4. Gere três números aleatórios

        int numeroAleatorioUm = (int) (Math.random() * tamanhoUm);
        int numeroAleatorioDois = (int) (Math.random() * tamanhoDois);
        int numeroAleatorioTres = (int) (Math.random() * tamanhoTres);

        // 5. Agora construa uma frase

        String Frase = listaDePalavrasUm[numeroAleatorioUm] + " " +
                        listaDePalavrasDois[numeroAleatorioDois] + " " +
                        listaDePalavrasTres[numeroAleatorioTres];

        // 6. Exiba a frase

        System.out.println("Eu sou um " + Frase);
    }
}
