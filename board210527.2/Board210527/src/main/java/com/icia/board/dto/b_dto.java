package com.icia.board.dto;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Data //getter,setter, toString 생성자를 자동으로 만들어줌

//@Getter
//@Setter
//@ToString
public class b_dto {
	
	private int bnumber;
	private String bwriter;
	private String bpassword;
	private String btitle;
	private String bcontents;
	private String bdate;
	private int bhits;
		
	
}
