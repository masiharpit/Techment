package com.techment.OOPS;


class Addresses {
    private String addressLine;
    private String city;
    String getaddressLine()
	  {
		  return addressLine;
	  }
	  public void setaddressLine(String addressLine )
	  {
		  this.addressLine=addressLine;
	  }
	  public String getcity()
	  {
		  return city;
	  }
	  public void setcity(String city)
	  {
		  this.city=city;
	  }
   

	 Addresses(String addressLine,String city)
  {
	     setaddressLine(addressLine);
	     setcity(city);
  }
 public String getAddressDetails()
 {	
	 String fulladdress;
	 fulladdress=getaddressLine()+',' +getcity();
	 return(fulladdress);
	 
 }
@Override
public String toString() {
	return "Addresses [addressLine=" + addressLine + ", city=" + city + "]";
}
 
}

class Customers
{
private String customerName;
private Addresses residentialAddress;
private Addresses officialAddress;
public String getcustomerName()
{
	  return customerName;
}
public void setcustomerName(String customerName )
{
	  this.customerName=customerName;
}
public Addresses getresidentialAddress()
{
	  return residentialAddress;
}
public void setresidentialAddress(Addresses residentialAddress)
{
	  this.residentialAddress=residentialAddress;
}
public Addresses getofficialAddress() {
	return officialAddress;
}
public void setofficialAddress(Addresses officialAddress) {
	this.officialAddress = officialAddress;
}


Customers()
{
   setcustomerName(null);
   setresidentialAddress(null);
   setofficialAddress(null);
}
Customers(String customerName,Addresses residentialAddress,Addresses officialAddress)
{
   setcustomerName(customerName);
   setresidentialAddress(residentialAddress);
   setofficialAddress(officialAddress);
}

@Override
public String toString() {
	return "Customers [customerName=" + customerName + ", residentialAddress=" + residentialAddress
			+ ", officialAddress=" + officialAddress + "]";
}
}
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addresses addr = new Addresses("Motinagar" , "Raipur");	
		Addresses addr1 = new Addresses("santoshiNagar" , "Raipur");	
		Customers cust=new Customers();
		cust.setcustomerName("nishi");
		cust.setresidentialAddress(addr);
		cust.setofficialAddress(addr1);
		//myOffice = addr1.getAddressDetails();
		//myAddress = addr.getAddressDetails();
		System.out.println(cust.toString());
	}

}
