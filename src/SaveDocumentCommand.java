public class SaveDocumentCommand implements Command {
	private Document document;

	public SaveDocumentCommand(Document document) {
		this.document = document;
	}

	public void execute() {
		document.save();
	}
}
