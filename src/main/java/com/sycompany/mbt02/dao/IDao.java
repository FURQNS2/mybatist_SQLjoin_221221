package com.sycompany.mbt02.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sycompany.mbt02.dto.BoardDto;

@Mapper
public interface IDao {

	public BoardDto joinTest(String id);
}
