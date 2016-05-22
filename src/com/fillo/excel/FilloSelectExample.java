package com.fillo.excel;
import org.junit.Test;
import Exception.FilloException;
import Fillo.Connection;
import Fillo.Fillo;
import Fillo.Recordset;

public class FilloSelectExample {
	Fillo fillo = new Fillo();
	Connection conn = null;
	Recordset rec = null;
	
	@Test
	public void dataFetchWithselectTest() throws FilloException{
		conn = fillo.getConnection(System.getProperty("user.dir")+"/TestData/StatesData.xlsx");
		String sqlQuery = "select * from States";
		rec = conn.executeQuery(sqlQuery);

		//Displaying data using select
		while(rec.next())
			System.out.println("Sno is: "+rec.getField("Sno")+" -- State Name is: "+rec.getField("State")+" -- Capital Name is: "+rec.getField("Capital")+" -- Region is: "+rec.getField("Region"));

	
	String newQuery = "select * from States where Region='South'";
	rec = conn.executeQuery(newQuery);
	
	System.out.println("==========================================================");
	//Displaying data using select with where cluase
			while(rec.next())
				System.out.println("Sno is: "+rec.getField("Sno")+" -- State Name is: "+rec.getField("State")+" -- Capital Name is: "+rec.getField("Capital")+" -- Region is: "+rec.getField("Region"));
	
	
	String newQueryExcep = "select * from States";
	rec = conn.executeQuery(newQueryExcep).where("Region='South'").where("State='Telangana'");
	
	System.out.println("==========================================================");
	//Displaying data using select with where cluase
			while(rec.next())
				System.out.println("Sno is: "+rec.getField("Sno")+" -- State Name is: "+rec.getField("State")+" -- Capital Name is: "+rec.getField("Capital")+" -- Region is: "+rec.getField("Region"));
		}
}
