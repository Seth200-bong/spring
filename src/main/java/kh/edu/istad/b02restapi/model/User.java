package kh.edu.istad.b02restapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable = false, length =50)
    private Boolean isActive;

    @OneToOne(mappedBy = "user")
    private Customer customer;
}
