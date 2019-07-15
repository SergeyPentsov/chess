package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import static com.chess.piece.Piece.Type.PAWN;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, PAWN);
    }

    @Override
    public Vector doMove(Move move) {

        return null;
    }


    public Vector test(Move move) {
       return (getPieceMoveVector(move));
    }
}
