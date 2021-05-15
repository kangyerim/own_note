package com.own_note.web.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("board")
public class BoardController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public List<Board> getAllBoardList() {
        return boardService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Board> findOne(@PathVariable Long id) {
        return boardService.findById(id);
    }

}
