import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import TestTasks.Task1;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {
    private int[] a;
    private int[] b;
    Task1 task1;

    public Test1(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}}
        });
    }

    @Before
    public void init() {
        task1 = new Task1();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(b, Task1.getNumsAfter4(a));
    }
}
