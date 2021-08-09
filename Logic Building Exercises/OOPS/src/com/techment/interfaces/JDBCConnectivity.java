package com.techment.interfaces;

interface JDBCConnection{
	void Connect();
}

class Oracle implements JDBCConnection{
	public void Connect() {
		System.out.println("Oracle database connection successfull.");
	}
}

class MySQL implements JDBCConnection{
	public void Connect() {
		System.out.println("MySQL database connection successfull.");
	}
}


public class JDBCConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCConnection oracleConnect = new Oracle();
		JDBCConnection mysqlConnect = new MySQL();
		
		oracleConnect.Connect();
		mysqlConnect.Connect();
		
	}

}
