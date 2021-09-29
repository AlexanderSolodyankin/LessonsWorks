package entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "follows")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Followes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "follower_id")
    private User follower;
    @ManyToOne
    @JoinColumn(name = "following_id")
    private User following;

}
