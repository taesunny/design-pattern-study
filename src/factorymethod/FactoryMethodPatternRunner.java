package factorymethod;

import runner.DesignPatternRunner;

public class FactoryMethodPatternRunner extends DesignPatternRunner {
    public FactoryMethodPatternRunner() {
        super("Factory Method");
    }

    @Override
    protected void runInner() {
        FileManager nfsFM = FileManagerFactory.getFileManager("NFS");
        nfsFM.createAFile("test-name", "test-content");
        nfsFM.deleteAFile("test-name");

        FileManager localFM = FileManagerFactory.getFileManager("Local");
        localFM.createAFile("test-name", "test-content");
        localFM.deleteAFile("test-name");
    }
}
