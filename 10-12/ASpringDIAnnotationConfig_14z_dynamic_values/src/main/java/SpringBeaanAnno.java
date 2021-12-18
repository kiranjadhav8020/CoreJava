import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

class A{
	int p1;
	A(int p1){
		this.p1 = p1;
		System.out.println("A()"+p1);
	}
	
	public void initBn(){
		System.out.println("initBn()...");
	}
	
	public void destroyBn(){
		System.out.println("destroyBn()...");
	}
	
	@Override
	public String toString(){
		return "a="+p1;
	}
}

class Employee{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		System.out.println("Employee() ");
	}
}

//@Configuration
class MyConfig{
	
	public MyConfig() {
		// TODO Auto-generated constructor stub
		this(10.0f);
		System.out.println("MyConfig constructor");
	}
	
	public MyConfig(float f) {
		// TODO Auto-generated constructor stub
		System.out.println("float constructor");
	}
	
	@Bean 
	@Scope("prototype")
	public Employee getEBean(){
		System.out.println("public Employee getEBean()");
		return new Employee();
	}	
	
	@Lazy
	@Bean 
	@Scope("prototype")
	public A getA(int p1){
		return new A(p1);
	}
}
//add float parameter to constructor, also make required changes in main and configuration classes.

public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

		//ctx.register(MyConfig.class);
		//ctx.refresh();
		
		Employee emp = ctx.getBean(Employee.class);
		Employee emp1 = ctx.getBean(Employee.class);
		emp.setName("fevbrgver");
		
		System.out.println(emp.getName());
		
		A oa = ctx.getBean(A.class, 100);
		System.out.println(oa);
		
	}
}
