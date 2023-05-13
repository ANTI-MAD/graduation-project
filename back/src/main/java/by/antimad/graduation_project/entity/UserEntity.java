package by.antimad.graduation_project.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String email;
    private String firstName;
    private String lastName;
    //private LocalDate birthdate;
}
