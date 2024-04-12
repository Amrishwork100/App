package com.itech.login.app.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class TokenResponse {
    private String token;
    private String email;

}
