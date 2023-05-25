public class Document {
	private String name;

	public Document(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("Opening document: " + name);
	}

	public void save() {
		System.out.println("Saving document: " + name);
	}

	public void close() {
		System.out.println("Closing document: " + name);
	}
}
