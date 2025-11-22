/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package validation;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dini
 */
public class SupplierValidatorTest {

//    public SupplierValidatorTest() {
//    }

    SupplierValidator validator = new SupplierValidator();

    @Test
    public void testValidateSupplier_MobileEmpty() {

        String mobile = "";
        String fname = "valid fname";
        String lname = "valid lname";
        String email = "valid email";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter mobile number", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_MobileValid() {

        String mobile = "xyx";
        String fname = "valid fname";
        String lname = "valid lname";
        String email = "valid email";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter valid mobile number", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_FnameEmpty() {

        String mobile = "0787734567";
        String fname = "";
        String lname = "valid lname";
        String email = "email@gmail.com";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter first name", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_LnameEmpty() {

        String mobile = "0787734567";
        String fname = "valid fname";
        String lname = "";
        String email = "valid@gmail.com";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter last name", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_EmailEmpty() {

        String mobile = "0787734567";
        String fname = "fname";
        String lname = "lname";
        String email = "";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your email", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_EmailInvalid() {

        String mobile = "0787734567";
        String fname = "fname";
        String lname = "lname";
        String email = "xyz";
        String company = "valid company name";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Invalid email", e.getMessage());
        }

    }

    @Test
    public void testValidateSupplier_EmptyCompany() {

        String mobile = "0787734567";
        String fname = "fname";
        String lname = "lname";
        String email = "valid@gmail.com";
        String company = "Select Company";
        try {
            validator.validateSupplier(mobile, fname, lname, email, company);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please select a company", e.getMessage());
        }

    }

}
