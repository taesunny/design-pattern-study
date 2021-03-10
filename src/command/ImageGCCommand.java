package command;

public class ImageGCCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Garbage Collecting Images...");
    }

    @Override
    public void undo() {
        System.out.println("Undo Image GC");
    }
}
