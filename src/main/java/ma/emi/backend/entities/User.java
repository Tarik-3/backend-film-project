package ma.emi.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
 @Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "'user'")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @OneToOne(mappedBy = "user")
    @ToString.Exclude
    private Favorite favorite;
}
