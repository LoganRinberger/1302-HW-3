/*This homework represents my own work. I understand that I may receive help, 
but I did not copy any portion of this assignment from anywhere. 
I understand that a violation of this will result in a Report of Academic Dishonesty.—Logan Rinberger”
*/

package prob1;

import java.util.Arrays;

public class Warehouse 
{
	protected Item[] items = new Item[10];
	private int numItems = 0;
	
	public Warehouse() {}
	
	public void addItem(Item item)
	{
		if (numItems < items.length) 
		{
			items[numItems] = item;
			numItems++;
		}
	}
	
	public int getNumItems() 
	{
		return numItems;
	}
	
	public Item getItem(int i) 
	{
		if (i >= 0 && i < numItems) 
		{
			return items[i];
		}
		else 
		{
			return null;
		}
	}
	
	public Item getItem(String name) 
	{
		for (int i = 0; i < numItems; i++) 
		{
			if (items[i].getName().equals(name)) 
			{
				return items[i];
			}
		}
		return null;
	}
	
	public double getAverageTemp()
	{
		double temp = 0;
		int count = 0;
		double avgTemp = 0;
		for (int i = 0; i < numItems; i++) 
        {
			if(items[i] instanceof RefrigeratedItem)
			{
				temp += ((RefrigeratedItem) items[i]).getTemp();
				count++;
            }
        }
		avgTemp = temp / count;
		return avgTemp;
	}
	
	public double getTotalCost()
	{
		double totalCost = 0;
		for (int i = 0; i < numItems; i++) 
		{
			totalCost += items[i].cost();
		}
		return totalCost;
	}
	
	public double getTotalCostRefrigerated()
	{
		double totalCost = 0;
        for (int i = 0; i < numItems; i++) 
        {
            if(items[i] instanceof RefrigeratedItem)
            {
                totalCost += items[i].cost();
            }
        }
        return totalCost;
	}
	
	public RefrigeratedItem[] getRefrigeratedItems() 
	{
		RefrigeratedItem[] refItems = new RefrigeratedItem[10];
		int count = 0;
		for (int i = 0; i < numItems; i++) 
		{
			if (items[i] instanceof RefrigeratedItem) 
			{
				refItems[count] = (RefrigeratedItem) items[i];
				count++;
			}
		}
		return Arrays.copyOf(refItems, count);
	}
	
	public Item removeItem(int i)
	{
		if (i >= 0 && i < numItems) 
        {
            Item item = items[i];
            for (int j = i; j < numItems - 1; j++) 
            {
                items[j] = items[j - 1];
            }
            numItems--;
            return item;
        }
        else 
        {
            return null;
        }
	}
	
	public Item removeItem(String name) 
	{
		for (int i = 0; i < numItems; i++) 
		{
			if (items[i].getName().equals(name)) 
			{
				Item item = items[i];
				for (int j = i; j < numItems - 1; j++) 
				{
					items[j] = items[j - 1];
				}
				numItems--;
				return item;
			}
		}
		return null;
	}
	


	@Override
	public String toString()
	{
		String msg = "";
		for (int i = 0; i < numItems; i++)
		{
			if (items[i] instanceof RefrigeratedItem)
			{
				msg += "name=" + items[i].getName() 
					+ ", cost=$" + String.format("%.2f", items[i].cost()) 
					+ ", weight=" + String.format("%.2f", items[i].getWeight()) 
					+ ", temperature=" + String.format("%.2f",((RefrigeratedItem) items[i]).getTemp()) 
					+ " degrees"
					+ "\n";
			}
			else
			{
				msg += "name=" + items[i].getName() 
					+ ", cost=$" + String.format("%.2f", items[i].cost()) 
					+ ", weight=" + String.format("%.2f",items[i].getWeight())
					+ "\n";
			}
		}
		return msg;
	}

}
