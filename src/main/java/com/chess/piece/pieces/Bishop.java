package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import static com.chess.piece.Piece.Type.BISHOP;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, BISHOP);
    }

    @Override
    public Vector doMove(Move move) {

        return null;
    }
}
