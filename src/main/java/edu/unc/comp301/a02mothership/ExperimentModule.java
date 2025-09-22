package edu.unc.comp301.a02mothership;

public class ExperimentModule extends AModule {
    private String experimentName;
    private double[] parameters;
    private double result;
    private boolean hasRun;

    public ExperimentModule(String experimentName, double[] parameters) {
        super("ExperimentModule");
        this.experimentName = experimentName;
        this.parameters = parameters;
        this.result = 0;
        this.hasRun = false;
    }

    public void runExperiment() {
        result = 0;
        for (double p : parameters) {
            result += p * Math.random();
        }
        hasRun = true;
    }

    public String getSummary() {
        if (!hasRun) {
            return "Experiment not run yet.";
        }
        return "Experiment '" + experimentName + "' result: " + result;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        if (hasRun) {
            System.out.println("ExperimentModule: " + experimentName + " completed.");
        } else {
            System.out.println("ExperimentModule: " + experimentName + " pending.");
        }
        super.statusReport(moduleStatus, isSuccessful);
    }
}
