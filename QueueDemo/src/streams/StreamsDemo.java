package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void show() {
       //FLATMAP
        //w flatmap we can flaten lists, sets, ...
        //Stream<List<x>> -> Stream<x>
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(n -> System.out.println(n));



        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );


//        //Imperative Programming
//        int count = 0;
//        for (var movie : movies)
//            if (movie.getLikes() > 10)
//                count++;
//
//        //Declarative Programming
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//        System.out.println(count2);



        //Interested only in movie titles
//        movies.stream()
//                .map(movie -> movie.getName())
//                .forEach(name -> System.out.println(name));

//        movies.stream()
//                //displays the first two items
////                .limit(2)
//                .skip(2)//skips first two items
//                .forEach(n -> System.out.println(n.getName()));

        //1000 movies
        //10 movies per page
        //3rd page
        //skip(20) = skip( (page - 1) * pageSize)
        //limit(10) = limit(pageSize)

        //each passed object, in this case a and b are movie objects
        //so, when we say a. it shows the methods of movie class
// //        movies.stream()
//                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                //or .sorted(Comparator.comparing(m -> getName()))
                //below is the simpler way of implementation of the line above(that's why it gray)
                //method reference
// //               .sorted(Comparator.comparing(Movie::getName).reversed())
// //               .forEach(m -> System.out.println(m.getName()));

       var result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);

        var result2 = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20, Collectors.mapping(Movie::getName, Collectors.joining(", "))));
        System.out.println(result2);
    }
}
