package jan29FileAssignmenyts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//package jan29FileAssignmenyts;

public class copyingFile {

	public void copyPasteData() throws IOException {
		String line;
		File file=new File("../javaAssignments/Writefirst.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		//Creating new file
		File newFile=new File("NewFile.txt");
		FileWriter fw=new FileWriter(newFile);
		BufferedWriter bw=new BufferedWriter(fw);
		
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			
		}
		
	 bw.close();
	 fr.close();
	 System.out.println("Copied Successfully");
	}
	
	public static void main(String[] args) throws IOException {
		copyingFile copiedFile=new copyingFile();
		copiedFile.copyPasteData();
	}
}
