package org.acme.geometry;

public class Coordinate {
  private double x;
  private double y;

  public Coordinate() {
    x = Double.NaN;
    y = Double.NaN;
  }

  public Coordinate(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public boolean isEmpty() {
    return Double.isNaN(x) || Double.isNaN(y);
  }
}
