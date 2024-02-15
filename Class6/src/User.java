public class User extends People{

    private String deliveryAddress = "";

    public User(String name, String deliveryAddress){
        super(name);
        this.deliveryAddress = deliveryAddress;
        //super.countPeople(); // call People.countPeople
        countPeople(); // User.countPeople
    }



}
