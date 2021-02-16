package Utill;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtill {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {

		getrowcount();
		getcelldatastring(2,0);
		getcelldatanumber(2,1);
	}


	public static void getrowcount() {

		try {

			projectpath =System.getProperty("user.dir");
			workbook=new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet=workbook.getSheet("Sheet1");
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("the numberof rows are :"+rowcount);


		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}


	}


	public static void getcelldatastring(int rownum,int colnum) {



		try {

			projectpath =System.getProperty("user.dir");
			workbook=new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet=workbook.getSheet("Sheet1");
			
			String celldata=  sheet.getRow(rownum).getCell(colnum).getStringCellValue();
           System.out.println(celldata);
           
		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}



	public static void getcelldatanumber(int rownum,int colnum) {



		try {

			projectpath =System.getProperty("user.dir");
			workbook=new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet=workbook.getSheet("Sheet1");
			
			double celldata=  sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
           System.out.println(celldata);
           
		}catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}






}





