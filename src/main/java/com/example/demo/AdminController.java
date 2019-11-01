package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//控制器
@RestController
@RequestMapping("/admin")
public class AdminController {

	// 依赖注入(当前的组件需要AdminMapper类型的对象，请创建并传入)
	@Autowired
	AdminMapper mapper;

	// PUT /admin/{administrator:``,password:``,phone:``,gender:``}
	@PostMapping
	public String create(@RequestBody Admin d) {
		mapper.save(d);
		return "ok";

	}

	@GetMapping
	public List<Admin> list() {
		return mapper.findAll();
	}

	// GET /admin/administrator/password
	@RequestMapping(value = "/{administrator}/{password}", method = RequestMethod.GET)
	public String load(@PathVariable("administrator") String administrator, @PathVariable("password") String password) {
		Admin admin = mapper.load(administrator, password);
		if (admin != null) {
			return "ok";
		} else {
			return "error";
		}
	}
}
