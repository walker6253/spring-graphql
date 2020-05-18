package org.mufeng.examples.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "book")
public class Book{


    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "name")
    private String name;

    @JoinColumn(name = "author_id")
    @OneToOne
    private Author author;


    @Column(name = "publisher")
    private String publisher;

}
