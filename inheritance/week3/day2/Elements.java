package inheritance.week3.day2;

public class Elements extends ButtonandTextField{

	public static void main(String[] args) {
		ButtonandTextField bt = new ButtonandTextField();
		bt.setText("Hi");
		bt.click();
		bt.getClass();
		
		WebElement we = new WebElement();
		we.click();
		
		CheckBoxButton cb = new CheckBoxButton();
		cb.click();
		cb.submit();
		
		TextField tf = new TextField();
		tf.click();
		tf.getText();
		
		RadioButton rb = new RadioButton();
		rb.click();
		rb.submit();
		
		Elements em = new Elements();
		em.click();
		em.submit();
	}

}
