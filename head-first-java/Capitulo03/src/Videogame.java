public class Videogame {
    String name;
    int generation;
}

class FabricaDeVideogame {
    public static void main(String[] args) {
        Videogame[] v = new Videogame[8];

        int x;
        x = 0;

        while(x < 7) {
            x = x + 1;
            v[x] = new Videogame();
            v[x].name = "Nintendinho";
            v[x].generation = x;

            if(x == 2) {
                v[x].name = "Super Nintendo";
                v[x].generation = x;
            }
            if(x == 3) {
                v[x].name = "Nintendo 64";
                v[x].generation = x;
            }
            if(x == 4) {
                v[x].name = "Nintendo Gamecube";
                v[x].generation = x;
            }
            if(x == 5) {
                v[x].name = "Nintendo Wii";
                v[x].generation = x;
            }
            if(x == 6) {
                v[x].name = "Nintendo Wii U";
                v[x].generation = x;
            }
            if(x == 7) {
                v[x].name = "Nintendo Switch";
                v[x].generation = x;
            }
            System.out.println(v[x].name + " é um console da " + v[x].generation + "º geração.");
        }
    }
}
