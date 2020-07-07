package DataProvider;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import RestAssured.RestAssured.XlUtils;

public class XlData {
	
	@BeforeTest
	@DataProvider(name="testdata")
	public String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\testdata\\xldata.xlsx";
		int rownum = XlUtils.getRowCount(path, "sheet1");
		int colcount = XlUtils.getCellCount(path, "sheet1",1);
		
		String xldata[][] = new String[rownum][colcount];
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				xldata[i-1][j] = XlUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return(xldata);		
	}
}
