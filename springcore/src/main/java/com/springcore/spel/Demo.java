package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+22}")
	private int x;
	
	@Value("#{1+2+8+100}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}") // calling static method
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")// calling static variable
	private double e;
	
	@Value("#{new java.lang.String('Anshu')}") // creating object
	private String str;
	
	@Value("#{20>10}")
	private boolean isActive;  // insert boolean value
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", str=" + str + ", isActive=" + isActive + "]";
	}
	
	
	
	
}
