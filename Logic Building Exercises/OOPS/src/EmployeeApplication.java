class Employee{
	int id;
	String name;
	int contact;
	int minBalance;
	
	Employee(int id, String name, int contact, int minBalance){
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.minBalance = minBalance;
	}
	
	public String details(){
		return("ID: "+id+"\nName: "+name+"\nContact: "+contact+"\nMinimum Balance: "+minBalance);

	}
	
	public String accountType(){
		if(this.minBalance > 0 && this.minBalance < 1000) {
			return "Zero Balance Account";
		}else if(this.minBalance > 1000 && this.minBalance <10000 ) {
			return "Savings Account";
		}else {
			return "Current Account";
		}
	}
}
public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(5421, "Arpit", 962935471, 10000);
		
		System.out.println(emp.details());
		System.out.println(emp.accountType());
	}

}
