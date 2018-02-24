package myBugs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListWithBugsTest {

    @Test
    public void addSize() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        Assert.assertEquals(0, test.size());
        test.add("testing_add_siize");
        Assert.assertEquals(1, test.size());
    }

    @Test
    public void addGet() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.add("testing_add_get");
        Assert.assertEquals("testing_add_get", test.get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getException() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.get(1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addException() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.add(2, "testing_add_index");
    }

    @Test
    public void remove() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.add(0,"testing_remove1");
        test.add(1,"testing_remove2");
        Assert.assertEquals("testing_remove1", test.remove(0));
        //Assert.assertEquals("testing_remove2", test.remove(1));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeException() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.remove(1);
    }

    @Test
    public void otherTest1() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.add("test1");
        test.add("test2");
        test.add("test3");
        test.add("test4");
        test.add("test5");
        test.add("test6");
        test.add("test7");
        Assert.assertEquals(7, test.size());

    }

    @Test
    public void otherTest2() {
        MyArrayListWithBugs test = new MyArrayListWithBugs();
        test.add(0, "testing_add_index");
        Assert.assertEquals("testing_add_index", test.get(0));
    }
}