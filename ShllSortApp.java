package shellSort;

public class ShllSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 10;
		ArraySh arr;
		arr = new ArraySh(maxSize);
		
		for (int j =0; j <maxSize; j++){
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
		arr.display();
	}

}
