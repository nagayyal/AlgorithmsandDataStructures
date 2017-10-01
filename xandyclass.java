
public class xandyclass {
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int y;
	
	public double distancecalculation()
	{
		double d;
		d=Math.sqrt((Math.pow(x,2)+Math.pow(y, 2)));
		return d;
	}
	

}
