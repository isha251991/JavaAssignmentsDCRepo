package jan29FileAssignmenyts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class readingRowData {
	
	public void readRowData(int rowNum) throws IOException {

		File file=new File("../javaAssignments/Writefirst.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		for(int i=1;i<rowNum;i++)
		br.readLine();
	    String line=br.readLine();
	    System.out.println(line);
	    br.close();
	}	

	public static void main(String[] args) throws IOException {
		readingRowData rd=new readingRowData();
		rd.readRowData(Integer.parseInt(args[0]));
		
	}
}
