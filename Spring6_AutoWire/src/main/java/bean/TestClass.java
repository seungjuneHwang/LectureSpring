package bean;

public class TestClass {
	private DataClass data1;
	private DataClass data2;
	
	public TestClass(){
		
	}
	
	public TestClass(DataClass d1, DataClass d2){
		this.data1 = d1;
		this.data2 = d2;
	}

	public DataClass getData1() {
		return data1;
	}

	public void setData1(DataClass data1) {
		this.data1 = data1;
	}

	public DataClass getData2() {
		return data2;
	}

	public void setData2(DataClass data2) {
		this.data2 = data2;
	}	
}








