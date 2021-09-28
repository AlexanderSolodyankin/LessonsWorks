package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee_address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
//    @OneToOne
//    @JoinColumn(name = "employee_id")
//    private Employee employee;
}
