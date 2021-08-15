package project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import project.model.User;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private Long id;
    private String username;
    private String lastName;
    private String email;

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setLastName(lastName);
        user.setEmail(email);

        return user;
    }

    public static UserDto fromUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());

        return userDto;
    }
}
