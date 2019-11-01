package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 完成对数据的访问
 * @author lenovo
 *
 */

@Mapper
public interface AdminMapper {
	
	
	//查询所有管理员信息
	@Select("select * from admin ")
	List<Admin> findAll();

	//查询记录
	@Select("select administrator password from admin where administrator= #{administrator} and password=#{password}")	
	Admin load(String administrator, String password);

	@Insert("insert into admin(administrator,password,gender,phone) values(#{administrator},#{password},#{gender},#{phone})")
	void save(Admin d);
	
}
