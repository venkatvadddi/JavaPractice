package sampleproject;

public class pattern1 {	
	
		public static void main(String[] args) 
		{ 
			String str = "PROKARMAISHIRING";
			int rows = 3;  //output ="PAIRRKRASIIGOMHN"
			//int rows = 4;  //output ="PMRRRAIIOAIHNKSG"
			String output = Convert(str, rows);
			System.out.println(output);
		
		}
		
	
		static String Convert(String s, int numrows)
		{
			if(numrows ==1)
				return s;			
	
			StringBuilder sb = new StringBuilder();			
			int step = 2*numrows-2;
			
			for (int i=0; i<numrows; i++)
			{
				//first & last rows
				if(i==0 || i== numrows-1)
				{
					for (int j=i; j<s.length(); j=j+step)
					{
						sb.append(s.charAt(j));
					}
					//break;
					//middle rows
				}
				else {
					int j=i;
					boolean flag = true;
					int step1 = 2* (numrows-1 -i);
					int step2 = step - step1;
					
					while (j<s.length()) {
						sb.append(s.charAt(j));
						if(flag)
							j= j+step1;
						else
							j=j+step2;
		
							flag = !flag;
					}
				}
	
				
			}
			return sb.toString();
	}


}
