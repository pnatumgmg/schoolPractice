package printK_extra.questions01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//1
		ArrayList<M_goods> amg;
		ArrayList<M_supplier> ams;
		//2
		AccessDB aDB = new AccessDB();
		//3
		aDB.connect();
		amg = aDB.getgoodsList();
		aDB.disConnect();
		//4
		aDB.connect();
		ams = aDB.getSupplierList();
		aDB.disConnect();
		//5
		System.out.println("商品情報を取得します");
		String strProductNumber = sc.nextLine();
		aDB.connect();
		int productNumber = Integer.parseInt(strProductNumber);
		M_goods mg = aDB.getGoods(productNumber);
		if(mg == null) {
			System.out.println("商品が登録されていません");
		}else {
			goodsShow(mg);
		}
		//6
		insertProduct(ams, amg, aDB);
		//7
		deleteProduct(aDB);
		//8
		updateProduct(amg,aDB);
		//9
		amg = aDB.getgoodsList();
		show(amg);
		
	}
	
	public static int getMaxGoodsCode(ArrayList<M_goods> am) {
		int ans = 0;
		for(int i = 0;i < am.size();i++) {
			int j = am.get(i).getItemcode();
			ans = Math.max(ans, j);
		}
		return ans;
	}
	
	public static void goodsShow(M_goods mg) {
		String productName = mg.getItemname();
		int price = mg.getPrice();
		String supName = mg.getSup().getSupname();
		String address = mg.getSup().getAddress();
		
		System.out.println("商品名:%s　仕入先名:%s　住所:%s　値段:%d"
				.formatted(productName,supName,address,price));
	}
	
	public static void insertProduct(ArrayList<M_supplier> ms,ArrayList<M_goods> mg,AccessDB adb) {
		//商品名を取得
		System.out.println("商品マスタに１件追加します");
		System.out.println("商品名を入力してください");
		String productName = sc.nextLine();
		//仕入番号を取得 登録済みの仕入れ番号か検証
		boolean loop = true;
		int sNumber = 0;
		while(loop) {
			System.out.println("仕入先番号を指定してください");
			String strsNumber = sc.nextLine();
			sNumber = Integer.parseInt(strsNumber);
			for(int i = 0;i < ms.size();i++){
				if(sNumber == ms.get(i).getSupcode()) {
					loop = false;
					break;
				}
			}
			if(loop) {
				System.out.println("入力した番号が、仕入先リストに存在しません");
			}
		}
		//金額を取得
		System.out.println("金額を設定してください");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		//現在時刻を取得
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = dateFormat.format(d);
		java.sql.Date d2 = java.sql.Date.valueOf(strDate);
		//商品番号を現在の最大値+1で取得
		int count = getMaxGoodsCode(mg);
		count++;
		
		M_goods mg2 = new M_goods(count,productName,sNumber,price,d2);
		int k = adb.insertM_goods(mg2);
		if (k > 0) {
			System.out.println("商品マスタに登録しました。");
		}else {
			System.out.println("商品マスタに登録できませんでした");
		}
	}
	
	public static void deleteProduct(AccessDB adb) {
		System.out.println("商品マスタから1件削除します");
		System.out.println("商品番号を入力してください");
		String strProductNumber = sc.nextLine();
		int productNumber = Integer.parseInt(strProductNumber);
		int k = adb.deleteFromM_goods(productNumber);
		if (k > 0) {
			System.out.println("商品マスタから削除しました。");
		}else {
			System.out.println("商品マスタに存在しない商品です");
		}
	}
	
	public static void updateProduct(ArrayList<M_goods> amg, AccessDB adb) {
		System.out.println("商品マスタの商品名を変更します");
		System.out.println("商品番号を入力してください");
		String strProductNumber = sc.nextLine();
		int productNumber = Integer.parseInt(strProductNumber);
		
		System.out.println("商品名を変更します。名前を入力してください");
		String productName = sc.nextLine();
		
		System.out.println("商品の金額を変更します。値を入力してください");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		
		Date d = new Date();
		
		int supCode = adb.searchScode(productNumber);
		
		if(supCode > 0) {
			M_goods mg = new M_goods(productNumber, productName, supCode, price, d);
			int k = adb.updateM_goods(mg);
			if (k > 0) {
				System.out.println("商品マスタを更新しました。");
			}else {
				System.out.println("商品マスタに更新できませんでした");
			}
		}else {
			System.out.println("商品マスタに更新できませんでした 商品番号が不正です");
		}
		
	}
	
	public static void show(ArrayList<M_goods> amg) {
		for(M_goods a:amg) {
			a.show();
		}
	}
}
