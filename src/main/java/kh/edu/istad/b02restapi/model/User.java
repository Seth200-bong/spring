package kh.edu.istad.b02restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private UUID id;
    private String name;
    private String username;
    private String password;
    private Boolean isActive;

}
