package com.actititme.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyData(String key) throws Exception {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	public String getExcelData(String sheetname, int row, int cell) throws Exception {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void setExcelData(String sheetname, int row, int cell, String value) throws Exception {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
