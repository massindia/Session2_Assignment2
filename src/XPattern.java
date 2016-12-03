
class XPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 0; a < 5; a++)
        {
           
			for (int b = a; b >= 1; b--)         
           {    
                System.out.print(" ");
           }
    System.out.print('x');
            
            for (int c = a; c < 5; c++)
            {
                System.out.print("  ");
            }
        System.out.print('x');
        System.out.println(" ");
        }   
       
		
		for (int y = 5; y >=0; y--)
        {
		for(int x=y; x>0; x--)
		{
            System.out.print(" ");
        }
    System.out.print('x');
    	
    	for(int z= y ; z<5;z++)

    	{
    		System.out.print("  ");
    		
    	}
    	System.out.print('x');
    	System.out.println(" ");
			
	}
	}
}
		
		
	
