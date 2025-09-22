package edu.unc.comp301.a02mothership;

public class SolarGenerator extends AModule implements IPowerGenerator {

    public SolarGenerator() {
        super("SolarGenerator");
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println("Solar Generators will never die");
        super.statusReport(moduleStatus, isSuccessful);
    }

    @Override
    public int generatePower() {
        return 10;
    }
}