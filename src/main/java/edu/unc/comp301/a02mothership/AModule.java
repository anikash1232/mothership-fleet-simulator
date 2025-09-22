package edu.unc.comp301.a02mothership;

public abstract class AModule implements IModule {
    private String name;

    public AModule(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void statusReport(String moduleStatus, boolean isSuccessful) {
        System.out.println(name + " is " + moduleStatus + "...");
        if (isSuccessful) {
            System.out.println("Action Successful.");
        } else {
            System.out.println(name + " needs immediate attention!");
        }
    }
}

