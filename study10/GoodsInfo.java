package study10;
//풀어보기1
abstract class GoodsInfo{
	
	public int quantity;
	abstract public void quantityUp(int n);
	abstract public void quantityDown(int n);
	
	public void quantityZero() {
		quantity = 0;
	}
}
