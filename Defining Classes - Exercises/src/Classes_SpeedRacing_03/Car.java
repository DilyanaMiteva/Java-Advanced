package Classes_SpeedRacing_03;

public class Car {
    private static int distanceTraveled = 0;

    private String model;
    private int fuelAmount;
    private double fuelCost1Kilometer;

    public Car(String model, int fuelAmount, double fuelCost1Kilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost1Kilometer = fuelCost1Kilometer;
    }

    public Car(int distanceTraveled) {
        Car.distanceTraveled = distanceTraveled;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCost1Kilometer() {
        return fuelCost1Kilometer;
    }


    public int getDistanceTraveled() {
        return Car.distanceTraveled;
    }


    public void CanIReachTheDistance(int fuelAmount, int amountOfKm) {
        if (fuelCost1Kilometer * amountOfKm <= fuelAmount) {
            fuelAmount -= fuelCost1Kilometer * amountOfKm;
            distanceTraveled += amountOfKm;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", model, fuelAmount, distanceTraveled);
    }
}
