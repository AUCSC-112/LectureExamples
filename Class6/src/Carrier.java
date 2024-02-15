public class Carrier extends People{

    public Carrier(String name){
        super(name);
        System.out.println(idNumber); // I can access it because ti's protected
    }
}
