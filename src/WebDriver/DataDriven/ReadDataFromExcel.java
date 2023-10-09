package WebDriver.DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) {

        FileInputStream fileInputStream;

        try {
           fileInputStream = new FileInputStream("C://Users//user//Downloads//read data.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet= workbook.getSheet("Sheet1");

            int rowCount= sheet.getLastRowNum();
            int columnCount= sheet.getRow(0).getLastCellNum();
            XSSFRow currentRow;
            String value;

            for (int i=0 ; i<rowCount ; i++) {

                currentRow= sheet.getRow(i);

                for (int j=0 ; j<columnCount ; j++) {

                    value= currentRow.getCell(j).toString();
                    System.out.println("   " + value);
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
