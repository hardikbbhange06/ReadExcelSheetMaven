package firstexcel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class First {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public First(String SheetPath,String SheetName) {
		
	try {
		workbook=new XSSFWorkbook(SheetPath);
		sheet=workbook.getSheet(SheetName);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void getCellData(int rownum,int colnum) {
		DataFormatter formatter=new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
		System.out.println(value);
	}
	
	public void getRowCount() {
		
		int rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println("row no :-"+rowCount);
	}
		
	

}
