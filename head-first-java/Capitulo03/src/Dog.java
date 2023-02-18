public class Dog {
    String name;

    public static void main(String[] args) {
        // 1. cria um objeto Dog e o acessa
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Billy";
        // 2. agora cria uma matriz Dog
        Dog[] myDogs = new Dog [3];
        // 3. e coloca alguns dogs dentro
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        // 4. agora acessa os objetos Dog usando as referências da matriz
        myDogs[0].name = "Mari";
        myDogs[1].name = "Minnie";
        // 5. qual é o nome de myDogs[2]?
        System.out.println("o nome do último cão é " + myDogs[2].name);
        // 6. agora executa um loop pela matriz e pede a todos os cães para latirem

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " is ruffing!");
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void chaseCat() {
        System.out.println(name + " is chasing a cat.");
    }
}
