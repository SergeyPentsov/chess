package com.chess.chessboard;

import com.chess.piece.Piece;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ChessboardSquare {
    private final Space space;
    private final Piece piece;
}
