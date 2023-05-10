package application;


import java.util.Scanner;

import BoardGame.Board;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true){
        UserInterface.printBoard(chessMatch.getPieces());
        System.out.println();
        System.out.println("Source: ");
        ChessPosition source = UserInterface.readChessPosition(sc);

        System.out.println();
        System.out.println("Target: ");
        ChessPosition target = UserInterface.readChessPosition(sc);

        ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}
