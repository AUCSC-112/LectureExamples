public class Dog {
    int age;
    private String breed;
    private String name;
    private String color;
    private int id;

    // Constructor
    public Dog(int age, String breed, String name, String color, int id ) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.id = id;
    }
    public Dog(int id){
        this(-1,"Mutt", "Teddy","",id);
    }

    public Dog(String name){
        this.age = -1;
        this.breed ="mutt";
        this.name = name;
        this.color = "";
        this.id = 0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }



    public void updateAge(){
        if (age >= 0)
            age += 1;
    }

}
