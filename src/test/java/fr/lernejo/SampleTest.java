package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void testOpADDEquals() {
        int a = 6;
        int b = 5;
        int expected = 11;
        Sample.Operation operation = Sample.Operation.ADD;
        Sample sample = new Sample();
        Assertions.assertEquals(expected, sample.op(operation,a,b));
    }
    @Test
    void testOpADDNotEquals() {
        int a = 6;
        int b = 5;
        int expected = 30;
        Sample.Operation operation = Sample.Operation.ADD;
        Sample sample = new Sample();
        Assertions.assertNotEquals(expected, sample.op(operation,a,b));
    }
    @Test
    void opMULTEquals() {
        int a = 6;
        int b = 5;
        int expected = 30;
        Sample.Operation operation = Sample.Operation.MULT;
        Sample sample = new Sample();
        Assertions.assertEquals(30, sample.op(operation,a,b));
    }
    @Test
     void opMULTNotEquals() {
        int a = 6;
        int b = 5;
        int expected = 31;
        Sample.Operation operation = Sample.Operation.MULT;
        Sample sample = new Sample();
        Assertions.assertNotEquals(expected, sample.op(operation,a,b));
    }
    @Test
    void OperationNotNull() {
        Sample test = new Sample();
        Assertions.assertNotNull(test);
    }
    @Test
    void OperationNull() {
        Sample test = null;
        Assertions.assertNull(test);
    }
    @Test
    void TestEnumEquals()
    {
        Sample.Operation operation = Sample.Operation.MULT;
        Assertions.assertEquals(operation, Sample.Operation.MULT);
    }
    @Test
    void TestEnumNotEquals()
    {
        Sample.Operation operation = Sample.Operation.MULT;
        Assertions.assertNotEquals(operation, Sample.Operation.ADD);
    }
}
