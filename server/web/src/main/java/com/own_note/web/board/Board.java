package com.own_note.web.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Getter @Setter @ToString
@Entity
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
}