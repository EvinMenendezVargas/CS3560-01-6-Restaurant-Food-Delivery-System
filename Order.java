
public class Order {
	
	private int orderID;
	private int numOfItems;
	private double totalPrice;
	private String orderStatus;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getNumOfItems() {
		return numOfItems;
	}
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String track(String orderStatus) {
		String status; 
		status = orderStatus;
		return status;
	}
	public String placeOrder(String orderItems) {
		String orderList;
		// builds a list of items that needs to get ordered
		// return tat order list
	return orderList;
	}
	
	public void addItem() {
		
		// this method adds items for the order
	}
	
	public void removeItem() {
		
		// this method removes items from the order
	}

}
