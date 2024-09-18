public class ReturnTypes {
    public static void main(String[] args) {
        new ReturnTypes();
    }
    ReturnTypes(){
        System.out.println(add(5,8));
        System.out.println(subtract(5,8));
        System.out.println(divide(5,8));
        System.out.println(multiply(5,8));
        System.out.println(remainder(8,5));
        System.out.println(power(5,-2));
    }
    int add(int a, int b){
        //the assignment says to define a variable sum but it's easier to do like this
        return (a+b);
    }
    int subtract(int a, int b){
        return (a-b);
    }
    double divide(int a,int b){
        return ((double)a/(double)b);
    }
    int multiply(int a, int b){
        return (a*b);
    }
    int remainder(int dividend, int modulus){
        return(dividend%modulus);
    }
    double power(int base, int exponent){
        return (Math.pow((double)(base),(double)(exponent)));
    }
}
