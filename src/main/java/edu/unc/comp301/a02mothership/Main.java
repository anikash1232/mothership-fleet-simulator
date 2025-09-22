package edu.unc.comp301.a02mothership;

public class Main {
    public static void main(String[] args) {
        IPowerGenerator generator = new SolarGenerator();
        ThrusterModule thruster = new ThrusterModule();
        double[] params = {1.2, 3.4, 5.6};
        ExperimentModule experiment = new ExperimentModule("TestExp", params);
        ShieldModule shields = new ShieldModule();

        Mothership ship = new Mothership(generator, thruster, experiment, shields);

        shields.raiseShields();

        int power = ship.requestPower();
        System.out.println("Mothership requested power: " + power);

        boolean fired = ship.fireThruster(power);
        System.out.println("Thruster fired? " + (fired ? "Yes" : "No"));

        ship.runExperiment();
        System.out.println(ship.getExperimentSummary());

        ship.printStatusReports();

        System.out.println("Create Mayhem? " + ship.createMayhem());
    }
}