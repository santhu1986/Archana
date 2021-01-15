package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		Library LB=new Library();
		
		LB.OpenApp("http://122.175.8.158/ranford2");
		LB.Admlgn("Admin","M1ndq");
		
	    //To get Test Data File
		
		FileInputStream FIS=new FileInputStream("E:\\archanaworkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//Rowcount
		
		int RCount=WS.getLastRowNum();
		System.out.println(RCount);
		
		//Multiple Iterations
		
		for (int i=1;i<=RCount;i++) 
		{
		    //Row
			
			XSSFRow WR=WS.getRow(i);
			
		   //Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rty=WC1.getStringCellValue();
			
			String Res=LB.Role(Rname,Rty);
			System.out.println(Res);
			
			WC2.setCellValue(Res);
		}
		
		//Results
		
		FileOutputStream FOS=new FileOutputStream("E:\\archanaworkspace\\Ebanking\\src\\com\\ebanking\\results\\Resrole.xlsx");
		WB.write(FOS);
		WB.close();
		
}

}

