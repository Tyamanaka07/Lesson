package obj;

public class StrSample {

	public static void main(String[] args) {
		String s1 = "This is Java";
		String s2 = "java";

		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("同じ");
		}
		else {
			System.out.println("違う");
		}
		if(s1.isEmpty()) {
			System.out.println("空文字です");
		}
		if(s1.contains("Java")) {
			System.out.println("含まれています。");
		}
		if(s1.endsWith("Java")) {
			System.out.println("終わりますよ");
		}
		if(s1.startsWith("This")) {
			System.out.println("始まりますねぇ！！");
		}
		System.out.println(s1.lastIndexOf("is"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0, 4));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("Java", "C++"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("yos");
		sb.append("oka");
		sb.append("mom");
		sb.append("i17");
		
		String s = sb.toString();
		System.out.println(s);
		
		s = "Hello";
		s += "Wolrd";
	}

}
