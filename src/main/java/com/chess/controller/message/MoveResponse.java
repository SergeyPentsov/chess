package com.chess.controller.message;


import com.chess.chessboard.Vector;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class MoveResponse {
    private final Vector result;
}
