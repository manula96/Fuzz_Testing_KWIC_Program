public class TriangleProgram {

    public static String triangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b || a == c || b == c) {
                if (a == c && a == b)
                    return "equilateral triangle";
                else if (a == c || b == c)
                    return "isosceles triangle";
            } else
                return "triangle";
        } else
            return "non-triangle";
        return "No output";
    }
    public static void main(String[] args) {
        System.out.println(triangle(3, 6, 6));
    }
}

