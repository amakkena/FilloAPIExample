package com.fillo.excel;
import org.junit.Test;

import Exception.FilloException;
import Fillo.Connection;
import Fillo.Fillo;
import Fillo.Recordset;
public class FilloUpdateExample {
	Fillo fillo = new Fillo();
	Connection conn = null;
	Recordset rec = null;
	
	@Test
	public void updateExampleTest() throws FilloException{
		conn = fillo.getConnection(System.getProperty("user.dir")+"/TestData/StatesData.xlsx");
		String query = "update States set Capital='Hyderabad' where State='Andhra Pradesh'";
		conn.executeUpdate(query);
	}
	
}
