package com.bokov.moviereels.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Source {

    @Id
    private Long id;
    private String name;
    private SourceType type;

    @OneToMany(mappedBy="source")
    private Set<Reels> reels;

}
