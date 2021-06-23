package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_FileWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		String path = "H:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //colocar o true faz com que ele não recrie o arquivo (não apague e crie de novo) e sim só acrescentar
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
