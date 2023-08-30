import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class generic {
	public static Row actualRow;
	public static int rowcount;
	@DataProvider(name = "testdata")

	public Object[][] excelData()throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file = new File("./src/test/resources/personaldata.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		 rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowcount][cellcount];
		for (int row = 0; row < rowcount; row++) {
//			data[rowcount][cellcount]=sheet.getRow(i).getCell(i).toString();
			actualRow = sheet.getRow(row);//calculate bthe actual row
			for (int cell = 0; cell < actualRow.getPhysicalNumberOfCells(); cell++) {
				data[row][cell]=actualRow.getCell(cell).toString();
				
			}
		}
//		for (int i = 0; i < rowcount; i++) {
//			for (int j = 0; j <actualRow.getPhysicalNumberOfCells(); j++) {
//		System.out.println(data[i][j]);
//	}}
		return data;
	}
}
