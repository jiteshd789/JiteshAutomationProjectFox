package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getStringData {
	
	public static void main (String[] args) throws EncryptedDocumentException, IOException
	    {
		FileInputStream jitesh= new FileInputStream("C:\\Users\\Jitesh\\Desktop\\TestSelinium.xlsx");
		
		String nilesh =WorkbookFactory.create(jitesh).getSheet("Sheet2").getRow(0).getCell(3).getStringCellValue();
		
		System.out.println(nilesh);
			
	}

}
