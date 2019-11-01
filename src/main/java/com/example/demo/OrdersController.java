package com.example.demo;

import java.util.List;

import javax.management.relation.RoleInfo;

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
@RequestMapping("/api/v1/orders")
public class OrdersController {
	@Autowired
	OrdersMapper ordersMapper;
 @Autowired
 RoomInfoMapper roomInfoMapper;
 @PostMapping
	public String create(@RequestBody Orders d) {
	 	RoomInfo roominfo = new RoomInfo();
		
		roominfo.setRoomnumber(d.getRoomnumber());
		roominfo.setRoomtype(d.getRoomtype());
		roominfo.setStatus("已入住");
		System.out.println(roominfo);
		// roominfoordersMapper.create(roominfo);
		roomInfoMapper.ruzhu(roominfo);
	
		ordersMapper.save(d);
		return "ok";
	}

	@PutMapping("/{id}")
	public Orders update(@PathVariable int id, @RequestBody Orders d) {
		System.out.println(d);
		RoomInfo roomInfo = roomInfoMapper.load(d.getRoomnumber());
	
		 d.setMoney(roomInfo.getPrice());
		 d.setRoomnumber(roomInfo.getRoomnumber());
		 d.setRoomtype(roomInfo.getRoomtype());
		 
			roomInfo.setStatus("已入住");
			roomInfoMapper.ruzhu(roomInfo);
		ordersMapper.update(d);

		return ordersMapper.load(d.getId());
	}

	@GetMapping
	public List<Orders> list() {
		// 调用了数据访问类中的方法，获得所有开房对象
		return ordersMapper.findAll();
	}
	@GetMapping("/{id}")
//	获取单条记录
	public Orders find(@PathVariable int id) {
//		return ordersMapper.load(id);
		Orders orders = ordersMapper.load(id);
		RoomInfo roomInfo = roomInfoMapper.load(orders.getRoomnumber());
			roomInfo.setStatus("未入住");
			roomInfoMapper.checkout(roomInfo);
			return orders;
	} 
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		Orders orders = ordersMapper.load(id);
		RoomInfo roomInfo = roomInfoMapper.load(orders.getRoomnumber());
			roomInfo.setStatus("未入住");
			roomInfoMapper.checkout(roomInfo);
		ordersMapper.remove(id);
		return "ok";
	}

}
