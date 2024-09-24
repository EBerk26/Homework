public class EvenMoreChaos {
    int chaos = 12;
    public static void main(String[] args) {
        EvenMoreChaos chaos = new EvenMoreChaos();
        System.out.println(chaos);
        System.out.println(chaos.chaos);
        chaos.chaos = 7;
        chaos.chaos = chaos(chaos.chaos);
        System.out.println(chaos(chaos.chaos));
        chaos.chaos=chaos(chaos.chaos)*7/chaos((chaos.chaos));
        System.out.println(chaos.chaos);
        chaos = new EvenMoreChaos();
    }
    EvenMoreChaos(){
        for(int chaos = 1; chaos<=this.chaos-chaos(chaos); chaos++){
            chaos=chaos(chaos)*chaos(chaos);
            System.out.println(chaos*chaos(this.chaos));
            chaos=this.chaos;
        }
        int chaos = 8;
        System.out.println(this.chaos);
        System.out.println(chaos(chaos));

    }
    static int chaos(int chaos){
        return chaos*2*chaos;
    }
}