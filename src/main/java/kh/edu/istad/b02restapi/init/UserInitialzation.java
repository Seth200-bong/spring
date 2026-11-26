package kh.edu.istad.b02restapi.init;


import jakarta.annotation.PostConstruct;
import kh.edu.istad.b02restapi.model.User;
import kh.edu.istad.b02restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
@Slf4j
public class UserInitialzation {
    private final UserRepository userRepository;

    @PostConstruct

    void init(){
        log.info("Initialization user data");
//        1. Create entity object
        User user1 = new User();
        user1.setName("Administrator");
        user1.setUsername("admin");
        user1.setPassword("1122");
        user1.setIsActive(true);

        User user2 = new User();
        user2.setName("customer");
        user2.setUsername("customer");
        user2.setPassword("1122");
        user2.setIsActive(true);

        User user3 = new User();
        user3.setName("Editor");
        user3.setUsername("editor");
        user3.setPassword("1122");
        user3.setIsActive(true);



        //2, start saving user in database
        if(userRepository.count()==0){
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }
    }

}
