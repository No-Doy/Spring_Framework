package com.Alfano.Brian.Quiz4;

class Book extends Media
{	
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.sortKey = 100;
    }
    
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	} 
    
    public int compareTo(Media obj){
    	int result = 0;
    	
    	if(obj instanceof Book){
    		Book b = (Book)obj;
    		result = this.getTitle().compareTo(b.getTitle());
    	}else{
    		return this.getSortKey() - (obj.getSortKey()); 
    	}	
    return result;
    }
}
