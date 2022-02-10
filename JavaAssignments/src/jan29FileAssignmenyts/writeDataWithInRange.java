package jan29FileAssignmenyts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeDataWithInRange {
	
public void writeDataInRange(int start,int end) throws IOException {
		
		Scanner s=new Scanner(System.in);
		File file=new File("Writefirst.txt");//Creating connecting referring to simply object
		FileWriter fw=new FileWriter(file);//create an actual file
		BufferedWriter bw=new BufferedWriter(fw);//wrapping file writer in a higher level class
		for(int i=1;i<start;i++)
			bw.newLine();
		while(end>=start) {
			System.out.println("Enter data to write in file");
			bw.write(s.nextLine());
			bw.newLine();
			end--;
		}
		
		System.out.println("Data written successfully");
		
	bw.flush();
	bw.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		writeDataWithInRange write=new writeDataWithInRange();
		write.writeDataInRange(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}

}
