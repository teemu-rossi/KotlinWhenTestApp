package pw.rossi.whentestapp;

import java.util.ArrayList;
import java.util.List;

class TestClass {
    enum TestType {
        ONE,
        TWO
    }

    String testMethod(TestType type) {
        float testFloat;
        switch (type) {
            case ONE: testFloat = 1000.0f; break;
            default: testFloat = 5f; break;
        }
        String before = "Before testFloat=" + testFloat + "\n";  // prints "1000.0"
        List<Integer> dummyObjects = new ArrayList<Integer>(200_000);
        for (int i = 0; i < 200_000; i++) {
            dummyObjects.add(1024);
        }

        return before + "After testFloat=" + testFloat;          // prints "0.0", "1000.0" expected!
    }
}
