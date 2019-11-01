package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/roominfo")
public class RoomInfoController {
	@Autowired
	RoomInfoMapper mapper;
	

	@PostMapping
	public String create(@RequestBody RoomInfo d) {
		mapper.save(d);
		return "ok";
	}

	@PutMapping("/{roomnumber}")
	
	public String update(@PathVariable int roomnumber, @RequestBody RoomInfo d) {

		mapper.update(d);

		return "ok";
	}

	@GetMapping
	public List<RoomInfo > list() {
		// 调用了数据访问类中的方法，获得所有开房对象
		return mapper.findAll();
	}
	@GetMapping("/{roomnumber}")
//	获取单条记录
	public RoomInfo find(@PathVariable int roomnumber) {
		return mapper.load(roomnumber);
	} 
	@DeleteMapping("/{roomnumber}")
	public String remove(@PathVariable int roomnumber) {
		mapper.remove(roomnumber);
		return "ok";
	}
	


}
