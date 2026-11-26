package kh.edu.istad.b02restapi.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        Boolean isActive
) {
}
