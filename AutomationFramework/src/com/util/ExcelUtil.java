package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static Object[][] getData() {
		Object[][]data = null;
		try {
			FileInputStream fin = new FileInputStream(new File("src//resources//test-data.xlsx"));
			Workbook book = new XSSFWorkbook(fin);
			Sheet sheet = book.getSheetAt(0);
			int rows = sheet.getLastRowNum();
			data = new Object[rows][2];
			for (int i=1;i<=rows;i++) {
				System.out.println("I is: " + i);
				int count = 0;
				Row row = sheet.getRow(i);
				Iterator<Cell> cell = row.cellIterator();
				while(cell.hasNext() && count < 2) {
					Cell c = cell.next();
					System.out.println("count is: " + count);
					data[i-1][count] = c.getStringCellValue();
					count++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
