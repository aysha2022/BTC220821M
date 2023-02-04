package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataDriven {
	WebDriver dr;

	@Test(dataProvider = "logindata")
	public void f(Object n, Object s) {
		dr.findElement(By.id("")).sendKeys(n.toString());
		dr.findElement(By.id("")).sendKeys(s.toString());
	}

	@DataProvider(name = "logindata")
	public Object[][] readXL(String path) {
		FileInputStream f = null;
		XSSFWorkbook book = null;
		XSSFSheet sheet = null;
		try {
			f = new FileInputStream(new File(path));

			book = new XSSFWorkbook(f);
			sheet = book.getSheetAt(0);
			// sheet.getRow(2).getCell(0).getStringCellValue();
			Object[][] datas = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 1; i < sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					XSSFCell cell = sheet.getRow(i).getCell(j);
					switch (cell.getCellType()) {
					case XSSFCell.CELL_TYPE_STRING: {
						datas[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					}
					case XSSFCell.CELL_TYPE_NUMERIC: {
						datas[i - 1][j] = sheet.getRow(i).getCell(j).getNumericCellValue();
					}
					}

				}

			}
		}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (f != null) {
					f.close();
				}
				if (book != null) {
					book.close();
				}
			}
			return datas;
		}

		@DataProvider(name = "login")
		public Object[][] dp() {
			Object o[][] = new Object[3][2];
			o[0][0] = "user1";
			o[0][1] = "zwrwr";
			o[1][0] = "user1e";
			o[1][1] = " jgjm";
			o[2][0] = "user1";
			o[2][1] = "user1";
			return o;
	   // return new Object[][] {
	     // new Object[] { 1, "a" },
	    //  new Object[] { 2, "b" },
//		    };
		}

	}

		