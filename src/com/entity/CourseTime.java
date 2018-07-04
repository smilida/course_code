package com.entity;

public class CourseTime {
	private int startWeek;    //开始的周数
	private int endWeek;      //结束的周数
	private int day;          //星期
	private int startTime;    //上课时间
	private int endTime;      //下课时间
	public int getStartWeek() {
		return startWeek;
	}
	public int getEndWeek() {
		return endWeek;
	}
	public int getDay() {
		return day;
	}
	public int getStartTime() {
		return startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setStartWeek(int startWeek) {
		this.startWeek = startWeek;
	}
	public void setEndWeek(int endWeek) {
		this.endWeek = endWeek;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
