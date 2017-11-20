package com.itheima.springboot.controller;
/**
 * 整合spring-data-jpa
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.itheima.springboot.entity.Notice;
import com.itheima.springboot.service.NoticeService;

@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	/** 查询全部公告 */
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(Model model) {
		return noticeService.findAll();
	}
}