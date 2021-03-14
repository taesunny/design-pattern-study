package decorator;

import runner.DesignPatternRunner;

public class DecoratorPatternRunner extends DesignPatternRunner {
    public DecoratorPatternRunner() {
        super("Decorator");
    }

    @Override
    protected void runInner() {
        Printer p = new PhotoPrinter();
        System.out.println("--- Default Printer: " + p.print("my-photo"));

        Printer pCuteFiltered = new CuteDecorator(new PhotoPrinter());
        System.out.println("--- Default Printer with Cute Filter: " + pCuteFiltered.print("my-photo"));

        Printer pBlackAndWhiteFiltered = new BlackAndWhiteDecorator(new PhotoPrinter());
        System.out
                .println("--- Default Printer with BlackAndWhite Filter: " + pBlackAndWhiteFiltered.print("my-photo"));

        Printer pCuteAndBlackAndWhiteFiltered = new CuteDecorator(new BlackAndWhiteDecorator(new PhotoPrinter()));
        System.out.println("--- Default Printer with Cute Filter and BlackAndWhite Filter: "
                + pCuteAndBlackAndWhiteFiltered.print("my-photo"));
    }
}
