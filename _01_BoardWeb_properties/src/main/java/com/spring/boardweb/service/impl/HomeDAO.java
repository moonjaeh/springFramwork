package com.spring.boardweb.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boardweb.HomeVO;

@Repository
public class HomeDAO {
	//DB�� �����ؾ� �ϹǷ�
	//SqlSessionTemplate�� �ϳ� �����´�.
	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<HomeVO> getNameList() {
		//ù ��° �Ű������δ� ������ namespace.������id
		//�� ��° �Ű������δ� �������� ���� ���Ĺ��͵�
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