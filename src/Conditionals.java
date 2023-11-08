public class Conditionals {

    public static void main(String[] args) {
        new Conditionals();
    }
    public Conditionals(){
        System.out.println("What is your question?");
        java.util.Scanner scanner =  new java.util.Scanner(System.in);
        String Question = scanner.nextLine();
        System.out.println(Question);
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
