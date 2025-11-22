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
public class AdminLoginValidatorTest {

    public AdminLoginValidatorTest() {
    }

    AdminLoginValidator validator = new AdminLoginValidator();

    @Test
    public void testValidateAdminLogin_EmailEmpty() {
        String email = "";
        String password = "Password";

        try {
            validator.validateAdminLogin(email, password);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your email", e.getMessage());

        }

    }

    @Test
    public void testValidateAdminLogin_EmailValid() {
        String email = "xyz";
        String password = "Password";

        try {
            validator.validateAdminLogin(email, password);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Invalid email", e.getMessage());

        }
    }

    @Test
    public void testValidateAdminLogin_PwEmpty() {
        String email = "valid@gmail.com";
        String password = "";

        try {
            validator.validateAdminLogin(email, password);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your password", e.getMessage());

        }
    }
}
