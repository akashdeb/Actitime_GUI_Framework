package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {

	public String toFetchDataFromPropertyFile(String key) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\testData\\propertyData.properties");

		Properties prop = new Properties();

		prop.load(fis);

		return prop.getProperty(key);

	}

	public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\testData\\ExcelData.xlsx");

		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

	}

	public long fetchNumericDataFromExcelSheet(String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\testData\\ExcelData.xlsx");

		return (long)WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();

	}
	
	public boolean fetchBooleanDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\testData\\ExcelData.xlsx");
		
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
		
	}

}
