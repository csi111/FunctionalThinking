package functionalthinking.chapter2;

import java.util.stream.IntStream;

public class Numberclassifier {
    private static IntStream factorsOf(int number) {
        return IntStream.range(1, number +1).filter(potential -> number % potential ==0);
    }

    private static int aliquotSum(int number) {
        return factorsOf(number).sum() - number;
    }

    public static boolean isPerfect(int number) {
        return aliquotSum(number) == number;
    }

    public static boolean isAbundant(int number){
        return aliquotSum(number) > number;
    }

    public static boolean isDeficient(int number) {
        return aliquotSum(number) < number;
    }

}
