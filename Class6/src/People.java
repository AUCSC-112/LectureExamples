public abstract class People {

    private static int[] listOfId;
    protected String name = "";
    protected int idNumber = 0;

    public People(String name){
        this.name = name;
    }

    public int countPeople(){
        return 10;
    }

    public boolean equals(People people){
        if (this.idNumber == people.idNumber){
            return true;
        }
        return false;


    }

    protected String getName(){
        return name;
    }
}
