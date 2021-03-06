package com.spring.boardweb.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boardweb.HomeVO;

@Repository
public class HomeDAO {
	//DB에 접근해야 하므로
	//SqlSessionTemplate을 하나 꺼내온다.
	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<HomeVO> getNameList() {
		//첫 번째 매개변수로는 매퍼의 namespace.쿼리문id
		//두 번째 매개변수로는 쿼리에서 사용될 라파미터들
		return mybatis.selectList("HomeDAO.getNameList");
	}

	public void insertName(HomeVO homeVO) {
		// TODO Auto-generated method stub
		mybatis.insert("HomeDAO.insertName", homeVO);
	}

	public void updateName(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		mybatis.update("HomeDAO.updateName", paramMap);
	}

	public void deleteName(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		mybatis.delete("HomeDAO.deleteName", paramMap);
	}


}
