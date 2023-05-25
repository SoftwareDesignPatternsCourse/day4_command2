// Client code that demonstrates the usage of the Command design pattern.
public class Client {
	public static void main(String[] args) {
		// Create the receiver object
		Document document = new Document("SampleDocument.txt");

		// Create the concrete commands and associate them with the receiver
		Command openCommand = new OpenDocumentCommand(document);
		Command saveCommand = new SaveDocumentCommand(document);
		Command closeCommand = new CloseDocumentCommand(document);

		// Create the text editor and add commands
		TextEditor textEditor = new TextEditor();
		textEditor.addCommand(openCommand);
		textEditor.addCommand(saveCommand);
		textEditor.addCommand(closeCommand);

		// Execute the commands
		textEditor.executeCommands();
	}
}