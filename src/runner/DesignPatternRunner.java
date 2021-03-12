package runner;

public abstract class DesignPatternRunner {
    public String name;

    protected void printStart() {
        System.out.println("--- " + name + " Pattern Example Start! ---");
    }

    protected void printEnd() {
        System.out.println("--- " + name + " Pattern Example End! ---");
    }

    public DesignPatternRunner(String name) {
        this.name = name;
    }

    public void run() {
        printStart();

        runInner();

        printEnd();
    }

    abstract protected void runInner();
}
