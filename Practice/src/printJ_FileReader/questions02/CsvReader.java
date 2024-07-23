package printJ_FileReader.questions02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CsvReader {
	final String filepath;

	public CsvReader(String filepath) {
		this.filepath = filepath;
	}

	public CsvReader() {
		this.filepath = "csv/TempData.csv";
	}

	void CsvFileReader(ArrayList<TempData> ta) {
		//1
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

		//2
		File f = new File(filepath);
		if(f.exists()) {
			try(FileReader fr = new FileReader(filepath);
					BufferedReader br = new BufferedReader(fr);){
				String line;
				while((line = br.readLine()) != null) {
					if('#' != line.charAt(0)) {
						String[] a = line.split(",");
						Date date = df.parse(a[0]);
						double a1 = Double.parseDouble(a[1].trim());
						double a2 = Double.parseDouble(a[2].trim());
						double a3 = Double.parseDouble(a[3].trim());
						ta.add(new TempData(date,a1,a2,a3));
					}					
				}				
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
