/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package validation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

/**
 *
 * @author Dini
 */
public class CompanyValidatorTest {

//    public CompanyValidatorTest() {
//    }
    private final CompanyValidator validator = new CompanyValidator();

    @Test
    public void testValidateCompany_name() {
        String name = "";
        String hotline = "0112222222";

        try {
            validator.validateCompany(name, hotline);
            Assert.fail("Expected an ErrorException to be thrown.");
        } catch (Exception e) {
            Assert.assertEquals("Please enter company name", e.getMessage());

        }

    }

    @Test
    public void testValidateCompany_hotlineEmpty() {
        String name = "Swiss Group";
        String hotline = "";

        try {
            validator.validateCompany(name, hotline);
            Assert.fail("Expected an ErrorException to be thrown.");
        } catch (Exception e) {
            Assert.assertEquals("Please enter company hotline", e.getMessage());
        }

    }

    @Test
    public void testValidateCompany_hotlineInvalid() {
        String name = "Swiss Group";
        String hotline = "yct";

        try {
            validator.validateCompany(name, hotline);
            Assert.fail("Expected an ErrorException to be thrown.");
        } catch (Exception e) {
            Assert.assertEquals("Please enter valid hotline number", e.getMessage());
        }

    }

}
