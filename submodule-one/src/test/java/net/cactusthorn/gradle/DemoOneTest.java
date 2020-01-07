package net.cactusthorn.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoOneTest {

    @Test
    public void plus() {
        DemoOne demo = new DemoOne();
        long value = demo.plus(150L);
        assertEquals(250L, value);
    }
}
