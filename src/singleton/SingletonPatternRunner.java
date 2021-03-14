package singleton;

import runner.DesignPatternRunner;

public class SingletonPatternRunner extends DesignPatternRunner {
    public SingletonPatternRunner() {
        super("Singleton");
    }

    @Override
    protected void runInner() {
        System.out.println("Create the First Object");
        MyOnlyOne moo1 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo1.hashCode());

        System.out.println("Create the Second Object");
        MyOnlyOne moo2 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo2.hashCode());
    }
}
