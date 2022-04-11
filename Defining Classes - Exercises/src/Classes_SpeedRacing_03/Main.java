package Classes_SpeedRacing_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens[0].equals("Drive")) {
                String model = tokens[1];
                double amountOfKm = Double.parseDouble(tokens[2]);



            } else {
                String model = tokens[0];
                int fuelAmount = Integer.parseInt(tokens[1]);
                double fuelCostForOneKilometer = Double.parseDouble(tokens[2]);
                Car car = new Car(model, fuelAmount, fuelCostForOneKilometer);
                cars.add(car);
            }
        }
    }
}
