package com.mycompany.apps;

import com.mycompany.apps.entities.Users;
import com.mycompany.apps.mappers.UsersMapper;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserServiceTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void testFindAllusers() {
        List<Users> users = usersMapper.findAllUsers();
        Assert.assertNotNull(users);
        for (Users user : users) {
            System.err.println(user.getUsername());
        }
    }
}
