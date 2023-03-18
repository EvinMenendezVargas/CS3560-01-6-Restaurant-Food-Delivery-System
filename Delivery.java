// import date class

import java.util.Date;

// Delivery class
public class Delivery {
	
	// variables
	private int deliveryID;
	private Date deliveryDate;
	private String deliveryStatus;
	private double deliveryDistance;
	private String pickupLocation;
	private String deliveryLocation;
	
	// method to get ID
	public int getDeliveryID() {
		return deliveryID;
	}
	
	// method to set ID
	public void setDeliveryID(int deliveryID) {
		this.deliveryID = deliveryID;
	}
	
	// method to get Date
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	// method to set Date
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	// method to get the status
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	
	// method to set Status
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	// method to get the distance
	public double getDeliveryDistance() {
		return deliveryDistance;
	}
	
	// method to set distance
	public void setDeliveryDistance(double deliveryDistance) {
		this.deliveryDistance = deliveryDistance;
	}
	
	// method to get pickup location
	public String getPickupLocation() {
		return pickupLocation;
	}
	
	// method to set pickup location
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	
	// method to get delivery address
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	
	// method to set delivery address
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	
	// method to tract if the devlivery is being delivered/in progress/successfully completed
	public String trackStatus(String deliveryStatus) {
		String status;
		status = deliveryStatus;
		return status;
	}
	
}
