package lambdas;

//this interface is functional interface bc it has single abstract method
public interface Printer {

    void print(String message); //this is abstract method

//    default void printTwice(String message){ //this is default method
//        System.out.println(message);
//        System.out.println(message);
//    }
}
