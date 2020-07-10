import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Quine {
	public static void main(String[] args) {
		String[] program = {
				"public class Quine {",
				"\tpublic static void main(String[] args) {",
				"\t\tString[] program = {",
				"\t\t};",
				"\t}",
				"}"
		};
		for (int ix = 0; ix < 3; ix++) {
			System.out.println(program[ix]);
		}

		for (int ix = 0; ix < program.length; ix++) {
			String string = "\"";
			if (program[ix].charAt(0) == '\t') {
				string += "\t";
			}
			System.out.println(string + program[ix].replace("\t", "\\t") + "\",");
		}

//		try {
//			Files.createDirectories(Paths.get("C://TestFolder"));
//			File file = new File("Quine.java");
//			FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//			Process process = Runtime.getRuntime().exec("javac Quine.java");
//			process.waitFor();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
