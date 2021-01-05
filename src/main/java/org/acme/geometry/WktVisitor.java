package org.acme.geometry;

public class WktVisitor implements GeometryVisitor {
    StringBuilder buffer;

    public WktVisitor() {
        this.buffer = new StringBuilder();
    }

    public String getResult() {
        return buffer.toString();
    }

    public void visit(Point point) { 
        if (point.isEmpty()) {
            buffer.append("POINT EMPTY");
            return;
        }
        buffer.append("POINT(");
        buffer.append(point.getCoordinate().getX() + " ");
        buffer.append(point.getCoordinate().getY() + ")");
    }

    public void visit(LineString ls) {
        if (ls.isEmpty()) {
            buffer.append("LINESTRING EMPTY");
            return;
        }
        buffer.append("LINESTRING(");
        int n = ls.getNumPoints();
        for(int i = 0; i < n; i++) {
          Point point = ls.getPointN(i);
          buffer.append(point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ",");
        }
        // Remove the trailing comma
        buffer.setLength(buffer.length() - 1);
        buffer.append(")");
    }
}