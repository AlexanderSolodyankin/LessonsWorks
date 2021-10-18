package kg.itacademy.springwebbap.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserModel {
    private Long id;
    private String username;
    private Long roleId;
}
