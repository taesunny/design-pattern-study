import builder.BuilderPatternRunner;
import command.CommandPatternRunner;
import decorator.DecoratorPatternRunner;
import factorymethod.FactoryMethodPatternRunner;
import iterator.IteratorPatternRunner;
import singleton.SingletonPatternRunner;
import strategy.StrategyPatternRunner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, It's Design Pattern Tester!");
        System.out.println("");

        new FactoryMethodPatternRunner().run();
        System.out.println("");

        new BuilderPatternRunner().run();
        System.out.println("");

        new SingletonPatternRunner().run();
        System.out.println("");

        new DecoratorPatternRunner().run();
        System.out.println("");

        new CommandPatternRunner().run();
        System.out.println("");

        new StrategyPatternRunner().run();
        System.out.println("");

        new IteratorPatternRunner().run();
        System.out.println("");
    }
}
