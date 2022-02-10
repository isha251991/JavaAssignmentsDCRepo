package jan29FileAssignmenyts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeDataWithRowCount {
	
	public void writeDataTillRowCount(int rowNum) throws IOException {
		
		Scanner s=new Scanner(System.in);
		File file=new File("Writefirst.txt");//Creating connecting referring to simply object
		FileWriter fw=new FileWriter(file);//create an actual file
		BufferedWriter bw=new BufferedWriter(fw);//wrapping file writer in a higher level class
		while(rowNum>0) {
			System.out.println("Enter data to write in file");
			bw.write(s.nextLine());
			bw.newLine();
			rowNum--;
		}
		
		System.out.println("Data written successfully");
		
	bw.flush();
	bw.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		writeDataWithRowCount write=new writeDataWithRowCount();
		write.writeDataTillRowCount(Integer.parseInt(args[0]));
	}

}
