class Main { 

	public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)  
	{         
		if(isAvailable){                   
			if(year==2018){       
				if(month==7 && day<9){
					return false;       
				}
				else return true;     
			} 
			else 
				return false;
		}        
		else 
			return false;  
	}    
}
