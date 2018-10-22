package com.soft1611.jianshu.entity;

import lombok.Builder;
import lombok.Data;

/**
 * LoginUser DTO
 * @author asus
 */
@Data
@Builder
public class LoginUser {
    private String email;
    private String password;
}
