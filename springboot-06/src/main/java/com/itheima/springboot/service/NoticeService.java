package com.itheima.springboot.service;

import java.util.List;
import java.util.Map;

import com.itheima.springboot.entity.Notice;

public interface NoticeService {
	/** 查询所有的公告 */
	public List<Notice> findAll();

}
