package entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "likes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name ="post_id")
    private Post postId;
    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user_id;
}
