package utilities;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestLogger.class)
public abstract class BaseExcel {

    @BeforeAll
    protected void setUp() {

        Excel.open("sampledata.xlsx");
    }

    @AfterAll
    protected void tearDown() {

        Excel.close();
    }
}