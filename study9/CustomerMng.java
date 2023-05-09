package study9;
//풀어보기1
class Customer1VO{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Customer2VO extends Customer1VO{
	private String phone;
	private String add;
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress(){
		return add;
	}
	
	public void setAddress(String add) {
		this.add = add;
	}
	
}

public class CustomerMng {

	public static void main(String[] args) {
		
		Customer2VO c = new Customer2VO();
		c.setName("이방인");
		c.setPhone("010-111-2222");
		c.setAge(30);
		c.setAddress("서울강남");
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddress());
		System.out.println(c.getPhone());
		
	}
}
