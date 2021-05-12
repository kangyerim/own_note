package com.own_note.web.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> findAll() {
        List<Board> boardList = new ArrayList<>();
        boardRepository.findAll().forEach(e -> boardList.add(e));
        return boardList;
    }

    public Optional<Board> findById(Long boardId) {
        Optional<Board> board = boardRepository.findById(boardId);
        return board;
    }

}
