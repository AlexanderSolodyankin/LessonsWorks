package kg.itacademy.springwebbap.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="client")
@Getter
@Setter
@Builder
public class Client  extends AbstractBaseEntity{

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "status")
    private Long status;
}
