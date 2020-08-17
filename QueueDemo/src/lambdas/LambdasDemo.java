package lambdas;

//public class LambdasDemo {
//    public LambdasDemo(String message) {
//    }
//
//    public static void print(String message){}
//
//    public static void show() {
//        //1
////    greet(new ConsolePrinter());//since greet and show are both static they can access each other
////    }
//
//        //2
////        //ANONYMOUS INNER CLASS
////        greet(new Printer() {
////            @Override
////            public void print(String message) {
////                System.out.println(message);
////            }
////        });
////    }
//
//        //3
//        greet((String message) -> {System.out.println(message);});
//
//        //if print method was static
////        greet(LambdasDemo::print);
//
////        var demo = new LambdasDemo();
////        greet(message -> demo.print(message)); equiv to greet(demo::print)
//
//        //Constructor
////        greet(message -> new LambdasDemo(message)); //equiv to greet(LambdasDemo::new);
//
//
//    }
//
//
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
//}

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//CONSUMER
public class LambdasDemo{
    public static void show(){
//        List<Integer> list = new List.of(1, 9, 0);
//
//        //Imperative prog(for, if/else, switch/case)
//        for (var item : list)
//            System.out.println(item);
//
//        //Declarative prog
//        list.forEach(item -> System.out.println(item));


        //CONSUMER get smth, returns nothing
//        List<String> list = List.of("a", "b", "c");
//        Consumer<String> demo = item -> System.out.println(item);
//        Consumer<String> demo2 = item-> System.out.println(item.toUpperCase());
//
//        list.forEach(demo.andThen(demo2).andThen(demo));

        //SUPPLIER get nothing, returns smth
            //since we have one statement no need for "return" keyword
        //IntSupplier, DoubleSupplier if you are using primitce dT
            Supplier<Double> getRandom = () -> {return Math.random(); };
            var random = getRandom.get();
            System.out.println(random);


            //FUNCTION
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);

        //COMPOSING FUNCTION INTERFACE
        //"key:value"
        //first: "key=value"
        //second transformation: "(key=value)"

//        Function<String, String> replaceColon = str -> str.replace(":", "=");
//        Function<String, String> addBraces = str -> "{" + str + "}";
//
//        var result = replaceColon.andThen(addBraces).apply("key:value");
//        //compose is similar to andThen but it makes it in the reverse order
//        System.out.println(result);


        //PREDICATE
//        //EX: to check if "sky" has more than five elements
//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        var result = isLongerThan5.test("sky");
//        System.out.println(result);

        //COMPOSING PREDICATES
//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("}");
//        Predicate<String> hasLeftAndRight = hasLeftBrace.and(hasRightBrace);
//        var result = hasLeftAndRight.test("{hello}");
//        System.out.println(result);
    }
}


