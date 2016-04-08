package org.java.serviceImpl;

import java.util.List;

import org.java.mapper.TestsMap;
import org.java.pojo.Tests;
import org.java.service.TestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TestsServiceImpl implements TestsService {
	@Autowired
	private TestsMap testsmap;
	/**
	 * 查询所有
	 */
	public List<Tests> selects() {
		return testsmap.selects();
	}
	/**
	 * 新增用户
	 */
	public void insert(Tests tests) {
		testsmap.insert(tests);
	}

	/**
	 *根据id修改用户
	 */
	public void update(Tests tests) {
		testsmap.update(tests);
	}
	/**
	 * 根据id删除用户
	 */
	public void delete(Integer id) {
		testsmap.delete(id);
	}
	/**
	 * 根据id查询用户
	 */
	public Tests selectid(Integer id) {
		return testsmap.selectid(id);
	}

}
