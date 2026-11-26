package kh.edu.istad.b02restapi.service.Impl;

import kh.edu.istad.b02restapi.dto.UserResponse;
import kh.edu.istad.b02restapi.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public List<UserResponse> selectAll();

    public UserResponse getById(UUID id);

    public Page<UserResponse> getUserWithPaging(int pageNumber, int pageSize);

}
