package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import java.util.List;

import static com.chess.piece.Piece.Type.KING;

public class King extends Piece {
    public King(Color color) {
        super(color, KING);
    }

    @Override
    public Vector doMove(Move move) {
        Vector vector = getPieceMoveVector(move);
        if (vector.getSpaces().size() > 1) throw new IllegalArgumentException("It's not valid move for YOUR KING!!");
        return vector;
    }
}
