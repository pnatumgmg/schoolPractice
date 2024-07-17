package printH1_Amazoo.questions01;

public class OrderService {
	private Inventory inventory;
	
	OrderService(Inventory inventory){
		setInventory(inventory);
	}
	
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public void processOrder(Order order) throws IllegalArgumentException{
		inventory.deductStock(order.getOrderAmount());
	}

}
