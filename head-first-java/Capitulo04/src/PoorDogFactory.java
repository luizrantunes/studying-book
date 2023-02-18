class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class PoorDogFactory {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        one.setSize(55);
        one.setName("Bob");

        PoorDog two = new PoorDog();
        two.setSize(18);
        two.setName("Billy");

        System.out.println("O tamanho do cão é " + one.getSize());
        System.out.println("O nome do cão é " + one.getName());
        System.out.print("\n");
        System.out.println("O tamanho do cão é " + two.getSize());
        System.out.println("O nome do cão é " + two.getName());
    }
}
