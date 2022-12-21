package com.sycompany.mbt02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
	
	private String writerid;
	private String title;
	private String content;
	private String createtime;
	
	private MemberDto memberDto;
}
