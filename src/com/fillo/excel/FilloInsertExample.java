package com.fillo.excel;

import org.junit.Test;

import Exception.FilloException;
import Fillo.Connection;
import Fillo.Fillo;
import Fillo.Recordset;

public class FilloInsertExample {
	Fillo fillo = new Fillo();
	Connection conn = null;
	Recordset rec = null;
	
	@Test
	public void insertExampleTest() throws FilloException{
		conn = fillo.getConnection(System.getProperty("user.dir")+"/TestData/StatesData.xlsx");
		String query = "insert into States(Sno,State,Capital,Region) values(8,'Rajastan','Jaipur','North')";
		conn.executeUpdate(query);
	}
}
