package DataProvider;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import ConfigReader.ConfigReader;
import ConfigReader.ExcelReader;

public class ExcelDataProvider extends ConfigReader{
	
	public ExcelDataProvider() throws IOException {
		super();		
	}

	@BeforeTest
	@DataProvider(name="testdata")
	public String [][] getData() throws IOException
	{
		final String filepath= gettestdata();		
		int rownum = ExcelReader.getRowCount(filepath, "sheet1");
		int colcount = ExcelReader.getCellCount(filepath, "sheet1",1);
		
		String xldata[][] = new String[rownum][colcount];
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				xldata[i-1][j] = ExcelReader.getCellData(filepath, "sheet1", i, j);
			}
		}
		return(xldata);		
	}

}
