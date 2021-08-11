package failInterview;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAmountTest {

    @Test
    void calculateYearOfMaxAmountOfPeople() {

            Life life = Life.builder().wasBorn(1900).death(1967).build();
            Life life1 = Life.builder().wasBorn(1910).death(1975).build();
            Life life2 = Life.builder().wasBorn(1920).death(1995).build();
            Life life3 = Life.builder().wasBorn(1900).death(1935).build();
            Life life5 = Life.builder().wasBorn(1934).death(1935).build();
            List<Life> lifeList = List.of(life, life2, life3, life1, life5);
            MaxAmount maxAmount = new MaxAmount();
           Assert.assertEquals(1934, maxAmount.calculateYearOfMaxAmountOfPeople(lifeList));

    }
}