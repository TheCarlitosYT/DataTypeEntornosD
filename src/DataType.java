public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    //Refactor no Vector, no Matrix.
    public static String gd(int code) {
        return switch (code) {
            case 702, 1082, 1083, 1114, 1184, 1266, 12403 -> "DATE";
            case 20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396 -> "NUMERIC";
            default -> "STRING";
        };
    }

    public static String gdArray(int code) {
        int codeData[] = new int[]{702, 1082, 1083, 1114, 1184, 1266, 12403};
        int codenumeric[] = new int[]{20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};

        for (int n : codeData) {
            if (n == code) {
                return "DATA";
            }
        }
        for (int n : codenumeric) {
            if (n == code) {
                return "NUMERIC";
            }
        }
        return "STRING";
    }
}
