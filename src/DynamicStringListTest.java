import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    @Test
    public void getTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        String result = test.get(2);
        assertEquals(result, "orion3");
    }
    @Test
    public void setTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        test.set(2, "orion2");
        assertEquals(test.get(2), "orion2");
    }
    @Test
    public void addTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        test.add("orion4");
        test.add("orion5");
        test.add("orion6");
        test.add("orion7");
        test.add("orion8");
        test.add("orion9");
        test.add("orion10");
        assertEquals(test.get(9), "orion10");

    }
    @Test
    public void removeTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        test.remove(2);
        assertEquals(test.get(2), null);
    }
    @Test
    public void sizeTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        assertEquals(test.size(), 3);
    }
    @Test
    public void capacityTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("orion1");
        test.add("orion2");
        test.add("orion3");
        assertEquals(test.capacity(), 8);
    }
}
