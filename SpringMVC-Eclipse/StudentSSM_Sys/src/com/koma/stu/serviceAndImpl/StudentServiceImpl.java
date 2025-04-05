package com.koma.stu.serviceAndImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koma.stu.mapper.StudentMapper;
import com.koma.stu.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {

	//自动装配
	@Autowired
	private StudentMapper studentMapper;
	
	//查询/模糊查询
	@Override
	public List<Student> selAll(String studentName) {
		// TODO Auto-generated method stub
		return studentMapper.selAll(studentName);
	}

	//新增
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.addStudent(student);
	}

	//删除
	@Override
	public int delStudent(int id) {
		// TODO Auto-generated method stub
		return studentMapper.delStudent(id);
	}

	//查询单条数据
	@Override
	public Student selOneById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.selOneById(id);
	}

	//修改
	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudent(student);
	}

}
