package aplication;

import Chess.ChessPiece;

public class UserInterface {
    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i<pieces.length; i++){
            System.out.print((8-i)+ " ");
            for(int j = 0 ; j< pieces[0].length; j++){
                printPiece(pieces[i][j]);
             }
             System.out.println();
        }
        System.out.println("  a b c d e f g h");
        System.out.println();
        System.out.println("-----CHESS P3-----");
        System.out.println();
    }
    
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        }else{
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
