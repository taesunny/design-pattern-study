package command;

import java.util.Stack;

public class GCController {
    private Command imageGCCommand;
    private Command containerGCCommand;

    private Stack<Command> commandHistory;

    public GCController() {
        this.commandHistory = new Stack<>();
    }

    public void setImageGCControllerCommand(Command command) {
        this.imageGCCommand = command;
    }

    public void setContainerGCCommand(Command command) {
        this.containerGCCommand = command;
    }

    public void gc() {
        this.imageGCCommand.execute();
        this.commandHistory.add(this.imageGCCommand);

        this.containerGCCommand.execute();
        this.commandHistory.add(this.containerGCCommand);
    }

    public void revertAll() {
        while (!this.commandHistory.isEmpty()) {
            Command cmd = this.commandHistory.pop();
            cmd.undo();
        }
    }
}
