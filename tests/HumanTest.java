import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Test;

public class HumanTest {
    @Test
    public void testHumanDateBirthday() {
	Pass testDoc = new Pass(123);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	assertEquals(testDate, first.getDateBorn());
    }

    @Test
    public void testHumanPass() {
	Pass testDoc = new Pass(123);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	assertEquals(testDoc, first.getPass());
    }

    @Test
    public void testHumanName() {
	Pass testDoc = new Pass(123);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	assertEquals("Artem", first.getName());
    }

    @Test
    public void testHumanEqualsHighter() {
	Pass testDoc = new Pass(123);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	Pass testSecondDoc = new Pass(123);
	MyCalendar testSecondDate = new MyCalendar(22, 06, 1996);
	Human second = new Human("Artem", testSecondDoc, testSecondDate);
	assertEquals(1, first.compareTo(second));
    }

    @Test
    public void testHumanEqualsLower() {
	Pass testDoc = new Pass(123);
	MyCalendar testDate = new MyCalendar(22, 06, 1996);
	Human first = new Human("Artem", testDoc, testDate);
	Pass testSecondDoc = new Pass(123);
	MyCalendar testSecondDate = new MyCalendar(22, 06, 1995);
	Human second = new Human("Artem", testSecondDoc, testSecondDate);
	assertEquals(-1, first.compareTo(second));
    }

    @Test
    public void testHumanEqualsEqualDate() {
	Pass testDoc = new Pass(124);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	Pass testSecondDoc = new Pass(123);
	MyCalendar testSecondDate = new MyCalendar(22, 06, 1995);
	Human second = new Human("Artem", testSecondDoc, testSecondDate);
	assertEquals(1, first.compareTo(second));
    }

    @Test
    public void testToString() {
	Pass testDoc = new Pass(124);
	MyCalendar testDate = new MyCalendar(22, 06, 1995);
	Human first = new Human("Artem", testDoc, testDate);
	assertEquals("Artem/124/22.6.1995", first.toString());
    }
}
