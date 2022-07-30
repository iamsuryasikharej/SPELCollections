package com.surya.beans;

import java.util.ArrayList;
import java.util.List;

public class City_State_Collection {
	public List<City_State> l=new ArrayList<City_State>();
	public List<City_State> getCityState()
	{
		City_State city_State1=new City_State("wb","kolkata");
		City_State city_State2=new City_State("wb","burdwan");
		City_State city_State3=new City_State("wb","malda");
		City_State city_State4=new City_State("wb","asansol");
		City_State city_State5=new City_State("wb","durgapur");
		l.add(city_State1);
		l.add(city_State2);
		l.add(city_State3);
		l.add(city_State4);
		l.add(city_State5);
		return l;
	}

}
