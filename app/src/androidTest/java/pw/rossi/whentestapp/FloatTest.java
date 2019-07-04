package pw.rossi.whentestapp;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class FloatTest {
    private enum TestType {
        ONE,
        TWO
    }

    private TestType type = TestType.ONE;

    @Test
    public void testMethod() {
        float testFloat;
        switch (type) {
            case ONE: testFloat = 1000.0f; break;
            default: testFloat = 5f; break;
        }

        List<Integer> dummyObjects = new ArrayList<Integer>(200_000);
        for (int i = 0; i < 200_000; i++) {
            dummyObjects.add(1024);
        }

        assertEquals(1000.0f, testFloat, 0.1f);
    }
}
