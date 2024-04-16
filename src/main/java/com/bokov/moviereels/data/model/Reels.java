package com.bokov.moviereels.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reels {

    @Id
    private Long id;
    private Duration duration;

    @ManyToOne
    @JoinColumn(name="source_id", nullable=false)
    private Source source;

}
