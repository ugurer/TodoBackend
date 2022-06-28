package com.ugurer.TodoWithReact.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;


@Entity
@Data
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotBlank
    private String title;
}
