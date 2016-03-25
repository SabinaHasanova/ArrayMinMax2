/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexc2;

/**
 *
 * @author user
 */
public class ArrayExc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat array
        int[][] arry = new int[5][5];
        int[][] arrynew = new int[5][5];
        //fill array
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                arry[i][j] = (int) (Math.random() * 1000);
                arrynew[i][j] = (int) (Math.random() * 1000);
            }
        }
        //Print array

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                System.out.print(arry[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("-----------");

        //MAX MIN Find
        
            int Arrymax = Integer.MIN_VALUE;
            int Arrymin = Integer.MAX_VALUE;
            int ArrymaxIndexX = Integer.MIN_VALUE;
            int ArrymaxIndexY = Integer.MIN_VALUE;
            int ArryminIndexX = Integer.MAX_VALUE;
            int ArryminIndexY = Integer.MAX_VALUE;
            
        for (int i = 0; i < arry.length; i++) {
            
            
            int Rowmax = Integer.MIN_VALUE;
            int Rowmin = Integer.MAX_VALUE;
            int Cellmax = Integer.MIN_VALUE;
            int Cellmin = Integer.MAX_VALUE;
            
            int RowmaxIndex = Integer.MIN_VALUE;
            int RowminIndex = Integer.MAX_VALUE;
            int CellmaxIndex = Integer.MIN_VALUE;
            int CellminIndex = Integer.MAX_VALUE;
            
            
            
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j] > Arrymax) {
                    Arrymax=arry[i][j];
                    ArrymaxIndexX=i;
                    ArrymaxIndexY=j;
                }
                 if (arry[i][j] < Arrymin) {
                   Arrymin=arry[i][j];
                    ArryminIndexX=i;
                    ArryminIndexY=j;}
                
                if (arry[i][j] > Cellmax) {
                    Cellmax = arry[i][j];
                    CellmaxIndex = j;
                    
                 
                }
                if (arry[i][j] < Cellmin) {
                    Cellmin = arry[i][j];
                    CellminIndex = j;
                    
                   
                }

                if (arry[j][i] > Rowmax) {
                    Rowmax = arry[j][i];
                    RowmaxIndex = j;
                }
                if (arry[j][i] < Rowmin) {
                    Rowmin = arry[j][i];
                    RowminIndex = j;
                }

            }
            arrynew[i][CellmaxIndex] = arry[i][CellminIndex];
            arrynew[i][CellminIndex] = arry[i][CellmaxIndex];
            arrynew[RowmaxIndex][i] = arry[RowminIndex][i];
            arrynew[RowminIndex][i] = arrynew[RowmaxIndex][i];

            System.out.println("Cell" + i + " max :" + Cellmax + "  Cell" + i + " min :" + Cellmin);
            System.out.println("ROW" + i + " max :" + Rowmax + "  Row" + i + " min :" + Rowmin);

        }
        
         arrynew[ArrymaxIndexX][ArrymaxIndexY] = arry[ArrymaxIndexY][ArrymaxIndexX];
         arrynew[ArryminIndexY][ArryminIndexY] = arry[ArryminIndexY][ArryminIndexX];
        
        System.out.println("");
        System.out.println("-----------");
            System.out.println("Array max :" + Arrymax + "  Array min :" + Arrymin);
           
        System.out.println("");
        System.out.println("-----------");
        
        
        for (int i = 0; i < arrynew.length; i++) {
            for (int j = 0; j < arrynew[i].length; j++) {
                System.out.print(arrynew[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("-----------");

    }
}
