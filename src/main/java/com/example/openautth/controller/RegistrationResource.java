package com.example.openautth.controller;

import com.example.openautth.domain.dto.CreateUserRequest;
import com.example.openautth.domain.dto.CreateUserResponse;
import com.example.openautth.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/register")
public class RegistrationResource {
	private final RegistrationService registrationService;

    @PostMapping("/signup")
	public ResponseEntity<CreateUserResponse> registerUser(@RequestBody CreateUserRequest createRequest) {
		CreateUserResponse response =  registrationService.registerUser(createRequest);
		return ResponseEntity.ok(response);
	}
}
