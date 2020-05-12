package obj;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {

	public static void main(String[] args) throws IOException {
//		try(FileWriter fw = new FileWriter("data.txt");){
//			fw.write("hello!");
//		}
//		catch(IOException e) {
//			System.out.println("エラ-：" + e.getMessage());
//		}
//
//	}
		sub();
	}

	public static void sub() throws IOException{
		try {
			subsub();
		}
		catch(Exception e) {
			System.out.println("エラーです");
		}
	}

	public static void subsub() throws IOException{
		FileWriter fw = new FileWriter("data.txt");
	}
}
