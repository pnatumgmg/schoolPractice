package printJ_FileOperation.extra0101;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//1-1
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//1-2
		CsvFileOperation cfo = new CsvFileOperation();
		//1-3
		ArrayList<Account> aa = new ArrayList<Account>();
		//1-4
		final int READFILE = 0;
		final int OPERATION_CONTINUE = 1;
		//1-5
		boolean loop = true;
		if(cfo.fileExists()) {
			String key = inputKey(READFILE);
			if("y".equals(key)) {
				System.out.println(cfo.csvReader(aa));
			}
		}
		do{
			int choice = choiceNum();

			switch(choice) {
			case 1:
				create(aa);
				break;
			case 2:
				deposit(aa);
				break;
			case 3:
				withdraw(aa);
				break;
			case 4:
				transfer(aa);
				break;
			case 5:
				delete(aa);
				break;
			case 6:
				deleteTimeBalance(aa);
				break;
			case 7:
				show(aa);
				break;
			}
			
			String loopKey = inputKey(OPERATION_CONTINUE);
			if("n".equals(loopKey)) {
				loop = false;
			}
		}while(loop);
		
		System.out.println(cfo.csvWriter(aa));
		
		System.out.println("プログラムを終了します");

	}

	public static String inputKey(int fileCheck) {
		while(true) {
			if(fileCheck == 0) {
				System.out.println("既にデータファイルが存在します。読み込みますか？ y/n");
			}else if(fileCheck == 1) {
				System.out.println("続けて操作を行いますか？ y/n");
			}else {
				System.out.println("引数が不正です");
				return "引数が不正です";
			}
			String ans = sc.nextLine();
			if("y".equals(ans) || "n".equals(ans)) {
				return ans;
			}
		}
	}

	public static int choiceNum() {
		while(true) {
			System.out.println("1:口座作成 2:入金 3:出金 4:送金 5：口座削除 6：定期口座解約 7：口座一覧表示");
			String strNum = sc.nextLine();
			if (strNum.matches("[1-7]")) {
				return Integer.parseInt(strNum);
			}
		}
	}

	//1-10 口座作成処理 case1
	public static void create(ArrayList<Account> aa) {
		System.out.println("口座を作成します");
		boolean loop = true;
		int choice = 0;
		while(loop) {
			System.out.println("普通預金口座を作成の時は1、定期預金口座を作成の時は2を入力してください");
			String strChoice = sc.nextLine();
			if("1".equals(strChoice) || "2".equals(strChoice)) {
				choice = Integer.parseInt(strChoice);
				loop = false;
			}
		}
		System.out.println("口座名義を入力してください");
		String name = sc.nextLine();
		int balance = under0Check("預金残高を入力してください");
		int timeBalance = 0;
		if(choice == 1) {
			aa.add(new Account(name,balance));
		}
		else if(choice == 2) {
			timeBalance = under0Check("定期預金残高を入力してください");
			aa.add(new TimeAccount(name,balance,timeBalance));
		}
		System.out.println("%sの口座を作成しました。"
				.formatted(name));
	}


	/**
	 * 1-10 口座作成処理に使うメソット　case1
	 * 口座作成時に0以上か確認するメソット
	 * @param msg エラー時に表示するメッセージ
	 * @return　0以上か確認された入力値
	 */
	public static int under0Check(String msg) {
		boolean loop = true;
		int balance = 0;
		while(loop) {
			System.out.println(msg);
			String strBalance = sc.nextLine();
			balance = Integer.parseInt(strBalance);
			if(balance < 0) {
				System.out.println("0より大きい値を入力してください");
				loop = true;
			}else {
				loop = false;
			}
		}
		return balance;
	}

	//1-11 入金処理 case2
	public static void deposit(ArrayList<Account> aa) {
		System.out.println("入金処理を行います");
		System.out.println("入金したい口座番号を指定してください");
		String strAccountNum = sc.nextLine();
		int AccountNum = Integer.parseInt(strAccountNum);
		int index = Account.chkAccountNum(aa, AccountNum);
		if(index < 0) {
			System.out.println("口座が存在しません");
		}else {
			System.out.println("入金額を入力してください");
			String strbalance = sc.nextLine();
			int balance = Integer.parseInt(strbalance);
			aa.get(index).deposit(balance);
		}
		System.out.println("入金処理を終了します");
	}

	//1-12 出金処理 case3  case2とほぼ一緒
	public static void withdraw(ArrayList<Account> aa) {
		System.out.println("出金処理を行います");
		System.out.println("出金したい口座番号を選択してください");
		String strAccountNum = sc.nextLine();
		int AccountNum = Integer.parseInt(strAccountNum);
		int index = Account.chkAccountNum(aa, AccountNum);
		if(index < 0) {
			System.out.println("口座が存在しません");
		}else {
			System.out.println("出金額を入力してください");
			String strbalance = sc.nextLine();
			int balance = Integer.parseInt(strbalance);
			aa.get(index).withdraw(balance);
		}
		System.out.println("出金処理を終了します");
	}

	//1-13 送金処理 case4
	public static void transfer(ArrayList<Account> aa) {
		System.out.println("送金処理を行います");
		System.out.println("送金元の口座番号を指定してください");
		String strmyself = sc.nextLine();
		int myself = Integer.parseInt(strmyself);
		int myselfIndex = Account.chkAccountNum(aa, myself);
		System.out.println("送金先の口座番号を指定してください");
		String strpartner = sc.nextLine();
		int partner = Integer.parseInt(strpartner);
		int partnerIndex = Account.chkAccountNum(aa, partner);
		if(myselfIndex < 0||partnerIndex < 0) {
			System.out.println("送金元もしくは送金先の口座が存在しません");
		}else {
			System.out.println("送金金額を指定してください");
			String strTransfer = sc.nextLine();
			int transfer = Integer.parseInt(strTransfer);
			Account.transfer(aa.get(myselfIndex), aa.get(partnerIndex),transfer);
		}
		System.out.println("送金処理を終了します");
	}

	//1-14 口座削除処理 case5
	public static void delete(ArrayList<Account> aa) {
		System.out.println("削除したい口座番号を指定してください");
		String strAccountNum = sc.nextLine();
		int AccountNum = Integer.parseInt(strAccountNum);
		int deleteIndex = Account.chkAccountNum(aa, AccountNum);
		if(deleteIndex < 0) {
			System.out.println("指定口座が存在しません");
		}else {
			System.out.println("%s口座を削除しました"
					.formatted(aa.get(deleteIndex).getName()));
			aa.remove(deleteIndex);
		}
		System.out.println("口座の削除処理を終了します");
	}

	//1-15 定期預金の解約処理 case6
	public static void deleteTimeBalance(ArrayList<Account> aa) {
		System.out.println("定期を解約する口座番号を指定してください");
		String strTimeBalance = sc.nextLine();
		int timeBalance = Integer.parseInt(strTimeBalance);
		int deleteTimeBalance = Account.chkAccountNum(aa, timeBalance);
		if(deleteTimeBalance < 0) {
			System.out.println("指定口座が存在しません");
		}else if(aa.get(deleteTimeBalance) instanceof TimeAccount ta) {
			System.out.println("%sの定期預金口座を解約しました"
					.formatted(aa.get(deleteTimeBalance).getName()));
			ta.cancel();
		}else {
			System.out.println("定期口座ではありません");
		}
		System.out.println("定期解約処理を終了します");
	}

	//1-16 口座情報の表示 case7
	public static void show(ArrayList<Account> aa) {
		for(Account a:aa) {
			a.show();
		}
	}
}
