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
public class ProductValidatorTest {

    public ProductValidatorTest() {
    }

    ProductValidator validator = new ProductValidator();

    @Test
    public void testValidateProduct_IdEmpty() {
        String id = "";
        String brand = "valid brand";
        String category = "valid category";
        String name = "valid product name";
        try {
            validator.validateProduct(id, brand, category, name);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter product id", e.getMessage());
        }

    }

    @Test
    public void testValidateProduct_Brand() {
        String id = "valid id";
        String brand = "Select";
        String category = "valid category";
        String name = "valid product name";
        try {
            validator.validateProduct(id, brand, category, name);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please select a brand", e.getMessage());
        }

    }

    @Test
    public void testValidateProduct_Category() {
        String id = "valid id";
        String brand = "valid Brand";
        String category = "Select";
        String name = "valid product name";
        try {
            validator.validateProduct(id, brand, category, name);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please select a category", e.getMessage());
        }

    }

    @Test
    public void testValidateProduct_Name() {
        String id = "valid id";
        String brand = "Valid Brand";
        String category = "valid category";
        String name = "";
        try {
            validator.validateProduct(id, brand, category, name);
            Assert.fail("Expected an ErrorException to be thrown.");

        } catch (Exception e) {
            Assert.assertEquals("Please enter product name", e.getMessage());
        }

    }

}
