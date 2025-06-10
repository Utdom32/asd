package com.domdti.java.student.roomservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domdti.java.student.roomservice.dto.RoomDTO;
import com.domdti.java.student.roomservice.service.RoomService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	@PostMapping()
	public Mono<RoomDTO> createRoom(@RequestBody RoomDTO roomDTO){
		
		return roomService.createRooMono(roomDTO);
		
	}
}
