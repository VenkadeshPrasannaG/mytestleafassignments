package day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] set1={3,2,11,4,6,7};
		int[] set2= {1,2,8,4,9,7};
		
		
		for(int i=0;i<set1.length;i++)
		{
			for(int j=0;j<set2.length;j++)
			{
				if(set1[i]==set2[j])
				{
					System.out.println(set1.clone()[i]);
				}
			}
		}

	}

}
