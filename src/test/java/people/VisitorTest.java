package people;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Playground playground;

    @Before
    public void before(){

        visitor = new Visitor(14, 1.2, 40.0);
        playground = new Playground("Fun Zone", 7);

    }

    @Test
    public void hasAge() {

        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {

        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {

        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void noVisitedAttractionsAtStart(){
        assertEquals(0, visitor.countAttractions());
    }

    @Test
    public void canAddAttractions(){
        visitor.addAttraction(playground);
        assertEquals(1, visitor.countAttractions());
    }
}
