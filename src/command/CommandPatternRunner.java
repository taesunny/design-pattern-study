package command;

import runner.DesignPatternRunner;

public class CommandPatternRunner extends DesignPatternRunner {
    public CommandPatternRunner() {
        super("Command");
    }

    @Override
    protected void runInner() {
        ImageGCCommand imageGCCommand = new ImageGCCommand();
        ContainerGCCommand containerGCCommand = new ContainerGCCommand();

        GCController gcController = new GCController();

        gcController.setImageGCControllerCommand(imageGCCommand);
        gcController.setContainerGCCommand(containerGCCommand);

        System.out.println("--- Try GC");
        gcController.gc();

        System.out.println("--- I want to revertAll Commands");
        gcController.revertAll();
    }
}
