import builder.ContainerConfig;
import factorymethod.FileManager;
import factorymethod.FileManagerFactory;
import singleton.MyOnlyOne;

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
    }

    private static void runFactoryMethodExample() {
        System.out.println("--- Factory Method Example Start! ---");

        FileManager nfsFM = FileManagerFactory.getFileManager("NFS");
        nfsFM.createAFile("test-name", "test-content");
        nfsFM.deleteAFile("test-name");

        FileManager localFM = FileManagerFactory.getFileManager("Local");
        localFM.createAFile("test-name", "test-content");
        localFM.deleteAFile("test-name");

        System.out.println("--- Factory Method Example End! ---");
    }

    private static void runBuilderExample() {
        System.out.println("--- Builder Example Start! ---");

        System.out.println("Container Config1:");
        ContainerConfig config1 = new ContainerConfig.Builder("name1", "ubuntu").port(80).autoRestart(true).build();
        System.out.println("--- port: " + config1.getPort());
        System.out.println("--- autoRestart: " + config1.isAutoRestart());

        System.out.println("Container Config2:");
        ContainerConfig config2 = new ContainerConfig.Builder("name2", "mysql").build();
        System.out.println("--- port: " + config2.getPort());
        System.out.println("--- autoRestart: " + config2.isAutoRestart());

        System.out.println("--- Builder Example End! ---");
    }

    private static void runSingletonExample() {
        System.out.println("--- Singleton Example Start! ---");

        System.out.println("Create the First Object");
        MyOnlyOne moo1 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo1.hashCode());

        System.out.println("Create the Second Object");
        MyOnlyOne moo2 = MyOnlyOne.getMyOnlyOne();
        System.out.println("--- hashCode: " + moo2.hashCode());

        System.out.println("--- Singleton Example End! ---");
    }
}
