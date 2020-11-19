package com.github.onelineoff.treedemo.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.onelineoff.treedemo.controller.NodeController;
import com.github.onelineoff.treedemo.dto.Node;

@RestController
public class SpringBootRestController {

@Autowired
NodeController controller;

	@GetMapping("/test")
	public String test() {
		return "I am a fish\n";
	}
	
	@GetMapping("/getSubtree/{id}")
	public Collection<Node> getSubtree(@PathVariable int id) {
		return controller.getSubtree(id);
	}
}
