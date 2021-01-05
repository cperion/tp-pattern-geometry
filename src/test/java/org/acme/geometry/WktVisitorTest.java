package org.acme.geometry;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class WktVisitorTest {
    @Test
    public void testWktVisitorPointEmpty() {
        WktVisitor visitor = new WktVisitor();
        Point pt = new Point();

        pt.accept(visitor);
        assertEquals("POINT EMPTY", visitor.getResult());
    }
    
    @Test
    public void testWktVisitorPoint() {
        WktVisitor visitor = new WktVisitor();
        Coordinate coordinate = new Coordinate(3.0, 4.0);
        Point pt = new Point(coordinate);
        pt.accept(visitor);
        assertEquals( "POINT(3.0 4.0)", visitor.getResult() );
    }
}
