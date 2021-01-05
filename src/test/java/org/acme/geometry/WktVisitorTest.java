package org.acme.geometry;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class WktVisitorTest {
    @Test
    public void testWktVisitorPointEmpty() {
        WktVisitor visitor = new WktVisitor();
        Coordinate coordinate = new Coordinate(3.0, 4.0);
        Point pt = new Point();
        // BUG pt is null! I con't seem to find why
        pt.accept(visitor);
        assertEquals( "POINT EMPTY", visitor.getResult() );
    }
}
