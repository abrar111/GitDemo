package com.bit.ExceptionAndReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadFileWithException {
	
	
	WebDriver dr;
	@Test(dataProvider="login")
	public void loginFaceBook(Object u,Object p) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nazmus sakib\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		dr = new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys(u.toString());
		dr.findElement(By.id("pass")).sendKeys((String)p);
		
	}
	
	public Object[][] readXl() throws IOException {
		FileInputStream f=new FileInputStream(new File(""));
		XSSFWorkbook book=new XSSFWorkbook(f);
		XSSFSheet sheet=book.getSheetAt(0);
		//sheet.getRow(2).getCell(0).getStringCellValue();
		Object [][] datas=new Object[sheet.getLastRowNum()][sheet.getRow(2).getLastCellNum()];
		for (int i=1;i<=sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(2).getLastCellNum();j++) {
				XSSFCell cell=sheet.getRow(i).getCell(j);
				if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC) {
					datas [i-1][j]=cell.getNumericCellValue();
				}
				else if (cell.getCellType()==XSSFCell.CELL_TYPE_STRING) {
					datas[i-1][j]=cell.getStringCellValue();
				}
			}
		}
		return datas;
	}
	
	
	StringBuffer sb;
	FileReader fr;
	BufferedReader bf;
	@Test
	public void test1() throws IOException {
		
		try {
			fr=new FileReader(new File("C:\\Users\\nazmus sakib\\eclipse-workspace\\XXHOMEWORKmvn\\hello.txt"));
			bf=new BufferedReader(fr);
			sb=new StringBuffer();
			String line=bf.readLine();
			while(line!=null) {
				sb.append(line).append(System.lineSeparator());
				line=bf.readLine();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("ELEMENT NOT FOUND");
		}
		catch(Exception e1) {
			System.out.println("CLASS NOT FOUND");
		}
		finally {
			fr.close();
			bf.close();
			System.out.println("CLOSED");
		}
		System.out.println(sb);
		
		
		
	}
	
	

}
