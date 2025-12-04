import com.example.SF1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {16, 17, Integer.MAX_VALUE-1, Integer.MAX_VALUE})
    void TestMethod16(int age) {
        assertTrue(Main.canDrive(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, Integer.MIN_VALUE+1, 14, 15})
    void TestMethodFalse(int age) {
        assertFalse(Main.canDrive(age));
    }
}