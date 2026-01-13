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
        String result = test.get(1);
        assertEquals(result, "orion3");
    }
}
