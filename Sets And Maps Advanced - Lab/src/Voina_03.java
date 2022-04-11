import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> firstPlayer = getCollect(sc.nextLine());
        Set<Integer> secondPlayer = getCollect(sc.nextLine());

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) break;

            Iterator<Integer> fPlaIter = firstPlayer.iterator();
            Iterator<Integer> sPlaIter = secondPlayer.iterator();

            int firPVal = fPlaIter.next();
            firstPlayer.remove(firPVal);
            int secPVal = sPlaIter.next();
            secondPlayer.remove(secPVal);

            if (firPVal > secPVal){
                firstPlayer.add(firPVal);
                firstPlayer.add(secPVal);
            }else if (secPVal > firPVal){
                secondPlayer.add(firPVal);
                secondPlayer.add(secPVal);
            }else {
                firstPlayer.add(firPVal);
                secondPlayer.add(secPVal);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        }else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw");
        }
    }

    static LinkedHashSet<Integer> getCollect(String line) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).forEach(res::add);
        return res;
    }
}
