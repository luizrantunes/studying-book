public class Books {
    String title;
    String author;
}

class BookTestDrive {
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Ria da minha vida antes que eu ria da sua";
        myBooks[1].title = "Aprendendo inteligência";
        myBooks[2].title = "Qual é a sua obra?";

        myBooks[0].author = "Evandro Daolio";
        myBooks[1].author = "Prof Pierluigi";
        myBooks[2].author = "Mario Sergio Cortella";

        int x = 0;
        while(x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" de ");
            System.out.println(myBooks[x].author);
            x = x +1;
        }
    }
}
