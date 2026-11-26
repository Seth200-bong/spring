package kh.edu.istad.b02restapi.mapper;

import ch.qos.logback.core.model.ComponentModel;
import kh.edu.istad.b02restapi.dto.UserResponse;
import kh.edu.istad.b02restapi.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse mapUsertoUserResponse(User user);


}
