package com.my08_01.my08_01.controller;

import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@GetMapping("/hello")
	public String Hello()
	{
		return "Hello";
	}

	@GetMapping("/ciao")
	public String ciao()
	{
		return "ciao";
	}

	
	@GetMapping("/hola")
	public String hola()
	{
		return "hola";
	}
	
	@PostMapping("/a")
	public String postEndPointA() {

		return "work";
	}
	
	@GetMapping("/a")
	public String getEndPointA() {

		return "work";
	}
	
	@GetMapping("/a/b")
	public String getEndPointAB() {

		return "work";
	}
	
	@GetMapping("/a/b/c")
	public String getEndPointABC() {

		return "work";
	}
	
	@GetMapping("/admin/home")
    public String adminHome() {
        return "Welcome to Home, Admin";
    }

    @GetMapping("/admin/home/room")
    public String adminHomeRome(Authentication a) {
        return "Welcome to home room, Admin " + a.getName();
    }

    @GetMapping("/manager/home")
    public String managerHome() {
        return "Welcome to home, Manager";
    }

    @GetMapping("/manager/home/room")
    public String managerHomeRome() {
        return "Welcome to home room, Manager";
    }

    @PostMapping("/manager/home/room")
    public String postManagerHomeRome() {
        return "Welcome to home room, Manager";
    }
    
    @GetMapping("/manager/home/room/write")
    public String managerHomeRomeWrite(@AuthenticationPrincipal UserDetails userDetails) {
        return "Welcome to home room, Manager + write"+"UserName : " +userDetails.getUsername() + userDetails.getAuthorities().stream().map(c -> c.getAuthority()).collect(Collectors.toList());
    }

    @PostMapping("/manager/home/room/write")
    public String postManagerHomeRomeWrite() {
        return "Welcome to home room, Manager + write";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "Welcome to home, User";
    }

    @GetMapping("/public/home")
    public String publicHome() {
        return "Welcome to home, Public";
    }

}
