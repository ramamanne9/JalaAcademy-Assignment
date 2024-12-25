
//11. Write data to an Excel file
package javaio15;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Sheet1");

            Row row = sheet.createRow(0);

            Cell cell = row.createCell(0);

            cell.setCellValue("Hello, Excel!");

            try (FileOutputStream fileOut = new FileOutputStream(new File("data.xlsx"))) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();  
        }
    }
}
