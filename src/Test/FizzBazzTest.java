package Test;

import FizzBazz.FizzBazz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBazzTest {

    @Test
    public void choosingThrees() {
        int input1 = 1;
        int input2 = 4;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("1 2 Fizz 4 ", result);
    }

    @Test
    public void choosingThreesAndFives() {
        int input1 = 1;
        int input2 = 10;
        String result = FizzBazz.countFizzBuzz(input1, input2);
        Assert.assertEquals("1 2 Fizz 4 Bazz Fizz 7 8 Fizz Bazz ", result);
    }
}