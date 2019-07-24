import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Playground playground;
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", 6, ParkingSpot.A4);


    }
//
//    @Test
//    public void canAddReviewable(){
//        themePark.addReviewable(rollerCoaster);
//    }
//
//    @Test
//    public void canViewAllReviewed(){
//        assertEquals(rollerCoaster, themePark.viewAllReviewed())
//    }
}
