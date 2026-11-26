package kh.edu.istad.b02restapi.controller;

import kh.edu.istad.b02restapi.dto.UserResponse;
import kh.edu.istad.b02restapi.model.User;
import kh.edu.istad.b02restapi.service.Impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAll(){

        return userService.selectAll();
    }


    @GetMapping("/{id}")
    public UserResponse getById (@PathVariable UUID id)
    {
        return userService.getById(id);
    }

    @GetMapping("paging")
    public Page<UserResponse> getAllWithPaging(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "25") int pageSize
    ){

        return userService.getUserWithPaging(pageNumber, pageSize);
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User create(@RequestBody User user){
//        return userService.create(user);
//    }
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable UUID id){
//        userService.deleteById(id);
//    }
}
