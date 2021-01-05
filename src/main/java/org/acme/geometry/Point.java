package org.acme.geometry;
import org.acme.geometry.EnvelopeBuilder;


public class Point implements Geometry {
  private Coordinate coordinate;

  public Point() {
    this.coordinate = new Coordinate();
  }

  public Point(Coordinate coordinate) {
    if (!coordinate.isEmpty()) {
      //do stuff
    } else {
      this.coordinate = coordinate;
    }
    
  }

  @Override
  public String getType() {
    return "Point";
  }

  @Override
  public boolean isEmpty() {
    return coordinate.isEmpty();
  }

  @Override
  public void translate(double dx, double dy) {
    Coordinate newCoordinate = new Coordinate(coordinate.getX() + dx, coordinate.getY() + dy);
    this.coordinate = newCoordinate;
  }

  @Override
  public Point clone() {
    return new Point(this.coordinate);
  }

  @Override
  public Envelope getEnvelope() {
    EnvelopeBuilder builder = new EnvelopeBuilder();
    builder.insert(coordinate);
    return builder.build();
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }
}