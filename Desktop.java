package orgSystem;

public class Desktop  {
	public void desktopSize() {
		System.out.println("size is 15.6inch");
}
	public static void main(String[]args) {
		Computer computer=new Computer();
		Desktop desktop=new Desktop();
		Computer.computerModel();
		desktop.desktopSize();
		}
}
