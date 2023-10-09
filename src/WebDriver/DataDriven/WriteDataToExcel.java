package WebDriver.DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcel {

    public static void main(String[] args) {

        try {

            FileOutputStream fileOutputStream= new FileOutputStream("C://Users//user//Downloads//write data.xlsx");

            XSSFWorkbook xssfWorkbook= new XSSFWorkbook();
            XSSFSheet xssfSheet= xssfWorkbook.createSheet("Sheet1");

            for (int i=0; i<5; i++) {
                XSSFRow xssfRow= xssfSheet.createRow(i);
                for (int j=0; j<3; j++) {
                    xssfRow.createCell(j).setCellValue("abc");
                }
            }

            xssfWorkbook.write(fileOutputStream);
            fileOutputStream.close();

            System.out.println("Data is successfully written into an excel file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
