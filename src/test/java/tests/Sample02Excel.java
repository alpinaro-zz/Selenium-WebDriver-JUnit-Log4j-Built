package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import utilities.BaseExcel;
import utilities.Excel;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Sample02Excel extends BaseExcel {

    @Test
    @Order(1)
    void isCellValue11() {

        String expectedValue = "Alper";
        String actualValue = Excel.workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    @Order(2)
    void isCellValue21() {

        String expectedValue = "Ece";
        String actualValue = Excel.workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    @Order(3)
    void setCellValue41() {

        String inputValue = "Asya";
        Excel.workbook.getSheet("Sheet1").createRow(3).createCell(0).setCellValue(inputValue);
        Excel.write();
        String actualValue = Excel.workbook.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();

        Assertions.assertEquals(inputValue, actualValue);
    }

    @Test
    @Order(4)
    void setCellValue51() {

        String inputValue = "Ararat";
        Excel.workbook.getSheet("Sheet1").createRow(4).createCell(0).setCellValue(inputValue);
        Excel.write();
        String actualValue = Excel.workbook.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();

        Assertions.assertEquals(inputValue, actualValue);
    }

    @Test
    @Order(5)
    void lastRowIndex() {

        int expectedIndex = 5;
        int actualIndex = Excel.workbook.getSheet("Sheet1").getLastRowNum() + 1;

        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    @Order(6)
    void usedRowNumber() {

        int expectedNumber = 4;
        int actualNumber = Excel.workbook.getSheet("Sheet1").getPhysicalNumberOfRows();

        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}