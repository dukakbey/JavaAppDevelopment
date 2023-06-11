package org.sceylan.util.matrix;

import java.util.Random;

public class MatrixUtil {
    static public int[][] createMatrix(Random r,int row, int column)
    {
        int [][] m = new int[row][column];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                //m[i][j] = r.nextInt(0,100);
            }

        }
        return m;
    }
    static public int[][] transposeMatrix(int[][] n,int row,int column)
    {
        int [][] m = new int[column][row];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                m[j][i] = n[i][j];
            }

        }
        return m;
    }

    static public void printMatrix(int[][] m,int row,int column)
    {
        System.out.println("------------------------");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
