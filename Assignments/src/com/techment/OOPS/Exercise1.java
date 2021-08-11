package com.techment.OOPS;

class Address
{
	private String addressLine;
	private String city;
	
	
	public Address() {
		super();
	}
	
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void getAddressDetails()
	{
		System.out.println(addressLine+", "+city);
	}
}

class Customer
{
	private String customerName;
	Address residentialAddress;
	
	
	public Customer() {
		super();
	}
	
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getCustomerDetails()
	{
		System.out.println("Customer: "+customerName+"\nResidential Address: "+residentialAddress.getAddressLine()+", "+residentialAddress.getCity());
	}

}
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("MIG-1/162 Hudco Amdi Nagar", "Bhilai");
		Customer customer = new Customer("Arpit", address);
		
		customer.getCustomerDetails();
		
	}

}
