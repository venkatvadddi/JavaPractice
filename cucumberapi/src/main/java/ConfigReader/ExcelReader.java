package ConfigReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String file, String sheet) throws IOException
	{
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
	
	public static int getCellCount(String file, String sheet, int rownum) throws IOException
	{
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheet);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;		
	}
	
	public static String getCellData(String file, String sheet, int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formatter = new DataFormatter();
			String celldata = formatter.formatCellValue(cell);
			return celldata;
		}
		catch (Exception e)
		{
			data="";
		}		
		wb.close();
		fi.close();
		return data;
		
	}
	
	public static void setCellData(String file, String sheet, int rownum, int colnum, String data) throws IOException
	{
		fi = new FileInputStream(file);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		fo = new FileOutputStream(file);		
		wb.write(fo);		
		wb.close();
		fi.close();
		fo.close();
				
	}
	
}
