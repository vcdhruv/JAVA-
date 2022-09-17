/*Create interface EventListener with performEvent() method. Create MouseListener
interface which inherits EventListener along with mouseClicked(), mousePressed(),
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener
interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to create EventDemo class which implements MouseListener and
KeyListener and demonstrate all the methods of the interfaces.*/

interface EventListener
{
	void performEvent();
}
interface MouseListener
{
	void mouseClicked();
	void mousePresssed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}
interface KeyListener
{
	void keyPressed();
	void keyReleased();
}
class EventDemo implements MouseListener,KeyListener
{
	public void mouseClicked()
	{
		System.out.println("Clicked mouse");
	}
	public void mousePresssed()
	{
		System.out.println("Pressed mouse");
	}
	public void mouseReleased()
	{
		System.out.println("Released mouse");
	}
	public void mouseMoved()
	{
		System.out.println("Moved mouse");
	}
	public void mouseDragged()
	{
		System.out.println("Dragged mouse");
	}
	public void keyPressed()
	{
		System.out.println("Pressed key");
	}
	public void keyReleased()
	{
		System.out.println("Released key");
	}
}
class Main4
{
	public static void main(String[] args)
	{
		EventDemo o=new EventDemo();
		o.mouseClicked();
		o.mousePresssed();
		o.mouseReleased();
		o.mouseMoved();
		o.keyPressed();
		o.keyReleased();
	}
}