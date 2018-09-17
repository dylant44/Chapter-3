package youDoIt;

import java.util.Scanner;

public class SpaService 
{
	private String serviceDescription;
	private double price;
	
	public void setSerrviceDescription(String service)
	{
		serviceDescription = service;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	public double getPrice()
	{
		return price;
	}
}


