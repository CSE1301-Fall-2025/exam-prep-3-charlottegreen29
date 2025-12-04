package exam.codewriting.q3;

/*
 * We wish to create a Song class. A song has-a(n):
	name
	artist
	duration (in seconds)
 */
public class Song {
	
	// Define your instance variables here
	private String name;
	private String artist;
	private int duration;

	// Write the constructor for the Song class
	public Song(String name, String artist, int duration){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	
	public String getName () {
		return this.name;
	}

	public String getArtist () {
		return this.artist;
	}

	public int getDuration() {
		return this.duration;
	}
	
	public String toString () {
		String output = "Song name: " + this.name;
		output += "\nArtist name: " + this.artist;
		output += "\nDuration (in seconds): " + this.duration;
		return output;
	}
	
	/**
	* When two songs are mashed up, a new Song should be created and returned.
	* The name and artist of the new song should contain both names and both
	* artists from the original songs, and the duration should be the average
	* of the durations of the original songs.
	*/
	public Song mashUp ( Song other ) {
		String combinedSongName = this.name + "/" + other.getName();
		String combinedArtistName = this.artist + " and " + other.getArtist();
		int averageDuration = this.duration + other.getDuration(); //I had to make a getDuration method
		Song mashUp = new Song(combinedSongName, combinedArtistName, averageDuration);
		return mashUp;
	}
}
