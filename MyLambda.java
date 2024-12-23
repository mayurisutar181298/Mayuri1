package lambda;

public class MyLambda {
	
	public int areaRect(int l,int b) {
		
	return l*b;
		
	}
	
	public void findArea() {
		int area=areaRect(10,21);
		System.out.println("Area="+area);
		reactArea  ar=(int l,int b)->{return l*b;};
		int area_of_rect=ar.areaRect(10,21);
		System.out.println("Area_Of_Rect="+area_of_rect);
	}

	public int areaTriangle(int b,int h) {
		
		return 1/2*b*h;
			
		}
		
		public void findAreaTriangle() {
			int area=areaTriangle(30,34);
			System.out.println("Area Of Triangle="+area);
			areaTri  at=(int b,int h)->{return 1/2*b*h;};
			int area_of_Tri=at.areaTriangle(30,34);
			System.out.println("Area_Of_Tri="+area_of_Tri);
		}
		
			public int areaSquare(int a,int b) {
				
				return a*a;
					
				}
				
				public void findAreaSquare() {
					areaSqu as=(int a, int b) -> { return a*a;};
					int area_of_squ=as.areaSquare(30,30);
					System.out.println("Area_Of_squ="+area_of_squ);
				}
	public static void main(String[] args) {
		
		MyLambda l=new MyLambda();
		l.findArea();
		l.findAreaTriangle();
		
		l.findAreaSquare();
	}

}

interface reactArea{
	int areaRect(int l,int b);
	
}

interface areaTri{
	int areaTriangle(int b,int h);
	
}




interface areaSqu{
	int areaSquare(int a,int b);
	
}

