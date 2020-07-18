package wrapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wrapper_excel {
	static String path = "resorces//Testdata.xlsx";
    static String sheet = "Sheet1";
	
	public static String getdata (int row,int col) throws IOException
	{
		FileInputStream fs = new FileInputStream(path);
		Workbook wb= new XSSFWorkbook(fs);
		Sheet sh= wb.getSheet("Sheet1");
		Row r= sh.getRow(row);
		Cell c= r.getCell(col);
		DataFormatter df = new DataFormatter();
		String val =df.formatCellValue(c);
		return val;
		
	}
	
	public static void writedata (int row,int col, String value) throws IOException

	{
		FileInputStream fs = new FileInputStream(path);	
		Workbook wb= new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet("sheet1");
		Row rows= sh.getRow(row);
		Cell cell =rows.createCell(col);
		cell.setCellValue(value);
		
		FileOutputStream fo= new FileOutputStream(path);
		wb.write(fo);
		
	}
}
