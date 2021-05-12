package com.own_note.web.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
public class BoardController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BoardRepository boardRepository;

}
