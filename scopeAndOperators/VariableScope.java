package scopeAndOperators;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out=10;
		{
			int in=20;
			//int inside;
			System.out.println(in);
			{
				int inside=10;
				System.out.println(inside);
			}
			//System.out.println(inside);
		}
		
		//System.out.println(in);
		
	}

}
