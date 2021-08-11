package first;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinValueTest {
    private final int [] arr = {3,5,6,7,1,23,2,9};
    @Test
    void findMinValue() {
        MinValue min = new MinValue();
        Assert.assertEquals(1, min.findMinValue(arr));
    }
}

