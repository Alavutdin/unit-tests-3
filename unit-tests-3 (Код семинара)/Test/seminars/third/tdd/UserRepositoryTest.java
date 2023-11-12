package seminars.third.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    UserRepository userRepository;
    User adminUser;
    User nonAdminUser;

    @BeforeEach
    void setUp(){
        userRepository =new UserRepository();
        adminUser = new User(true);
        nonAdminUser = new User();
        userRepository.addUser(adminUser);
        userRepository.addUser(nonAdminUser);
    }

    @Test
    void testLoginNonAdminUser(){

        userRepository.loginNonAdminUser();

        assertTrue(nonAdminUser.admin);
    }
}
