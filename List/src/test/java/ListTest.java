import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListTest {
    @Test
    public void pushBackTest() {
        var list = new List<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        assertEquals(2, list.getSize());
        assertEquals(1, list.get(0).intValue());
    }

    @Test
    public void pushFrontTest() {
        var list = new List<Integer>();
        list.pushFront(12);
        list.pushFront(-11);
        assertEquals(2, list.getSize());
        assertEquals(-11, list.get(0).intValue());
    }

    @Test
    public void popFrontTest() {
        var list = new List<Integer>();
        list.pushBack(62);
        list.pushBack(31);
        list.popFront();
        assertEquals(1, list.getSize());
        assertEquals(31, list.get(0).intValue());
    }

    @Test
    public void popBackTest() {
        var list = new List<Integer>();
        list.pushBack(7);
        list.pushBack(8);
        list.pushFront(4);
        list.popBack();
        assertEquals(2, list.getSize());
        assertEquals(7, list.get(1).intValue());
    }

    @Test
    public void deleteTest() {
        var list = new List<Integer>();
        list.pushBack(1);
        list.pushBack(2);
        list.delete(0);
        assertEquals(1, list.getSize());
        assertEquals(2, list.get(0).intValue());
    }

    @Test
    public void insertTest() {
        var list = new List<Integer>();
        list.insert(0, 7);
        list.insert(1, 6);
        list.insert(2, 5);
        assertEquals(3, list.getSize());
        assertEquals(7, list.get(0).intValue());
        assertEquals(5, list.get(2).intValue());
    }
}