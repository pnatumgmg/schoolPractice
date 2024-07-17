package printH1_Amazoo.questions01;

public class Order {
	private int orderedAmount;
	
	Order(int orderAmount){
		setOrderAmount(orderAmount);
	}
	
	public void setOrderAmount(int orderAmount) {
		this.orderedAmount = orderAmount;
	}
	
	public int getOrderAmount() {
		return orderedAmount;
	}

}
