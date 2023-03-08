package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	public static void screenshotMethod(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);	   
		File destFile = new File("D:\\Screenshots\\"+ screenShotName +".jpg");   
		FileHandler.copy(sourceFile, destFile);		   
	}
	
	
	public static String excelSheetForString(String sheetName, int x, int y) throws IOException
	{
		String path = "D:\\Excel\\excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		String str = book.getSheet(sheetName).getRow(x).getCell(y).getStringCellValue();
		
		return str;
	}
	
	
	public static double excelSheetForNumber(String sheetName, int x, int y) throws IOException
	{
		String path = "D:\\Excel\\excel.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		double num = book.getSheet(sheetName).getRow(x).getCell(y).getNumericCellValue();
		
		return num;
	}
	
}
