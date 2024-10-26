package org.muzhikov.katapreproject_3_1_1.controller;

import org.muzhikov.katapreproject_3_1_1.model.User;
import org.muzhikov.katapreproject_3_1_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("")
	public String findAll(Model model){
		List<User> users = userService.getAll();
		model.addAttribute("users", users);
		return "user-list";
	}
	
	@GetMapping("/create")
	public String createUserForm(Model model){
		model.addAttribute("user", new User());
		return "user-create";
	}
	
	@PostMapping("/create")
	public String createUser(@ModelAttribute("user") User user){
		userService.save(user);
		return "redirect:/users";
	}
	
	@GetMapping("/update")
	public String updateUserForm(@RequestParam("id") Long id, Model model){
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "user-update";
	}
	
	@PostMapping("/update")
	public String updateUser(@ModelAttribute("user") User user){
		userService.save(user);
		return "redirect:/users";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") Long id){
		userService.delete(id);
		return "redirect:/users";
	}
}
