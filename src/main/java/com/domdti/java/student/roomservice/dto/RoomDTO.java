package com.domdti.java.student.roomservice.dto;

import java.util.Map;

import lombok.Data;

@Data
public class RoomDTO {

	private String name;
	private Map<String, Object> attributes;
}
