package exam.codereading.q1;

public class Part2 {

	public static void main(String[] args) {
		//What will print?
		VersionNumber v4 = new VersionNumber( 4 ) ; //C
		VersionNumber v4b = new VersionNumber( 4 ) ; // C
		v4.majorBump( ) ; // B
		System.out.println(v4.isEquivalent( v4b ) ) ; //S v 5 . 0 then S v 4 . 1 then false
	}
}

// !!! Note !!! Whenever you call a toString method, even if you don't print it, the print 
// statements inside of it will print
