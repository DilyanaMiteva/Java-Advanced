import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");
        Consumer<String > print = word -> System.out.println("Sir " +word);
        Arrays.stream(line).forEach(print);
    }
}
