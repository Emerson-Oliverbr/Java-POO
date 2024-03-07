package course;

public class Program {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String original2 = original.toLowerCase();
		String original3 = original.toUpperCase();
		String original4 = original.trim();
		String original5 = original.substring(2);
		String original6 = original.substring(0, 2);
		String original7 = original.replace('a', '$' );
		String original8 = original.replace("abc", "xyz");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original-" + original + "-");
		System.out.println("toLowerCase-" + original2 + "-");
		System.out.println("toUpperCase-" + original3 + "-");
		System.out.println("trim-" + original4 + "-");
		System.out.println("substring(2)-" + original5 + "-");
		System.out.println("substring(0, 2)-" + original6 + "-");
		System.out.println("replace('a', '$')-" + original7 + "-");
		System.out.println("replace('abc', 'xyz')-" + original8 + "-");
		System.out.println("Index of 'b c': " + i + "-");
		System.out.println("Last index of 'bc': " + j + "-");
		
		String frutas = "banana apple lemon orange";
		String[] vect = frutas.split(" ");
		
		String fruta1 = vect[0];
		String fruta2 = vect[1];
		String fruta3 = vect[2];
		String fruta4 = vect[3];
		
		System.out.println(fruta1);
		System.out.println(fruta2);
		System.out.println(fruta3);
		System.out.println(fruta4);
	}

}
