package pl.mprochownik.creditcard;
import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest{
    @Test
    public void allowAssignLimit(){
        //Arrange // Given
        CreditCard card = new CreditCard();
        //Act // When
        card.assignLimit(2000);
        
        //Assert // Then
        Assert.assertTrue(card.getBalance() == 2000);
        
    }
    
}