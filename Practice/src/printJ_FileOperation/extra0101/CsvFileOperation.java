package printJ_FileOperation.extra0101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileOperation {
	public final String filepath;
	File f;
	
	public CsvFileOperation() {
		// TODO 自動生成されたコンストラクター・スタブ
		filepath = "csv/bankdata.csv";
		f = new File(filepath);
	}
	
	public String csvReader(ArrayList<Account> aa) {
		//1-1
		String name;
		int accountNum;
		int balance;
		int timeBalance;
		//1-2
		String ans;
		//1-3
		int count = 0;
		//1-4
		try(FileReader fr = new FileReader(filepath);
					BufferedReader br = new BufferedReader(fr);){
			String line;
			while((line = br.readLine()) != null) {
				if('#' != line.charAt(0)) {
					String[] lines = line.split(",");
					name = lines[1];
					accountNum = Integer.parseInt(lines[0]);
					balance = Integer.parseInt(lines[2]);
					if(lines.length == 3) {
						aa.add(new Account(name,balance,accountNum));
						count ++;
					}else if(lines.length == 4) {
						timeBalance = Integer.parseInt(lines[3]);
						aa.add(new TimeAccount(name,balance,timeBalance,accountNum));
						count ++;
					}else {
						System.out.println("要素数が不正です。");
					}
				}
			}
		}catch(IOException e) {
			ans = "ファイル読み込みエラー";
			return ans;
		}
		ans = "%d件ファイル読み込みました".formatted(count);
		return ans;
	}
	
	public String csvWriter(ArrayList<Account> aa) {
		int count = 0;
		//1-1
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
			//1-2
			bw.write("#口座番号,口座名義,普通預金残高,定期預金残高");
			bw.newLine();
		}catch(IOException e) {
			
		}
		//1-3
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
			for(Account a :aa) {
				if(a instanceof TimeAccount ta) {
					bw.write("%d,%s,%d,%d"
					.formatted(ta.getAccountNum(),ta.getName(),ta.getBalance(),ta.getTimeBalance()));
					bw.newLine();
					count ++;
				
				}else if(a instanceof Account ac) {
					bw.write("%d,%s,%d"
					.formatted(ac.getAccountNum(),ac.getName(),ac.getBalance()));
					bw.newLine();
					count ++;
				}else {
					System.out.println("型が不正です");
				}
			}
		}catch(IOException e) {
			return "ファイル書き込みエラー";
		}
		return "%d件のファイル書き込みました".formatted(count);
	}
	
	public boolean fileExists() {
		return this.f.exists();
	}

}
