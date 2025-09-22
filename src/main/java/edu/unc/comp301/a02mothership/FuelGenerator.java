package edu.unc.comp301.a02mothership;

public class FuelGenerator extends AModule implements IPowerGenerator {
    private int fuel;

    public FuelGenerator(int fuel) {
        super("FuelGenerator");
        this.fuel = fuel;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println("FuelGenerator: " + fuel + " units of fuel remaining.");
        super.statusReport(moduleStatus, isSuccessful);
    }

    @Override
    public int generatePower() {
        if (fuel >= 10) {
            fuel -= 10;
            return 10;
        } else {
            int remaining = fuel;
            fuel = 0;
            return remaining;
        }
    }
}
