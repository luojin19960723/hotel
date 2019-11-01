package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface RoomInfoMapper {
	//查询所有
	@Select("select  * from roominfo")
	List<RoomInfo> findAll();
	
	//查询一条记录 更新时用
		@Select("select * from roominfo where roomnumber = #{roomnumber}")
		RoomInfo load(int roomnumber);
		
	//插入数据  
		@Insert("insert into roominfo(roomnumber,statue,price) values (#{roomnumber},#{statue},#{price})")
		void save(RoomInfo d);
	//删除数据  
		@Delete("delete from roominfo where roomnumber=#{roomnumber}")
		void remove(int roomnumber);
	//编辑中的更新操作操作
		@Update("update roominfo set status=#{status} where roomnumber=#{roomnumber}")
		void update(RoomInfo d);
	
	
		@Update("update roominfo set status=#{status} where roomnumber=#{roomnumber}")
		public void ruzhu(RoomInfo roominfo);
		@Update("update roominfo set status=#{status} where roomnumber=#{roomnumber}")
		void checkout(RoomInfo roominfo);
		
	
	
}
