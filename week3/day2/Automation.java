package week3.day2;

public class Automation extends MultipleLangauge{
	


	public void Java() {
		System.out.println("Java method calling from Language Interface");
		
	}

	public void Selenium() {
		System.out.println("Selenium method calling from TestTool Interface");
		
	}
	
	public void ruby() {
System.out.println("The overrided method\"");
		
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation myabstract= new Automation();
		myabstract.Java();
		myabstract.ruby();
		myabstract.Selenium();
		myabstract.python();
	}
}
		
		
	





