import java.util.function.Function
import java.util.stream.Collectors

Integer[] array = [1, 3, 4, 5, 1, 5, 4]
List<Integer> list = Arrays.asList(array)
HashMap<Integer, Long> counted = new HashMap<>(list.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

print(counted)