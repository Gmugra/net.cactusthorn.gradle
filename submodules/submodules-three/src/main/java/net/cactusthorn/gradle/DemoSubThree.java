package net.cactusthorn.gradle;

public class DemoSubThree {

    private static final long INIT_VALUE = 100;

    private long value = INIT_VALUE;

    public DemoSubThree() {
    }

    public long plus(long val) {
        this.value += val;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}
