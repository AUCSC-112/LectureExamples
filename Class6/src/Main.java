public class Main {
    public static void main(String[] args) {

        Restaurant fika = new Restaurant("Camrose","FIKA");
        System.out.println(fika.name);
        System.out.println(fika.numRestaurant); // 1

        Restaurant mcDonald = new Restaurant("Camrose","McDonald");

        Restaurant mcDonald2 = new Restaurant("Camrose","McDonald");

        System.out.println(mcDonald.name);
        System.out.println(mcDonald.numRestaurant); // 2
        if(mcDonald.equals(mcDonald2)){

        }
        System.out.println(fika.numRestaurant); //1

        System.out.println(Restaurant.numRestaurant); // 2


    }
}