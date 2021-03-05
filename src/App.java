import factorymethod.FileManager;
import factorymethod.FileManagerFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, It's Design Pattern Tester!");

        runFactoryMethodExample();
    }

    private static void runFactoryMethodExample() {
        System.out.println("--- Factory Method Example Start!");

        FileManager nfsFM = FileManagerFactory.getFileManager("NFS");
        nfsFM.createAFile("test-name", "test-content");
        nfsFM.deleteAFile("test-name");

        FileManager localFM = FileManagerFactory.getFileManager("Local");
        localFM.createAFile("test-name", "test-content");
        localFM.deleteAFile("test-name");

        System.out.println("--- Factory Method Example End!");
    }
}
