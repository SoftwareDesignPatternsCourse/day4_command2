import java.util.ArrayList;
import java.util.List;

public class TextEditor {
	private List<Command> commands;

	public TextEditor() {
		commands = new ArrayList<>();
	}

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeCommands() {
		for (Command command : commands) {
			command.execute();
		}
		commands.clear();
	}
}