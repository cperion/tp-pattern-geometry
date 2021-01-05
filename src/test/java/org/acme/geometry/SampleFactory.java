package org.acme.geometry;
import java.util.ArrayList;

public class SampleFactory {
  public Coordinate c1 = new Coordinate(2, 3);
  public Coordinate c2 = new Coordinate(4, 5);

  public Point p1 = new Point(c1);
  public Point p2 = new Point(c2);

  public LineString getL12() {
    ArrayList<Point> points = new ArrayList<Point>();
    points.add(p1);
    points.add(p2);
    return new LineString(points);
  }


}