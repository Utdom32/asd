package com.domdti.java.student.roomservice.service;

import com.domdti.java.student.roomservice.dto.RoomDTO;

import reactor.core.publisher.Mono;

public interface RoomService {

	Mono<RoomDTO> createRooMono(RoomDTO roomDTO);
}
