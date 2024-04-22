package com.green.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @AllArgsConstructor 추가 하면 기본생성자 모든 인자 생성자로 변경
// @NoArgsConstructor 를 추가해야 한다.
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class UserDto {
	private String userid;
	private String userpass;
	private String username;
}
