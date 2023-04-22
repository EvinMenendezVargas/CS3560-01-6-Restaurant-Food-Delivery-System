
public class Order {
	
	// variables
	private int orderID;
	private int numOfItems;
	private double totalPrice;
	private String orderStatus;
	
	// method to get order ID
	public int getOrderID() {
		return orderID;
	}
	
	// method to set order ID
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	// method to get number of items
	public int getNumOfItems() {
		return numOfItems;
	}
	
	// method to set number of items
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	
	// method to get total price
	public double getTotalPrice() {
		return totalPrice;
	}
	
	// method to set total price
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	// method to get order status
	public String getOrderStatus() {
		return orderStatus;
	}
	
	// method to set order status
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	// method to track order 
	public String track(String orderStatus) {
		String status; 
		status = orderStatus;
		return status;
	}
	
	// method to place order
	public String placeOrder(String orderItems) {
		String orderList;
		// builds a list of items that needs to get ordered
		// return tat order list
	return orderList;
	}
	
	// method to add item to order
	public void addItem() {
		
		// this method adds items for the order
	}
	
	// method to remove items from order
	public void removeItem() {
		
		// this method removes items from the order
	}
	
	public String sendOrder(String send) {
		String sendFinalOrder;
		
		// this method sends the order to the restaurant kitchen to be made
		
	return sendFinalOrder;
	}

}
