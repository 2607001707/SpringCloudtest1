package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get/set,必要的构造方法,tostring,equals,hashcode
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
public class User {
	private Integer id;
	private String username;
	private String password;
}
