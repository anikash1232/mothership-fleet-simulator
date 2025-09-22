package edu.unc.comp301.a02mothership;

public class ShieldModule extends AModule {
    private boolean shieldsUp;

    public ShieldModule() {
        super("ShieldModule");
        this.shieldsUp = false;
    }

    public void raiseShields() {
        shieldsUp = true;
        System.out.println("Shields are up! Ready for impact.");
    }

    public void lowerShields() {
        shieldsUp = false;
        System.out.println("Shields are down. Proceed with caution.");
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println("ShieldModule: Shields currently " + (shieldsUp ? "UP" : "DOWN"));
        super.statusReport(moduleStatus, isSuccessful);
    }
}