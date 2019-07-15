package com.chess.piece.pieces;

import com.chess.chessboard.Chessboard;
import com.chess.chessboard.Move;
import com.chess.chessboard.Vector;
import com.chess.piece.Piece;

import static com.chess.piece.Piece.Type.QUEEN;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, QUEEN);
    }

    @Override
    public Vector doMove(Move move) {

        return null;
    }
}
