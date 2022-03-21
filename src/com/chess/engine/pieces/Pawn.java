package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.Board;
import com.chess.engine.board.BoardUtils;
import com.chess.engine.board.Move;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pawn extends Piece{

    private final static int[] CANDIDATE_MOVE_COORDINATE = {-8};

    Pawn(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {
        final List<Move> legalMoves = new ArrayList<>();

        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATE){
             int candidatesDestinationCoordinate = this.piecePosition + (this.getPieceAlliance().getDirection() * currentCandidateOffset);

             if(!BoardUtils.isValidTileCoordinate(candidatesDestinationCoordinate)){
                 continue;
             }
             if(currentCandidateOffset == 8 && !board.getTile(candidatesDestinationCoordinate).isTileOccupied()){
                // more work to do
                 legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
             }

        }

        return null;
    }
}
