package model;

public class CloudVendor {

	
	private String vendorID;
	private String vendorName;
	private String vendorAddress;
	private String email;
	
	public CloudVendor() {
	}

	public CloudVendor(String vendorID, String vendorName, String vendorAddress, String email) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.email = email;
	}
	
	public String getVendorID() {
		return vendorID;
	}


	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getVendorAddress() {
		return vendorAddress;
	}


	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
