package com.domdti.java.student.roomservice.mapper;

import org.springframework.stereotype.Component;

import com.domdti.java.student.roomservice.domain.Room;
import com.domdti.java.student.roomservice.dto.RoomDTO;

@Component
public class RoomMapper {
	
	// DTO -> Entity
	public Room toRoom(RoomDTO roomDTO) {
		Room room = new Room();
		room.setAttributes(roomDTO.getAttributes());
		room.setName(roomDTO.getName());
		return room;
	}

	// Entity - DTO
	public RoomDTO toRoomDTO(Room room) {
		RoomDTO dto = new RoomDTO();
		dto.setAttributes(room.getAttributes());
		dto.setName(room.getName());
		return dto;
	}
}
