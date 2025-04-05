package com.koma.stu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.koma.stu.pojo.Student;

public interface StudentMapper {
	
	//查询/模糊查询
	public List<Student> selAll(@Param("studentName")String studentName);
	
	//新增
	public int addStudent(Student student);
	
	//删除
	public int delStudent(int id);
	
	//查询单条数据
	public Student selOneById(int id);
	
	//修改
	public int updateStudent(Student student);

}
