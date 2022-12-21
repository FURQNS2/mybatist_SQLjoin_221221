package com.sycompany.mbt02;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sycompany.mbt02.dao.IDao;
import com.sycompany.mbt02.dto.BoardDto;

@Controller
public class JoinController {

	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("/")
	public String test(Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		BoardDto boardDto = dao.joinTest("tiger");
		
		model.addAttribute("boardInfo", boardDto);
		
		return "test";
	}
	
}
