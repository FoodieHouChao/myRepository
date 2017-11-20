package com.itheima.springboot.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.springboot.dao.NoticeDao;
import com.itheima.springboot.entity.Notice;
import com.itheima.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	/** 查询所有的公告 */
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
