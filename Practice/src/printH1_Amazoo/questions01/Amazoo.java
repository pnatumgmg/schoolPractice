package printH1_Amazoo.questions01;

import java.util.Scanner;

public class Amazoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1  現在の在庫数を持つinventoryインスタンスを生成
		System.out.println("在庫数を入力してください。");
		int stock = sc.nextInt();
		Inventory inventory = new Inventory(stock);
		//2  注文処理を行うorderSインスタンスを生成
		OrderService orderS = new OrderService(inventory);
		//3
		//ループ処理を続けるかを識別するloopを定義
		boolean loop = true;
		//loopがtrueかつ在庫数が0でないときloopを回す(初期在庫数が0に備えてここでも0の確認)
		while(!(0 == inventory.getStock()) && loop) {
			System.out.println("注文数を入力してください。");
			int count = sc.nextInt();
			sc.nextLine();
			Order OrderCount = new Order(count);
			//入力値が正の整数かつ在庫数より少ないか検証　エラーの場合は再度入力を続けるか確認
			try {
				orderS.processOrder(OrderCount);
			}catch(IllegalArgumentException e) {
				System.out.print("注文処理中に問題が発生しました:" + e.getMessage() + "\n");
				System.out.println("在庫数" + inventory.getStock() + "\n");
			}
			//在庫数が0になった場合ループを抜ける処理（再度注文をするかの確認が出ないようにここで確認）
			if(0 == inventory.getStock()) {
				break;
			}
			//注文を再度するか確認 "y"であれば注文数を再度入力 "n"であればloopをfalseにして処理を終了　それ以外であればエラーで再度続けるか確認 
			while(true) {
				System.out.println("注文を続けますか？ Yes：y No：n");
				String choice = sc.nextLine();
				if(choice.equals("y")) {
					break;
				}else if(choice.equals("n")) {
					loop = false;
					break;
				}
				else{
					try{
						throw new InvalidInputException("不正な値が入力されました");
					}catch(InvalidInputException e) {
						System.out.println(e.getMessage());
						System.out.println("再入力してください\n");
						continue;
					}
				}
			}
		}
		sc.close();
		System.out.println("またのご利用をお待ちしております。");
	}
}