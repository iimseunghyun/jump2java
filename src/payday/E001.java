package payday;

public class E001 extends Employee {
	public void setInfor() {
		this.setEmpno("E001");
		this.setName("홍길동");
		this.setType("R");
		this.setPay(3000);
	}
	
	public static void main(String[] args) {
		E001 e = new E001();
		e.setInfor();
		System.out.println(e.empno);	
	}

}
