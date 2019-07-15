package com.chess.chessboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

@Data
@JsonDeserialize(builder = Move.MoveBuilder.class)
@Builder(builderClassName = "MoveBuilder", toBuilder = true)
public class Move {
    private final Space before;
    private final Space after;

    public Move(Space before, Space after) {
        this.before = before;
        this.after = after;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class MoveBuilder {
    }
}
