package kg.itacademy.securitylesson.repository;

import kg.itacademy.securitylesson.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
