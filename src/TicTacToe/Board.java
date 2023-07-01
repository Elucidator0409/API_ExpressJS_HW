package TicTacToe;

import java.util.Scanner;

public class Board {
    int[] matrix = new int[3 * 3];
    boolean player1InTurn;
    String name;
    String turnCharacter = "";

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            if (i == 3 || i == 6)
                System.out.println();
            if (matrix[i] == 0)
                System.out.print("* ");
            else if (matrix[i] == 1)
                System.out.print("X ");
            else
                System.out.print("O ");
            
        }
    }

    public boolean check() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i] != 0 && matrix[i] == matrix[i + 3] && matrix[i] == matrix[i + 6])
                return true;
        }
        for (int i = 0; i < 9; i += 3) {
            if (matrix[i] != 0 && matrix[i] == matrix[i + 1] && matrix[i] == matrix[i + 2])
                return true;
        }
        if (matrix[0] == matrix[4] && matrix[0] == matrix[8] && matrix[0] != 0)
            return true;
        if (matrix[2] == matrix[4] && matrix[2] == matrix[6] && matrix[2] != 0)
            return true;
        return false;
    }

    public void selectPosition(String name1, String nama2) {
        Scanner myObj = new Scanner(System.in);
        int cellFilled = 0;
        for(int i = 0; i < matrix.length; i++){
            if (player1InTurn){
                name = name1;
                turnCharacter = "X";
            }
            else{
                name = nama2;
                turnCharacter = "0";
            }

            while (true) {
                this.printMatrix();
                System.out.print("\n" + name + " " + turnCharacter + ": select position from 1 to 9: ");
                int pos = Integer.valueOf(myObj.nextLine());
                if (pos > 9 || pos < 1) {
                    System.out.println("Invalid position");
                } else if (matrix[pos - 1] != 0) {
                    System.out.println("\nChoose another position");
                } else {
                    System.out.println();
                    cellFilled += 1;
                    if (player1InTurn)
                        matrix[pos - 1] = 1;
                    else
                        matrix[pos - 1] = 2;
                    break;
                }
            }
            if(this.check()){
                this.printMatrix();
                System.out.println("\n" + name + " " + turnCharacter + " win");
                return;
            }
            if(cellFilled == 9){
                System.out.println("No one win");
                return;
            }
            player1InTurn = !player1InTurn;
        }

    }
}
