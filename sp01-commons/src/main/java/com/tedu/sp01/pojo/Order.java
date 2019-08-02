package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get/set,必要的构造方法,tostring,equals,hashcode
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}
