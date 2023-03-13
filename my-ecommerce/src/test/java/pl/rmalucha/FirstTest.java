package pl.rmalucha;

import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void testIt() {
        assert true == true;
    }

    @Test
    void testIt2() {
        String myName = "Rafał";
        String output = String.format("hello %s", myName);

        assert output.equals("hello Rafał");
    }

    @Test
    void baseSchema() {
        //Arrange   //Given     //Input
        //Act       //When      //Interaction
        //Assert    //Then      //Output
    }
}
