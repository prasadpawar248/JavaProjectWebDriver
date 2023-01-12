package dataDriverTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataExcel 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file= new FileInputStream ("C:\\Program Files\\Eclipse\\data.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(file);
	
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //get sheet by sheet name
	//	XSSFSheet sheet=workbook.getSheetAt(0);      //get sheet by index
		
//		XSSFRow r=sheet.getRow(0);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c);
		
		int rowCount=sheet.getLastRowNum();
		int cellCount= sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(cellCount); 
		
		for(int i=0;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cellCount;j++)
			{
				String element=row.getCell(j).toString();
				System.out.print(element+"  ");
			}
			System.out.println();
			
		} 
	
	}
	

}
