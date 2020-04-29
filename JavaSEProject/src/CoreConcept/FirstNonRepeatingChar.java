package CoreConcept;

import java.util.Arrays;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		char[] c=new char[256];
		
		String s="apple";
		
		System.out.println((int)c[95]);		
		for(int i=0;i<s.length();i++) {
			c[s.charAt(i)]++;
		}
		System.out.println(Arrays.toString(c));
		
		int index = -1, i;

		for (i = 0; i < s.length(); i++) {
			if (c[s.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		
		System.out.println(s.charAt(index));
		
	}

}
