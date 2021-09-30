package entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contry")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Contrys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String nameContry;
}
