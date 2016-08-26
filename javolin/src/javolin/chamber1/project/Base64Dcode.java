package javolin.chamber1.project;

//https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/Base64
public class Base64Dcode {

	private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	public static String base64Dcode(String s) {
		String r = "";
		for (int c = 0; c < s.length(); c += 4) {

			int n = (base64chars.indexOf(s.charAt(c)) << 18) + (base64chars.indexOf(s.charAt(c + 1)) << 12)
					+ (base64chars.indexOf(s.charAt(c + 2)) << 6) + base64chars.indexOf(s.charAt(c + 3));
			r += "" + (char) ((n >>> 16) & 0xFF) + (char) ((n >>> 8) & 0xFF) + (char) (n & 0xFF);
		}

		return r;
	}

	public static void main(String a[]) {
		String s = Base64Dcode.base64Dcode("YWJjZGUA");
		System.out.println(s);

	}

}
