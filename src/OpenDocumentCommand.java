public class OpenDocumentCommand implements Command {
	private Document document;

	public OpenDocumentCommand(Document document) {
		this.document = document;
	}

	public void execute() {
		document.open();
	}
}
