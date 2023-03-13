package pl.rmalucha.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAllowsToAssignCreditLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");

        //Act
        card.assignLimit(BigDecimal.valueOf(1000));

        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getBalance());
    }

    @Test
    void itAllowsToAssignDifferentCreditLimit() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        CreditCard card1 = new CreditCard("1234-5679");

        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        card1.assignLimit(BigDecimal.valueOf(1100));

        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getBalance());
        assertEquals(BigDecimal.valueOf(1100), card.getBalance());
    }

    @Test
    void testDoubleAndFloats() {
        /*double x1 = 0.03;
        double x2 = 0.01;

        double result = x1 - x2;

        System.out.println(result);*/
    }

    @Test
    void cantAssignLimitBelow100() {
        CreditCard card = new CreditCard("1234-5678");

        assertThrows(CreditBelowThresholdException.class, () -> card.assignLimit(BigDecimal.valueOf(10)));
    }
}
