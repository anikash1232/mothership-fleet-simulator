package edu.unc.comp301.a02mothership;

import java.util.ArrayList;
import java.util.List;

public class Mothership {
    private IPowerGenerator powerGenerator;
    private ThrusterModule thrusterModule;
    private ExperimentModule experimentModule;
    private List<IModule> modules;

    public Mothership(IPowerGenerator powerGenerator,
                      ThrusterModule thrusterModule,
                      ExperimentModule experimentModule) {
        this.powerGenerator = powerGenerator;
        this.thrusterModule = thrusterModule;
        this.experimentModule = experimentModule;

        modules = new ArrayList<>();
        modules.add(powerGenerator);
        modules.add(thrusterModule);
        modules.add(experimentModule);
    }

    public Mothership(IPowerGenerator powerGenerator,
                      ThrusterModule thrusterModule,
                      ExperimentModule experimentModule,
                      ShieldModule shieldModule) {
        this(powerGenerator, thrusterModule, experimentModule);
        modules.add(shieldModule);
    }

    public int requestPower() {
        return powerGenerator.generatePower();
    }

    public boolean fireThruster(int availablePower) {
        return thrusterModule.thrust(availablePower);
    }

    public void runExperiment() {
        experimentModule.runExperiment();
    }

    public void printStatusReports() {
        for (IModule m : modules) {
            m.statusReport("Normal", true);
        }
    }

    public String getExperimentSummary() {
        return experimentModule.getSummary();
    }

    public boolean createMayhem() {
        return true;
    }
}
