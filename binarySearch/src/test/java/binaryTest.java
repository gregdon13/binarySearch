import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class binaryTest {
    binarySearch search = new binarySearch();

    @Test
    public void testOne() {
        int[] intArr = new int[]{1, 4, 7, 10, 23};
        int intToFind = 10;
        search.binSearch(intArr, intToFind);

        Assert.assertTrue(search.binSearch(intArr, intToFind));
    }

    @Test
    public void testTwo() {
        int[] intArr = new int[]{1, 4, 7, 10, 23};
        int intToFind = 9;
        search.binSearch(intArr, intToFind);

        Assert.assertFalse(search.binSearch(intArr, intToFind));
    }

}
