package demo.module.user.rest;

import demo.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haol on 2017/6/16.
 */
@RestController
@RequestMapping("/rest/user")
public class UserRestController {

        @Autowired
        private UserService userService;


}
