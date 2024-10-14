package org.correa.tasks.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;
    private int daysValidate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime daysToFinalize;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
