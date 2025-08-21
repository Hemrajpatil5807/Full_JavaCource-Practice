package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Bookdtl;

public class BookRowMapper implements RowMapper<Bookdtl> {

	@Override
	public Bookdtl mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Bookdtl b = new Bookdtl();
		        b.setBookId(rs.getInt("bookId"));
		        b.setBookName(rs.getString("bookName"));
		        b.setAuthor(rs.getString("author"));
		        b.setPrice(rs.getFloat("price"));
		        b.setBookCategory(rs.getString("bookCategory"));
		        b.setStatus(rs.getString("status"));
		        b.setFileName(rs.getString("photo"));
		        b.setEmail(rs.getString("email"));
		
		return b;
	}

}
