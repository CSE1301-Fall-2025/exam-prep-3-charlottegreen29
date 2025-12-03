package exam.codereading.q1;

public class Part1 {

	public static void main(String[] args) {
		//What will print?
		VersionNumber v3 = new VersionNumber ( 3 ) ; //C
		v3.majorBump ( ) ; //B
		System.out.println ( v3 ) ; //v 4 . 0 or //S : v 4 . 0 and then the first thing
	}
}
 // okay, it printed S : v 4 . 0 and then v 4 . 0, which means that...

 // !!! Note !!! if there's a print statement in a toString method, when you call the toString
 // method, it will print the things in the print statement and then what the toString returns