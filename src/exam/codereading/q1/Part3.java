package exam.codereading.q1;

public class Part3 {

	public static void main(String[] args) {
		//What will print?
		VersionNumber v5 = new VersionNumber ( 5 ) ; // C
		v5.minorBump( ) ; //  S : v 5 . 1 then L: v 5 . 1
		System.out.println(v5) ; //S : v 5 . 2 then  v 5 . 2
	}
}
// !!! Note !!! If there's a toString called in the middle of a line, the print statement will
// execute before the line executes