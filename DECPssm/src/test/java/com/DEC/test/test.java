package com.DEC.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DEC.entity.User;
import com.DEC.service.IUserService;

public class test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		IUserService ius = (IUserService)ctx.getBean("userService");
		User u = new User("uy","123","123@163.com","13698759931","1999-09-22",1);
		for(int i=0;i<50;i++) {
			ius.addUser(u);
		}
//		IHotelService ihs = (IHotelService)ctx.getBean("hotelService");
//		ICityService ics = (ICityService)ctx.getBean("cityService");
//		System.out.println(ics.findCityByPid(1));
//		IProvinceService ips = (IProvinceService)ctx.getBean("provinceService");
//		System.out.println(ips.findAllProvince());
		// TODO Auto-generated method stub
//		IHotelService ihs = new IHotelServiceImpl();
//		IHotelDaoImpl ihs = new IHotelDaoImpl();
//		Hotel h = new Hotel("A","Five","Luxury","xxx","ChinaHZ","4.9",1);
//		ihs.addHotel(h);
//		List<Hotel> hlist = ihs.findAllHotel();
//		for (Hotel hotel : hlist) {
//			System.out.println(hotel);
//		}
	}

}
