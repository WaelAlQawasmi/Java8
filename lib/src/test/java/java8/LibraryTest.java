/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java8;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library(1);
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
