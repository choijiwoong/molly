package com.holly.molly.DTO;

import lombok.Getter;
import lombok.Setter;

public class UserDTO {
    @Getter @Setter
    private String name;//form.html post시 name속성으로 찾아 대입해줌. private.

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String password;

    @Getter @Setter
    private String phone;

    @Getter @Setter
    private String birth;

    @Getter @Setter
    private String pid;
}
