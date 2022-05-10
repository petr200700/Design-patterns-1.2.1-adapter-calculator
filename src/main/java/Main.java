public class Main {

    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(10, 22));
        System.out.println(intsCalc.mult(15, 5));
        System.out.println(intsCalc.div(15.5, 15));
        System.out.println(intsCalc.pow(2, 10));

    }
}

