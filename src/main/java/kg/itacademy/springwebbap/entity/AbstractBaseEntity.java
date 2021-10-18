package kg.itacademy.springwebbap.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime creatDate;
    private LocalDateTime updateDate;

    @PrePersist
    public void prePersist(){
        this.creatDate = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        this.updateDate = LocalDateTime.now();
    }
}
