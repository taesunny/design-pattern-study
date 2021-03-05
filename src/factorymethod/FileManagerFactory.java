package factorymethod;

public class FileManagerFactory {
    public static FileManager getFileManager(String type) {
        if ("NFS".equalsIgnoreCase(type)) {
            return new NFSFileManager();
        } else if ("Local".equalsIgnoreCase(type)) {
            return new LocalFileManager();
        }

        return null;
    }
}
