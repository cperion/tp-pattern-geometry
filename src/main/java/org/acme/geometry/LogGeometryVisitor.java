package org.acme.geometry;



public class LogGeometryVisitor implements GeometryVisitor {
    public void visit(Point point) {
        String out = "";
        if (point.isEmpty()) {
          System.out.println("POINT EMPTY");
        }
        out += "POINT(";
        out += point.getCoordinate().getX() + " ";
        out += point.getCoordinate().getY() + ")";
        System.out.println(out);
    }

    public void visit(LineString ls) {
        String out = "";
        if (ls.isEmpty()) {
          System.out.println("LINESTRING EMPTY");
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
        System.out.println(out);
    }
}