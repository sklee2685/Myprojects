package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //private 인스튼스 생성을 막는다.
    }

    static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    static int min(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (min < values[i]) {
                continue;
            } else {
                min = values[i];
            }
        }
        /*
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
         */
        return min;
    }

    static int max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max > values[i]) {
                continue;
            } else {
                max = values[i];
            }
        }
        /*
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
         */
        return max;
    }
}
