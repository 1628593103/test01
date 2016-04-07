package test;

public class test {
	public static void main(String[] args) {
//		String dir="BG3 - Storyline output\\lms\\01.xml";
		String dir="BG3 - Storyline output\\01.xml";
		String newDir = dir.substring( dir.indexOf("\\")+1);
		System.out.println(newDir);
	}

}
