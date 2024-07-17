package printH1_Amazoo.questions01;

public class Inventory {
	private int stock;
	
	Inventory(int stock){
		this.setStock(stock);
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void deductStock(int deduct) throws IllegalArgumentException{
		if(0 > deduct) {
//			System.out.println();
			throw new IllegalArgumentException("不正な入力です");
		}
		
		int nowStock = getStock() - deduct;
		if (0 > nowStock) {
			throw new IllegalArgumentException("在庫数が不足しています");
		}
		setStock(nowStock);
		System.out.println("ご注文ありがとうございます。 \n残在庫数：%d\n"
				.formatted(nowStock));
	}

}
