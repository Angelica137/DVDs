public class DVD {
	String name;

	// Constructor
	DVD(String name) {
		this.name = name;
	}

	public String info() {
		return (this.name);
	}

	DVD[] dvdLibrary = new DVD[100];

}