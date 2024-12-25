//10. Read data from an Excel file:
 
package javaio15;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream(new File("C:\\Users\\Hp\\Desktop\\data.xlsx"));
             Workbook workbook = new XSSFWorkbook(file)) {  // Creating the workbook

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); 
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}


