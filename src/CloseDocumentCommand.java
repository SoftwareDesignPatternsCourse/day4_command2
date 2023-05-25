
public class CloseDocumentCommand implements Command {
	private Document document;

	public CloseDocumentCommand(Document document) {
		this.document = document;
	}

	public void execute() {
		document.close();
	}
}
