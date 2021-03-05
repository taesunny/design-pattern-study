package factorymethod;

public class LocalFileManager extends FileManager {

    @Override
    public void createAFile(String name, String content) {
        System.out.println("Local File Manager - create a file");
    }

    @Override
    public void deleteAFile(String name) {
        System.out.println("Local File Manager - delete a file");
    }

}
