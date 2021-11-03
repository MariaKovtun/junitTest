import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5);
        List<Integer> res = manipulate(intList);
        System.out.println(res);
    }

    public static List<Integer> manipulate(List<Integer> intList) {
        Stream<Integer> stream = intList.stream();

        return stream.filter(x -> x > 0).
                filter(x -> x % 2 == 0).
                sorted(Comparator.naturalOrder()).
                collect(Collectors.toList());
    }
}
