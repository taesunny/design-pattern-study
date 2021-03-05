package factorymethod;

public abstract class FileManager {
    public abstract void createAFile(String name, String content);

    public abstract void deleteAFile(String name);
}
