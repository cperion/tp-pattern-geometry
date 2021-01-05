package org.acme.geometry;
import org.acme.geometry.*;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SampleFactory {
  public static Coordinate c1 = new Coordinate(2, 3);
  public static Coordinate c2 = new Coordinate(4, 5);

  public static Point p1 = new Point(c1);
  public static Point p2 = new Point(c2);

  public static LineString getL12() {
    ArrayList<Point> points = new ArrayList<Point>();
    points.add(p1);
    points.add(p2);
    return new LineString(points);
  }


}