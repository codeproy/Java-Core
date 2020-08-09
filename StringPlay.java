
public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcd";
		a.concat("xyz");
		//String Immutable
		System.out.println(a);
		//String byffer mutable
		StringBuffer b = new StringBuffer("abcd");
		b.append("xyz");
		System.out.println(b);
		a.length();
		
		String c = "abcd";
		String d = new String("abcd");
		System.out.println(a==c);
		System.out.println(a.equals(c));
		System.out.println(a==d);
		System.out.println(a.equals(d));
		//System.out.println(a.substring(1, 2) + " " + a.substring(1));
		//if (5 >= 3) {
		//}

	}

}
