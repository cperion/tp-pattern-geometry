package org.acme.geometry;

public class WktWriter {
  public String write(Geometry geometry) {
    String out = "";
    switch(geometry.getType()) {

      case ("Point"):
        Point pt = (Point) geometry;
        if (pt.isEmpty()) {
          return "POINT EMPTY";
        }
        out += "POINT(";
        out += pt.getCoordinate().getX() + " ";
        out += pt.getCoordinate().getY() + ")";

      
      case ("LineString"):
        LineString ls = (LineString) geometry;
        if (ls.isEmpty()) {
          return "LINESTRING EMPTY";
        }
        out += "LINESTRING(";
        int n = ls.getNumPoints();
        for(int i = 0; i < n; i++) {
          Point point = ls.getPointN(i);
          out += point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ",";
        }
        // Remove the trailing comma
        out = out.substring(0, out.length() - 1);
        out += ")";
    }
    return out;

  }
}