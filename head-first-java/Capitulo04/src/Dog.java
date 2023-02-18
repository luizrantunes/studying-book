public class Dog {
    void bark(int numOfBarks) {
        while(numOfBarks > 0) {
            System.out.println("ruff!");
            numOfBarks = numOfBarks -1;
        }
    }
}

class DogFactory {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(5);
    }
}