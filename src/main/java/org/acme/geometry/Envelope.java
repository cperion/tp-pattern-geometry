package org.acme.geometry;

public class Envelope {
  private Coordinate bottomLeft;
  private Coordinate topRight;

  public Envelope() {

  }

  public Envelope(Coordinate bottomLeft, Coordinate topRight) {
    // Check for empty coordinates
    assert !bottomLeft.isEmpty();
    assert !topRight.isEmpty();

    this.topRight = topRight;
    this.bottomLeft = bottomLeft;
  }

  public Boolean isEmpty() {
    return bottomLeft.isEmpty() || topRight.isEmpty();
  }

  public double getXmin() {
    return bottomLeft.getX();
  }

  public double getYmin() {
    return bottomLeft.getY();
  }

  public double getXmax() {
    return topRight.getX();
  }

  public double getYmax() {
    return topRight.getY();
  }

  
}