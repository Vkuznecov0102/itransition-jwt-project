package project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.dto.AdminUserDto;
import project.model.User;
import project.service.UserService;

@RestController
@RequestMapping(value = "admin")
public class AdminRestController {

    @Autowired
    private final UserService userService;

    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "user/{id}")
    public ResponseEntity<AdminUserDto> getUserById(@PathVariable(name = "id") Long id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        AdminUserDto result = AdminUserDto.fromUser(user);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "user/{id}")
    public String hello(@RequestParam(value = "name") String name) {
        System.out.println("Hello, " + userService.findByUsername(name));
        return "redirect:/";
    }
}
