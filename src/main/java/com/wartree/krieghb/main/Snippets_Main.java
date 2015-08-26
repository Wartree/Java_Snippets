package com.wartree.krieghb.main;


import com.wartree.krieghb.experiments.EStrings;
import com.wartree.krieghb.utilities.String_Constants;
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
		
		System.out.println("ENUM:  " + num.value() + "::" + num);
		System.out.println("ENUM non:  " + Enum_Numbers.TWENTY.value() + "::" + Enum_Numbers.TWENTY);
		System.out.println("Enum basic: " + Enum_Numbers.TWO + " * " + Enum_Numbers.FOUR + " = " + Enum_Numbers.TWO.value() * Enum_Numbers.FOUR.value());
		System.out.println(EStrings.STAR_SEPERATOR.value());




		Database_MySQL newDB = new Database_MySQL();

		String mainSchema = "v_test";
		String mainTable = "v_sng";

		String url = "jdbc:mysql://localhost:3306/v_test";
		String username = "root";
		String password = "admin123";
		String column_list[] = new String[] {"v_sng_c_head", "v_sng_c_dur", "v_sng_c_comp-l", "v_sng_c_comp-f"};
		String input_list[] = new String[] {"Test Header", "13:26", "Threes", "Barry"};


		newDB.connectToDb(url, username, password);

		newDB.readFromDb("v_sng");
//		newDB.insertToDb(mainTable, column_list, input_list);
//		newDB.readFromDb("v_sng");

		newDB.disconnectFromDb();

        System.out.println(String_Constants.END_OF_LINE);
	}

}
