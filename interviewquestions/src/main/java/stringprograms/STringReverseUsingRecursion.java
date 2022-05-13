package stringprograms;

public class STringReverseUsingRecursion {

	private static String reverse(String str) {

		if (str.length() == 1 || str == null) {
			return str;
		}
		
		System.out.println(str.substring(1));
return reverse(str.substring(1))+str.charAt(0);
		

	}

	public static void main(String[] args) {
		String orgstring="Object";
		
		String revstring=reverse(orgstring);
		System.out.println(revstring);

	}

}
