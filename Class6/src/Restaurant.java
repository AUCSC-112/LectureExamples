public class Restaurant {
    public String address;
    private Menu restaurantMenu;
    public String name;

    public static int numRestaurant = 0;

    public Restaurant(String address, Menu restaurantMenu, String name){
        this.address = address;
        this.restaurantMenu = restaurantMenu;
        this.name = name;
        numRestaurant += 1;
    }

    public Restaurant(String address, String name){
        this(address,null,name);
    }

    public boolean equals(Restaurant obj){
        if(address == obj.address){
            return true;
        }
        return false;
    }
}
