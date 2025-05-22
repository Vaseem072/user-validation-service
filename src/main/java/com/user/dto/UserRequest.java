package com.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class UserRequest {
    private String name;

    private String email;
//@NotBlank
    @NotNull(message = "mobile no should not be null")
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
