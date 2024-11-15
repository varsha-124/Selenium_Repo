package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToLearnExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	String value = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();	
	System.out.println(value);
}

}
