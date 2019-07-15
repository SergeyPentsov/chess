package com.chess.controller;


import com.chess.chessboard.Move;
import com.chess.controller.message.MoveResponse;
import com.chess.piece.pieces.King;
import com.chess.piece.pieces.Pawn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.chess.piece.Piece.Color.WHITE;

@RestController
public class MoveController {

    @PostMapping("/move")
    public MoveResponse doMove(@RequestBody Move move) {
        return new MoveResponse(new King(WHITE).doMove(move));
    }
}
