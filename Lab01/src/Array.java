import java.util.Scanner;
public class Array {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of row : ");
        int row = input.nextInt();
        System.out.println("Enter the size of col : ");
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the alemants of array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Arrar Before : ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + "\t");

                }
                System.out.println();
            }
            int n = arr.length;
            int m = arr[0].length;
            int r[][] = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    r[j][n - i - 1] = arr[i][j];
                }
            }
        System.out.println("Array After : ");
            for (int i = 0; i < r.length; i++) {
                for (int j = 0; j < r[i].length; j++) {
                    System.out.print(r[i][j] + "\t");
                }
                System.out.println();
            }
        }
       /* for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "\t");
                colSum +=  arr[i][j];

            }

            System.out.println("ColSum " + (j + 1) + " = " +  colSum);
        }
            */

        }

