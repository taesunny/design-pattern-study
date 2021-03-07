import builder.ContainerConfig;
import factorymethod.FileManager;
import factorymethod.FileManagerFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, It's Design Pattern Tester!");
        System.out.println("");

        runFactoryMethodExample();
        System.out.println("");

        runBuilderExample();
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
}
