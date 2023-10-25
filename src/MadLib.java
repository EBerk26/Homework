public class MadLib {
    public MadLib(int line){
        //this class is a constructor - it creates objects
        System.out.println("line " + line);
    }
    public static void main(String[] args) {
        for(int x = 1; x<=1000000; x++){
            new MadLib(x);
        }
    }
}