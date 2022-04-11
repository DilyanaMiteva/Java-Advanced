import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> listWithGuests = new HashSet<>();
        List<String> vipGuests = new ArrayList<>();
        List<String> regularGuests = new ArrayList<>();
        
        while (!input.equals("PARTY")){
            listWithGuests.add(input);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")){
            if (listWithGuests.contains(input)){
                listWithGuests.remove(input);
            }
            
            input = scanner.nextLine();
        }

        for (String guest : listWithGuests) {
            if (Character.isDigit(guest.charAt(0))) {
                vipGuests.add(guest);
            } else {
                regularGuests.add(guest);
            }
        }


        System.out.println(vipGuests.size() + regularGuests.size());

//        for (String vipGuest : vipGuests) {
//            System.out.println(vipGuest);
//        }
//        for (String regularGuest : regularGuests) {
//            System.out.println(regularGuest);
//        }

        vipGuests.stream().sorted().forEach(e -> System.out.println(e));
        regularGuests.stream().sorted().forEach(e -> System.out.println(e));

    }
}
