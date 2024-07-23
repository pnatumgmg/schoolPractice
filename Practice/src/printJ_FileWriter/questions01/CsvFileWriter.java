package printJ_FileWriter.questions01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileWriter {
	public final String filePath;
	File f;
	
	public CsvFileWriter() {
		// TODO 自動生成されたコンストラクター・スタブ
		filePath = "csv/PersonData.csv";
		f = new File(filePath);
	}
	
	public String CsvWriter(ArrayList<Person> ap) {
		//1
		String firstName;
		String name;
		int age;
		String job;
		//2
		int count = 0;
		String strCount = "";
		//3
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
			bw.write("#名字,名前,年齢,職業");
			bw.newLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("ファイル書き込みエラー");
		}
		for(Person p: ap) {
			firstName = p.getFirstName();
			name = p.getName();
			age = p.getAge();
			job = p.getJob();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
				bw.write("%s,%s,%d,%s"
						.formatted(firstName,name,age,job));
				bw.newLine();
				count++;
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		strCount =count + "件ファイル書き込みました";
		
		return strCount;
		
	}
	
}
