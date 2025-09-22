package edu.unc.comp301.a02mothership;

public class ThrusterModule extends AModule {
    private int fuel;
    private boolean lastFired;

    public ThrusterModule() {
        super("ThrusterModule");
        this.fuel = 100;      // default starting fuel
        this.lastFired = false;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println("ThrusterModule: " + fuel + " units of fuel remaining. Last fired: "
                + (lastFired ? "Yes" : "No"));
        super.statusReport(moduleStatus, isSuccessful);
    }

    public boolean thrust(int availablePower) {
        if (fuel >= 5 && availablePower >= 5) {
            fuel -= 5;
            lastFired = true;
            System.out.println("ALERT Captain: 5 fuel used for propulsion maneuver.");
            return true;
        } else {
            lastFired = false;
            System.out.println("ThrusterModule: Not enough power or fuel to fire.");
            return false;
        }
    }
}