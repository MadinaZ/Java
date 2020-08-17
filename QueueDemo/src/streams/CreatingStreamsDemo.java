package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        int[] numbers = {1, 2, 3};//such arr don't have stream method
        //So, we have to do like this:
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        //we can also generate arbitrary number of streams:
//        Stream.of(1, 2, 3, 4);


        //we cannot store infinite obj in collections, but we can generate them using streams
        //TO generate infinite/finite streams
        var stream = Stream.generate(() -> Math.random());
        stream
                .limit(3)
                .forEach(n -> System.out.println(n));

        //another method to generate finite/inf streams is iterate() method
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));
    }
}
