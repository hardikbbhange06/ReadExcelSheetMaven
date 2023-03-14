package firstexcel;

public class firsttest {
	
	public static void main(String[] args) {
		
		String SheetPath="D:\\EH\\EXCEL_READ\\firstexcel\\data\\firstdata.xlsx";
		String SheetName="Sheet1";
		
		First first=new First(SheetPath, SheetName);
		
		first.getRowCount();
		first.getCellData(1, 0);
		first.getCellData(1, 1);
		first.getCellData(1, 2);
	}

}
