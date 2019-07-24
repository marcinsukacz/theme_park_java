package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
        visitor1 = new Visitor(18, 1.85, 50.5);

    }

    @Test
    public void hasName() {

        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {

        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {

        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void canBeVisited() {
        park.visited();
        assertEquals(1, park.getVisitCount());
    }
}
