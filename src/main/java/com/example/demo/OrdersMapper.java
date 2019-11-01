package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OrdersMapper {
//	查询所有  显示作用
	@Select("select * from orders")
	List<Orders> findAll();
//查询一条记录 更新时用
	@Select("select * from Orders where id = #{id}")
	Orders load(int id);
//插入数据  创建时用
	@Insert("insert into orders(roomnumber,name,gender,idcard,phone,roomtype,money) values (#{roomnumber},#{name},#{gender},#{idcard},#{phone},#{roomtype},#{money})")
	void save(Orders d);
//删除数据  退房操作
	@Delete("delete from orders where id=#{id}")
	void remove(int id);
//编辑中的更新操作操作
	@Update("update orders set roomnumber=#{roomnumber},roomtype=#{roomtype} ,money=#{money}, phone=#{phone} where id=#{id}")
	void update(Orders d);

}
