import java.util.*;

public class RepeatandMissingNumberArray  {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n = A.size();
        long expectedSum = n * (n + 1) / 2;
        long expectedSumSquares = n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSumSquares = 0;

        for (int num : A) {
            actualSum += num;
            actualSumSquares += (long) num * num;
        }

        long sumDiff = expectedSum - actualSum; // y - x
        long sumSquaresDiff = expectedSumSquares - actualSumSquares; // y^2 - x^2 = (y - x)(y + x)

        long sumXY = sumSquaresDiff / sumDiff;

        long y = (sumDiff + sumXY) / 2;
        long x = sumXY - y;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) x);
        result.add((int) y);

        return result;
    }
}
