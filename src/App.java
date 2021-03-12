import builder.ContainerConfig;
import command.ContainerGCCommand;
import command.GCController;
import command.ImageGCCommand;
import decorator.BlackAndWhiteDecorator;
import decorator.CuteDecorator;
import decorator.PhotoPrinter;
import decorator.Printer;
import factorymethod.FileManager;
import factorymethod.FileManagerFactory;
import singleton.MyOnlyOne;
import strategy.StrategyPatternRunner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, It's Design Pattern Tester!");
        System.out.println("");

        runFactoryMethodExample();
        System.out.println("");

        runBuilderExample();
        System.out.println("");

        runSingletonExample();
        System.out.println("");

        runDecoratorExample();
        System.out.println("");

        runCommandExample();
        System.out.println("");

        new StrategyPatternRunner("Strategy").run();
        System.out.println("");
    }

    private static void runFactoryMethodExample() {
        System.out.println("--- Factory Method Pattern Example Start! ---");

        FileManager nfsFM = FileManagerFactory.getFileManager("NFS");
        nfsFM.createAFile("test-name", "test-content");
        nfsFM.deleteAFile("test-name");

        FileManager localFM = FileManagerFactory.getFileManager("Local");
        localFM.createAFile("test-name", "test-content");
        localFM.deleteAFile("test-name");

        System.out.println("--- Factory Method Pattern Example End! ---");
    }

    private static void runBuilderExample() {
        System.out.println("--- Builder Pattern Example Start! ---");

        System.out.println("Container Config1:");
        ContainerConfig config1 = new ContainerConfig.Builder("name1", "ubuntu").port(80).autoRestart(true).build();
        System.out.println("--- port: " + config1.getPort());
        System.out.println("--- autoRestart: " + config1.isAutoRestart());

        System.out.println("Container Config2:");
        ContainerConfig config2 = new ContainerConfig.Builder("name2", "mysql").build();
        System.out.println("--- port: " + config2.getPort());
        System.out.println("--- autoRestart: " + config2.isAutoRestart());

        System.out.println("--- Builder Pattern Example End! ---");
    }

    private static void runSingletonExample() {
        System.out.println("--- Singleton Pattern Example Start! ---");

        System.out.println("Create the First Object");
        MyOnlyOne moo1 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo1.hashCode());

        System.out.println("Create the Second Object");
        MyOnlyOne moo2 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo2.hashCode());

        System.out.println("--- Singleton Pattern Example End! ---");
    }

    private static void runDecoratorExample() {
        System.out.println("--- Decorator Pattern Example Start! ---");

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

        System.out.println("--- Decorator Pattern Example End! ---");
    }

    private static void runCommandExample() {
        System.out.println("--- Command Pattern Example Start! ---");

        ImageGCCommand imageGCCommand = new ImageGCCommand();
        ContainerGCCommand containerGCCommand = new ContainerGCCommand();

        GCController gcController = new GCController();

        gcController.setImageGCControllerCommand(imageGCCommand);
        gcController.setContainerGCCommand(containerGCCommand);

        System.out.println("--- Try GC");
        gcController.gc();

        System.out.println("--- I want to revertAll Commands");
        gcController.revertAll();

        System.out.println("--- Command Pattern Example End! ---");
    }
}
