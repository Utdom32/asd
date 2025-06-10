package com.domdti.java.student.roomservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domdti.java.student.roomservice.domain.Room;
import com.domdti.java.student.roomservice.dto.RoomDTO;
import com.domdti.java.student.roomservice.mapper.RoomMapper;
import com.domdti.java.student.roomservice.repository.RoomRepository;
import com.domdti.java.student.roomservice.service.RoomService;

import reactor.core.publisher.Mono;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private RoomMapper roomMapper;
	

	@Override
	public Mono<RoomDTO> createRooMono(RoomDTO roomDTO) {
		Room room = roomMapper.toRoom(roomDTO);
		
		Mono<RoomDTO> mono = roomRepository.save(room)
		.map(r -> roomMapper.toRoomDTO(r));
		return mono;
	}

}
