package jan29FileAssignmenyts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readingRowdataInRange {
	

	public void readRowDataInRange(int start,int end) throws IOException {

		File file=new File("../javaAssignments/Writefirst.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		for(int i=1;i<start;i++)
		br.readLine();
		while(end>=start) {	
	    String line=br.readLine();
	    System.out.println(line);
	    end--;
		}
	    br.close();
	}	

	public static void main(String[] args) throws IOException {
		readingRowdataInRange rd=new readingRowdataInRange();
		rd.readRowDataInRange(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}

}
