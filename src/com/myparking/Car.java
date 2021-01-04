package com.myparking;

public class Car {
    private String name;

    private int entryhours;
    private int entrymins;
    private int entryseconds;
    private int exithours;
    private int exitmins;
    private int exitseconds;
    
    Car(String a)
    {
        name = a;

        entryhours = 0;
        entrymins = 0;
        entryseconds = 0;
        
        exithours = 0;
        exitmins = 0;
        exitseconds = 0;

    }
    
    public void setName(String a)
    {
    	name = a;
    }
    
    public String getName() 
    {
    	return name;
    }
    
    public void SetEntryTime(int a, int b, int c)
    {
        entryhours = a;
        entrymins = b;
        entryseconds = c;
    }
    
    public String GetEntryTime()
    {
    	return entryhours + ":" + entrymins + ":" + entryseconds;
    }
    
    public int getEntryhours() {
		return entryhours;
	}

	public int getEntrymins() {
		return entrymins;
	}

	public void SetExitTime(int a, int b, int c)
    {
        exithours = a;
        exitmins = b;
        exitseconds = c;
    }
    
    public String GetExitTime()
    {
    	return exithours + ":" + exitmins + ":" + exitseconds;
    }
    
	public int getExithours() {
		return exithours;
	}

	public int getExitmins() {
		return exitmins;
	}


}
