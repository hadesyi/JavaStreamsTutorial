package Optional;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by hadeslee on 2017-09-22.
 */
public class OptionalTest5 {
    public static void main(String[] args) {
        OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();

        if (maxOdd.isPresent()) {
            int value = maxOdd.getAsInt();
            System.out.println("Maximum odd integer is " + value);
        } else {
            System.out.println("Stream is empty.");
        }
    }
}
