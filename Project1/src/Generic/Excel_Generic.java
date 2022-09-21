package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Generic extends Base_Test 
{
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream F=new FileInputStream("./excel/msexcel.xlsx");
		Workbook Book = WorkbookFactory.create(F);
		String value=Book.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
}
