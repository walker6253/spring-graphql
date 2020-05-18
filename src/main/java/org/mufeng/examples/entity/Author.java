package org.mufeng.examples.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @Author chenyang
 */

@Data
@Entity
@Table(name = "author")
public class Author{

    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;


    @Column(name = "age", columnDefinition = "varchar(50)")
    private String age;

}
