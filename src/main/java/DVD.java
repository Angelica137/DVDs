public class DVD {
	String name;
	int releaseYear;
	String director;

	// Constructor
	DVD(String name, String director, int releaseYear) {
		this.name = name;
		this.director = director;
		this.releaseYear = releaseYear;

	}

	public String info() {
		return (this.name + ". Directed by: " + this.director + ". Released on: " + this.releaseYear);

	}
}