package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "full_name")
    private String name;
    @Column(nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "contry_id")
    private Contrys contry;

    @OneToOne
    @JoinColumn(name = "employee_address_id")
    private EmployeeAddress employeeAddress;
}
