package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "User_name", nullable = false)
    private String name;
    @Column(name = "login", nullable = false, unique = true)
    private String login; //not null unique
    @Column(name = "password", nullable = false)
    private String password; // not null
    private int age;
}
