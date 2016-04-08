package org.java.mapper;

import java.util.List;

import org.java.pojo.Tests;

public interface TestsMap {
	//查询
	public List<Tests> selects();
	//根据id查询用户
	public Tests selectid(Integer id);
	//新增
	public void insert(Tests tests);
	//修改
	public void update(Tests tests);
	//删除
	public void delete(Integer id);
}
