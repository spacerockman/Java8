package java8;

public class LambdaTest {
    public static void main(String[] args) {

        LambdaTest lambdaTest = new LambdaTest();
        String something = "asdadsasdasda";

//        Printer printer = new Printer() {
//            @Override
//            public void printer(String val) {
//                System.out.println(val);
//            }
//        };
//        printer.printer(something);

        //lambda
        //lambdaTest.printSomething(something,val -> System.out.println(val));
        Printer printer = val -> System.out.println(val);
        lambdaTest.printSomething(something,printer);
    }

    interface Printer {
        void printer(String val);
    }

    public void printSomething(String something, Printer printer){
        printer.printer(something);
    }
}
