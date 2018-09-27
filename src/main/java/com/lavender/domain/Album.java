package com.lavender.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "albums")
@AllArgsConstructor
@NoArgsConstructor
public class Album {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String albumName;

    @Column(nullable = false)
    private int year;
}
