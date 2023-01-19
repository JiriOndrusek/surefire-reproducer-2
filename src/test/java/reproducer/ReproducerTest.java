package reproducer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class ReproducerTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    @Disabled
    public void test1(String test) {
        //always successful
    }

    @Test
    @Disabled
    public void test2() {
        //always successful
    }

}
