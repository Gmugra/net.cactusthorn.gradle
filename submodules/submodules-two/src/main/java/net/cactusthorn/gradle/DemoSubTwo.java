package net.cactusthorn.gradle;

public class DemoSubTwo {

    private static final long INIT_VALUE = 100;

    private long value = INIT_VALUE;

    public DemoSubTwo() {
    }

    public long plus(long val) {
        this.value += val;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}
