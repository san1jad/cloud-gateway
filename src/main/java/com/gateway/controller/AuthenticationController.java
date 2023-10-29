package com.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

 /*   @GetMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @AuthenticationPrincipal OidcUser oidcUser,
            Model model,
            @RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client
    ) {
        AuthenticationResponse authenticationResponse =
                AuthenticationResponse.builder()
                        .userId(oidcUser.getEmail())
                        .accessToken(client.getAccessToken().getTokenValue())
                        .refreshToken(client.getRefreshToken().getTokenValue())
                        .expiresAt(client.getAccessToken().getExpiresAt().getEpochSecond())
                        .authorityList(oidcUser.getAuthorities()
                                .stream()
                                .map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                        .build();
        return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);

    }*/
}
