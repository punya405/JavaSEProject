package CoreConcept;

public class LongestUniformString {

	public static void main(String[] args) {
		
		lonestString("abbbccddaaaaaa");
		lonestStringN("abbbbcfdaaaaaaa");
		
		//b.doubleT();
		System.out.println(mySqrt(8));
	}
	 public static int mySqrt(int x) {
	        long start = 0;
	        long end = x;
	        
	        while (start + 1 < end) {
	            long mid = start + (end - start) / 2;
	            if (mid * mid == x) {
	                return (int)mid;
	            } else if (mid * mid < x) {
	                start = mid;
	            } else {
	                end = mid;
	            }
	        }
	        
	        if (end * end == x) {
	            return (int)end;
	        }
	        return (int)start;
	    }

	private static void lonestString(String string) {
		int max_c=1;
		int s=0;
		int e=0;
		for(int i=0;i<string.length();i++) {
			int c=1;
			for(int j=i+1;j<string.length();j++) {
				if(string.charAt(i)==string.charAt(j)) {
					c++;
					if(max_c<c) {
						max_c=c;
						s=i;
						e=j;
					}
				}else {
					break;
				}
			}
		}
		
		System.out.println("c "+max_c+" str "+string.substring(s,e+1));
		
	}
	private static void lonestStringN(String string) {
		int max_c=1;
		int s=0;
		int e=0;
		for(int i=0;i<string.length();i++) {
			int c=1;
			
			int start=i;
			while (i<string.length()-1 && string.charAt(i)==string.charAt(i+1)) {
					c++;
					if(max_c<c) {
						max_c=c;
						s=start;
						e=i+1;
					}
					i++;
				}
			}
		
		System.out.println("c "+max_c+" str "+string.substring(s,e+1));
		
	}

}

class A{
	
	int doubleT() throws Exception{
		return 5;
	}
}

class B extends A{
	
	@Override
	int doubleT() throws ArithmeticException {
		// TODO Auto-generated method stub
		return 7/0;
	}

}
