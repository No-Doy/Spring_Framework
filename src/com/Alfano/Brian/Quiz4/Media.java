package com.Alfano.Brian.Quiz4;

abstract class Media implements Comparable<Media>
{
	protected String title;
    protected int sortKey;
	public String getTitle()  { return title; }
	public int getSortKey() { return sortKey; }
	
	public abstract int compareTo(Media m);
}
