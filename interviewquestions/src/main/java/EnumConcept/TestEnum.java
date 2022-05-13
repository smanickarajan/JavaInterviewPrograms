package EnumConcept;

import java.util.Arrays;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Size.SMALL);
		
		System.out.println(Size.SMALL.ordinal());
		
		Size[] values = Size.values();
		System.out.println(Arrays.toString(values));

	}

}
