package builder;

import runner.DesignPatternRunner;

public class BuilderPatternRunner extends DesignPatternRunner {
    public BuilderPatternRunner() {
        super("Builder");
    }

    @Override
    protected void runInner() {
        System.out.println("Container Config1:");
        ContainerConfig config1 = new ContainerConfig.Builder("name1", "ubuntu").port(80).autoRestart(true).build();
        System.out.println("--- port: " + config1.getPort());
        System.out.println("--- autoRestart: " + config1.isAutoRestart());

        System.out.println("Container Config2:");
        ContainerConfig config2 = new ContainerConfig.Builder("name2", "mysql").build();
        System.out.println("--- port: " + config2.getPort());
        System.out.println("--- autoRestart: " + config2.isAutoRestart());
    }
}
