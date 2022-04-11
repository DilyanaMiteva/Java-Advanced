import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(el -> ++el).toArray();
        Function<int[], int[]> sub = arr -> Arrays.stream(arr).map(el -> --el).toArray();
        Function<int[], int[]> mult = arr -> Arrays.stream(arr).map(el -> el *= 2).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(el -> System.out.print(el + " "));
        String comand = scan.nextLine();
        while (!comand.equals("end")){
            switch (comand){
                case "add":
                    nums = add.apply(nums);
                    break;
                case "subtract":
                    nums = sub.apply(nums);
                    break;
                case "multiply":
                    nums = mult.apply(nums);
                    break;
                default:
                    print.accept(nums);
                    System.out.println();
            }
            comand= scan.nextLine();
        }
    }
}
