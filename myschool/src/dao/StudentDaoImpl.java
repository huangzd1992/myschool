package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.impl.StudentDao;
import entity.Student;

@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao{
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<Student> findAll() {
		return getSqlSession().selectList("nsStudent.findAllStudent");
	}

}
