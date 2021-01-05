package org.acme.geometry;
import java.util.ArrayList;
import org.acme.geometry.*;

public class LineString implements Geometry {
  private ArrayList<Point> points;

  public LineString() {
    this.points = new ArrayList<Point>();
  }

  public LineString(ArrayList<Point> points) {
    if (points == null) {
      this.points = new ArrayList<Point>();
    } else {
      this.points = points;
    } 
  }

  public int getNumPoints() {
    return points.size();
  }

  public Point getPointN(int n) {
    return points.get(n);
  }

  @Override
  public String getType() {
    return "LineString";
  }

  @Override
  public boolean isEmpty() {
    return points.size() == 0;
  }

  @Override
  public void translate(double dx, double dy) {
    for (Point point: this.points) {
      point.translate(dx, dy);
    }
  }

  @Override
  public LineString clone() {
    ArrayList<Point> pointClones = new ArrayList<Point>();
    for(Point point: points) {
      pointClones.add(point.clone());
    }
    return new LineString(pointClones);

  }

  @Override
  public Envelope getEnvelope() {
    EnvelopeBuilder builder = new EnvelopeBuilder();
    for (Point point: points) {
      builder.insert(point.getCoordinate());
    }
    return builder.build();
  }
}