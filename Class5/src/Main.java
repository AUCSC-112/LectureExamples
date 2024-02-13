public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog myFirstDog = new Dog("Teddy");
        Dog mySecondDog = new Dog("Teddy");
        mySecondDog.setName("Louis");

        myFirstDog.setName("Louis");
        System.out.println(myFirstDog.getName());
    }
}