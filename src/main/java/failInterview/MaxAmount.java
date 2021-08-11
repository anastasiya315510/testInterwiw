/*
 author Anastasiya
 created on 11/08/2021
 */


package failInterview;



import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import static java.util.stream.Collectors.counting;

public class MaxAmount {

    public int calculateYearOfMaxAmountOfPeople(List<Life> lifeList) {
        Map<Integer, Long> longMap = lifeList.stream().flatMapToInt(this::isAlive)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), counting()));
      return longMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    private IntStream isAlive(Life p) {
     return  IntStream.range(p.getWasBorn(), p.getDeath());
    }
}
