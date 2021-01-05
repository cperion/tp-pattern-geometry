package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class AbstractGeometryTest {
    SampleFactory factory;
    @Test
    public void testAsText() {
        SampleFactory fac = new SampleFactory();
        LineString ls = fac.getL12();
        Point pt = fac.p1;
        Assert.assertEquals("LINESTRING(2.0 3.0,4.0 5.0)", ls.asText());
        Assert.assertEquals("POINT(2.0 3.0)", pt.asText());
    }
}