package com.wartree.krieghb.main;


import com.wartree.krieghb.experiments.EStrings;
import com.wartree.krieghb.utilities.Enum_Numbers;
import com.wartree.krieghb.String.String_Basic;
import com.wartree.krieghb.String.String_Builder;
import com.wartree.krieghb.database.Main_jdbc;
import com.wartree.krieghb.database.Database_MySQL;

public class Snippets_Main {
	
	public static void main(String[] args) {


		//  Basic Sring class usage
		String_Basic SB_A = new String_Basic();
		SB_A.executeBasicTest();
		
		
		
		String_Builder StrBld_A = new String_Builder();
		StrBld_A.executeSBTest();
		
		
		Enum_Numbers num = Enum_Numbers.ONE;
		
		System.out.println("ENUM:  " + num.value());
		System.out.println("Enum basic: " + Enum_Numbers.TWO + " * " + Enum_Numbers.FOUR + " = " + Enum_Numbers.TWO.value() * Enum_Numbers.FOUR.value());
		System.out.println(EStrings.STAR_SEPERATOR.value());
		
		
		
//		Main_jdbc mainConnection = new Main_jdbc();
//		try {
//			mainConnection.readDataBase();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Database_MySQL newDB = new Database_MySQL();
		String url = "jdbc:mysql://localhost:3306/v_test";
		String username = "root";
		String password = "admin123";
		String column_list[] = new String[] {"v_sng_c_head", "v_sng_c_dur", "v_sng_c_comp-l", "v_sng_c_comp-f"};
		String input_list[] = new String[] {"Test Header", "13:26", "Toes", "Larry"};
		
		String mainSchema = "v_test";
		String mainTable = "v_sng";
		  
		
		newDB.connectToDb(url, username, password);
		
		newDB.readFromDb("v_sng");
//		newDB.insertToDb(mainTable, column_list, input_list);
//		newDB.readFromDb("v_sng");
		
		newDB.disconnectFromDb();
		
	}

}
