public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Forrest Gump";
        one.genre = "Drama";
        one.rating = 10;

        Movie two = new Movie();
        two.title = "Taxi Driver";
        two.genre = "Suspense";
        two.rating = 9;
        two.playIt();

        Movie three = new Movie();
        three.title = "La La Land";
        three.genre = "Musical";
        three.rating = 8;

        System.out.println(three.title);
    }
}
