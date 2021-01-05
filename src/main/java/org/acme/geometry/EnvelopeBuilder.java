package org.acme.geometry;
import org.acme.geometry.*;

public class EnvelopeBuilder {
  private double xmin;
  private double ymin;
  private double xmax;
  private double ymax;

  public EnvelopeBuilder() {
    xmin = Double.NaN;
    ymin = Double.NaN;
    xmax = Double.NaN;
    ymax = Double.NaN;

  } 

  public void insert(Coordinate coordinate) {
    double x = coordinate.getX();
    double y = coordinate.getY();

    if( x < xmin || Double.isNaN(xmin)) {
    xmin = x;
    } else if (x > xmax || Double.isNaN(xmax)) {
    xmax = x;
    }

    if( y < ymin || Double.isNaN(ymin)) {
      ymin = y;
    } else if (y > ymax || Double.isNaN(ymax)) {
      ymax = y;
    }
  }

  public Envelope build() {
    Coordinate bottomLeft = new Coordinate(xmin, ymin);
    Coordinate topRight = new Coordinate(xmax, ymax);
    return new Envelope(bottomLeft, topRight);
  }
}