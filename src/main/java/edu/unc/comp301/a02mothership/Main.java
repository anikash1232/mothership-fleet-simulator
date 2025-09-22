package edu.unc.comp301.a02mothership;

public class Main {
    public static void main(String[] args) {
        // Step 1: Choose a power source
        IPowerGenerator generator = new SolarGenerator();
        // You can swap this line later with:
        // IPowerGenerator generator = new FuelGenerator(50);

        // Step 2: Assemble modules
        ThrusterModule thruster = new ThrusterModule();
        double[] params = {1.2, 3.4, 5.6};
        ExperimentModule experiment = new ExperimentModule("TestExp", params);

        // Step 3: Launch mothership
        Mothership ship = new Mothership(generator, thruster, experiment);

        // Step 4: Request power
        int power = ship.requestPower();
        System.out.println("Mothership requested power: " + power);

        // Step 5: Fire thruster
        boolean fired = ship.fireThruster(power);
        System.out.println("Thruster fired? " + (fired ? "Yes" : "No"));

        // Step 6: Run experiment
        ship.runExperiment();
        System.out.println(ship.getExperimentSummary());

        // Step 7: Print status reports
        ship.printStatusReports();

        // Step 8: Mayhem check
        System.out.println("Create Mayhem? " + ship.createMayhem());
    }
}
