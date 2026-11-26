package kh.edu.istad.b02restapi.service.Impl;

import kh.edu.istad.b02restapi.dto.UserResponse;
import kh.edu.istad.b02restapi.mapper.UserMapper;
import kh.edu.istad.b02restapi.model.User;
import kh.edu.istad.b02restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserResponse> getUserWithPaging(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        return userRepository.findAll(pageable)
                .map(userMapper::mapUsertoUserResponse);
    }

    @Override
    public UserResponse getById(UUID id) {
        return userRepository.findById(id)
                .map(userMapper::mapUsertoUserResponse)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "User not found"));
    }

    @Override
    public List<UserResponse> selectAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapUsertoUserResponse)
                .toList();
    }
}
