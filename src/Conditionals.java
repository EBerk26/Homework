public class Conditionals {
    public static void main(String[] args) {
        new Conditionals();
    }
    public Conditionals(){
        String question = "Would a woodchuck chuck wood if a woodchuck could chuck wood?";
        System.out.println(question);
        int RandomInt = (int)(11*Math.random());
        if (RandomInt == 0){
            System.out.println("Concentrate and ask again");
        } else if (RandomInt<=2){
            System.out.println("It is certain");
        } else if (RandomInt<=4){
            System.out.println("Signs point to yes");
        } else if (RandomInt<=6){
            System.out.println("Absolutely not");
        } else if (RandomInt<=8){
            System.out.println("You may rely on it");
        } else {
            System.out.println("Very doubtful");
        }
    }
}
