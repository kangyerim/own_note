package com.own_note.web.board;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Getter @Setter @ToString
@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Table(name="Board")
public class Board {
    @Id
    private Long id;
    private String title;
    private String writer;
    private String content;

    @CreationTimestamp
    private Timestamp reg_date;
    @UpdateTimestamp
    private Timestamp mod_date;

    @Builder
    public Board(String title, String writer, String content, Timestamp reg_date, Timestamp mod_date) {
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.reg_date = reg_date;
        this.mod_date = mod_date;
    }
}