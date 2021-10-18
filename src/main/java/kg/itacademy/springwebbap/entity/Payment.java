package kg.itacademy.springwebbap.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "payment")
@Getter
@Setter
@Builder
public class Payment extends AbstractBaseEntity{
    @ManyToOne
    @JoinColumn(name= "client_id")
    private Client client;
    private BigDecimal amount;
    private Long status;
}
