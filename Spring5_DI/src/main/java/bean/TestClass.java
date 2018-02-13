package bean;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass {
	// 기본자료형
	private int data1;
	// 문자열
	private String data2;
	// 객체
	private DataClass data3;
	// 제네릭이 기본 자료형, 문자열은 ArrayList
	private ArrayList<String> data4;
	// 제네릭이 클래스인 ArrayList
	private ArrayList<DataClass> data5;
	// HashMap
	private HashMap<String, Object> data6;
	
	public TestClass(){
		
	}
	
	public TestClass(int data1, String data2, DataClass data3){
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public DataClass getData3() {
		return data3;
	}

	public void setData3(DataClass data3) {
		this.data3 = data3;
	}

	public ArrayList<String> getData4() {
		return data4;
	}

	public void setData4(ArrayList<String> data4) {
		this.data4 = data4;
	}

	public ArrayList<DataClass> getData5() {
		return data5;
	}

	public void setData5(ArrayList<DataClass> data5) {
		this.data5 = data5;
	}

	public HashMap<String, Object> getData6() {
		return data6;
	}

	public void setData6(HashMap<String, Object> data6) {
		this.data6 = data6;
	}
	
	
}







