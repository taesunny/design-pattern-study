package command;

public class ContainerGCCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Garbage Collecting Containers...");
    }

    @Override
    public void undo() {
        System.out.println("Undo Container GC");
    }
}
