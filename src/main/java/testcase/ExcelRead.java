package testcase;

import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	
	public Object[][] readexcel(String filename) throws IOException  {
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("./Data/"+filename+".xlsx");
		//XSSFSheet sheet = wbook.getSheet(sheetname);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownumber = sheet.getLastRowNum();
		System.out.println(rownumber);
		short lastCellNum = sheet.getRow(rownumber).getLastCellNum();
		Object[][] dataset = new Object[rownumber][lastCellNum];
		for(int i=1; i<=rownumber; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum; j++)
			{
				try {
					XSSFCell cell = row.getCell(j);
					dataset[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					dataset[i-1][j] = "";
				}
				//System.out.println("The Credentials are " + data);
			}
		}
		
		wbook.close();
		return dataset;
	}
	

}
