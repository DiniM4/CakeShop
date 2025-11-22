/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package validation;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dini
 */
public class CustomerValidatorTest {

    public CustomerValidatorTest() {
    }

    CustomerValidator validator = new CustomerValidator();

    @Test
    public void testValidateCustomer_mobileEmpty() {
        String mobile = "";
        String firstName = "Nimal";
        String lastName = "Perera";
        String email = "nimal@gmail.com";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your mobile", e.getMessage());
        }

    }

    @Test
    public void testValidateCustomer_mobileInvalid() {
        String mobile = "nkb";
        String firstName = "Nimal";
        String lastName = "Perera";
        String email = "nimal@gmail.com";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter valid mobile", e.getMessage());
        }

    }

    @Test
    public void testValidateCustomer_FnameEmpty() {
        String mobile = "0787717656";
        String firstName = "";
        String lastName = "Perera";
        String email = "nimal@gmail.com";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your first name", e.getMessage());
        }
    }

    @Test
    public void testValidateCustomer_LnameEmpty() throws Exception {
        String mobile = "0787717656";
        String firstName = "Nimal";
        String lastName = "";
        String email = "nimal@gmail.com";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your last name", e.getMessage());
        }
    }

    @Test
    public void testValidateCustomer_EmailEmpty() {
        String mobile = "0787717656";
        String firstName = "Nimal";
        String lastName = "Perera";
        String email = "";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your email", e.getMessage());
        }
    }

    @Test
    public void testValidateCustomer_EmailInvalid() {
        String mobile = "0787717656";
        String firstName = "Nimal";
        String lastName = "Perera";
        String email = "nim";
        try {
            validator.validateCustomer(mobile, firstName, lastName, email);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Invalid email", e.getMessage());
        }
    }

}
