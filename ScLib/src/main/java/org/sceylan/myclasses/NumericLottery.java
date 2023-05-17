package org.sceylan.myclasses;
import org.sceylan.util.array.ArrayUtil;
import java.util.Random;

public class NumericLottery {
    public NumericLottery()
    {
        random = new Random();
    }
    public NumericLottery(Random r)
    {
        random = r;
    }
    Random random;
    int[] numbers = new int[6];
    public int [] getNumbers()
    {
        boolean repeat = true;
        for(int i = 0;i<numbers.length;i++)
        {
            do {
                repeat = false;
                numbers[i] = random.nextInt(1,49);
                for(int j = 0;j<i;j++) {
                    if (numbers[i] == numbers[j])
                        repeat = true;
                    break;
                }
            }
            while (repeat);

        }
        ArrayUtil.bubleSort(numbers);
        return numbers;
    }



}
