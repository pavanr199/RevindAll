package TestngData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterData {

	static XSSFWorkbook wbook;
	static XSSFSheet wsheet;
	static String path;
	
	
	       public static void main(String[] args) {
	    	   countrow();
		}

	public static void countrow() {
		try {


            path=System.getProperty("user.dir");
			wbook = new XSSFWorkbook(path+"/excel/data.xlsx");
            wsheet=wbook.getSheetAt(0);
          String data1= wsheet.getRow(3).getCell(1).getStringCellValue();
			
			System.out.println(data1);

		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}


























}
