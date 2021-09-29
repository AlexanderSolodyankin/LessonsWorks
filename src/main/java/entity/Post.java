package entity;



import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "posts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;// user_id
    private LocalDate data = LocalDate.now();

    @OneToMany
    @JoinColumn(name = "like_id")
    private List<Like> like;


}
