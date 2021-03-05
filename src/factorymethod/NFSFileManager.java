package factorymethod;

public class NFSFileManager extends FileManager {

    @Override
    public void createAFile(String name, String content) {
        System.out.println("NFS File Manager - create a file");
    }

    @Override
    public void deleteAFile(String name) {
        System.out.println("NFS File Manager - delete a file");
    }

}
