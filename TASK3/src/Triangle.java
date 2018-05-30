
public class Triangle {

    /*
     * this method check's if calculated segments make a triangle the total length
     * of two sides of triangle is always bigger then the length of the rest side.
     */
    public static String findTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        String result = "It's not a triangle!";

        double segment_1 = getSegmentLength(x1, y1, x2, y2);
        double segment_2 = getSegmentLength(x2, y2, x3, y3);
        double segment_3 = getSegmentLength(x1, y1, x3, y3);

        if (segment_1 + segment_2 > segment_3 && segment_2 + segment_3 > segment_1
                && segment_1 + segment_3 > segment_2) {
            result = "It's a triangle! " + isRightTriangle(segment_1, segment_2, segment_3);
        }
        return result;
    }

    /*
     * this method uses the rule of Pythagoras to check if this triangle is
     * right-angled or not
     */
    public static String isRightTriangle(double side_1, double side_2, double side_3) {
        String result = "It's not a right-angled triangle!";

        if (side_1 * side_1 + side_2 * side_2 == Math.floor(side_3 * side_3)
                || side_2 * side_2 + side_1 * side_1 == Math.floor(side_3 * side_3)
                || side_3 * side_3 + side_2 * side_2 == Math.floor(side_1 * side_1)) {
            result = "It's a right-angled triangle!";
        }
        return result;
    }

    /*
     * here we are calculating segment's length between two points with coordinates
     * (x1, y1), (x2, y2)
     */
    public static double getSegmentLength(int x1, int y1, int x2, int y2) {
        double seg_length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return seg_length;
    }
}