package printJ_FileReader.questions01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//1
public class Main {
	
	public static void main(String[] args) {
		//2
		String filepath = "csv/KakeiboData.csv";
		//3
		File f = new File(filepath);
		//4
		if(f.exists()) {
			try(FileReader fr = new FileReader(filepath);
					BufferedReader br = new BufferedReader(fr);){
				//5
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} 
//			catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
