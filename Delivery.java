import java.util.Date;

public class Delivery {
	
	private int deliveryID;
	private Date deliveryDate;
	private String deliveryStatus;
	private double deliveryDistance;
	private String pickupLocation;
	private String deliveryLocation;
	
	public int getDeliveryID() {
		return deliveryID;
	}
	public void setDeliveryID(int deliveryID) {
		this.deliveryID = deliveryID;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public double getDeliveryDistance() {
		return deliveryDistance;
	}
	public void setDeliveryDistance(double deliveryDistance) {
		this.deliveryDistance = deliveryDistance;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	
}
