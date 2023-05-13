package by.antimad.graduation_project.controller;

import by.antimad.graduation_project.entity.UserEntity;
import by.antimad.graduation_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/users")
    public String someMethod() {

        Iterable<UserEntity> userEntities = userService.someMethod();

        String html = "";
        for (UserEntity user : userEntities) {
            html += user.getLastName() + "<br>";
        }
        return html;
    }
}
