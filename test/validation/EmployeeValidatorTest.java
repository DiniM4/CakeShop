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
public class EmployeeValidatorTest {

//    public EmployeeValidatorTest() {
//    }
    private final EmployeeValidator validator = new EmployeeValidator();

    @Test
    public void testValidateEmail_EmptyEmail() {
        String email = "";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "0787717653";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your email", e.getMessage());

        }

    }

    @Test
    public void testValidateEmail_InvalidEmail() {
        String email = "xyz";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "0787717653";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Invalid email", e.getMessage());
        }

    }

    @Test
    public void testValidateFirstName_EmptyFname() {
        String email = "dinithi@gmail.com";
        String firstName = "";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "0787717653";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your first name", e.getMessage());
        }

    }

    @Test
    public void testValidateLastName_EmptyLname() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "";
        String nic = "200378210022";
        String mobile = "0787717653";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your last name", e.getMessage());
        }

    }

    @Test
    public void testValidateNic_EmptyNic() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "";
        String mobile = "0787717653";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your nic", e.getMessage());
        }

    }

    @Test
    public void testValidateMobile_EmptyMobile() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your mobile", e.getMessage());
        }

    }

    @Test
    public void testValidateMobile_validMobile() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "xyz";
        String password = "dini123";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter valid mobile", e.getMessage());
        }

    }

    @Test
    public void testValidatePassword_EmptyPassword() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "0787717624";
        String password = "";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter your password", e.getMessage());
        }

    }

    @Test
    public void testValidatePassword_ValidPassword() {
        String email = "dinithi@gmail.com";
        String firstName = "Dinithi";
        String lastName = "Pabasara";
        String nic = "200378210022";
        String mobile = "0787717624";
        String password = "gufv";
        String gender = "Female";
        String type = "admin";
        String status = "active";

        try {
            validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter minimum eight characters, at least one letter and one number", e.getMessage());
        }

    }
    
    @Test
public void testValidateGender_EmptyGender() {
    String email = "test@example.com";
    String firstName = "Dinithi";
    String lastName = "Pabasara";
    String nic = "200378210022";
    String mobile = "0787717653";
    String password = "Password1";
    String gender = "Select gender"; // Invalid gender
    String type = "admin";
    String status = "active";

    try {
        validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
        Assert.fail("Expected an Exception to be thrown.");
    } catch (Exception e) {
        Assert.assertEquals("Please select a gender", e.getMessage());
    }
}

@Test
public void testValidateType_EmptyType() {
    String email = "test@example.com";
    String firstName = "Dinithi";
    String lastName = "Pabasara";
    String nic = "200378210022";
    String mobile = "0787717653";
    String password = "Password1";
    String gender = "Female";
    String type = "Select type"; // Invalid type
    String status = "active";

    try {
        validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
        Assert.fail("Expected an Exception to be thrown.");
    } catch (Exception e) {
        Assert.assertEquals("Please select a type", e.getMessage());
    }
}

@Test
public void testValidateStatus_EmptyStatus() {
    String email = "test@example.com";
    String firstName = "Dinithi";
    String lastName = "Pabasara";
    String nic = "200378210022";
    String mobile = "0787717653";
    String password = "Password1";
    String gender = "Female";
    String type = "admin";
    String status = "Select status"; // Invalid status

    try {
        validator.validateEmployee(email, firstName, lastName, nic, mobile, password, gender, type, status);
        Assert.fail("Expected an Exception to be thrown.");
    } catch (Exception e) {
        Assert.assertEquals("Please select a status", e.getMessage());
    }
}




    
    

}
