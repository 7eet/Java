package com.greet.hello;
import com.greet.world.World;

public class Hello {
	public static void main(String... args) {
		System.out.println(getHello() + " " + World.getWorld());
	}
	private static String getHello() {
		return "Hello";
	}
}
