package HotelReservation;

public class HotelBooking {package com.Hotel.Reservation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable{
	String bookno;
	Transportation t[][][];
	Laundry l[][][];
	int ff;
	Customer cust;
	int s1=0,s2=0;
	
	
	public String getBookingNumber()
	{
		return bookno;
	}
	
	public void BookNew(Customer c,Luxury ly,Deluxe dx,SuperDeluxe sdx,Transportation tr[][][],Laundry lr[][][],int ily,int flag1,int idx,int flag2,int isdx,int flag3)
	
	{
		cust=c;
	    Fare f=new Fare();
	    int no,i;
	    
    	t=tr;
    	l=lr;
    	
	    if(c.type==1)
	    {
	    			if(flag1==0)
	    			{
	    				System.out.println("No Luxury Rooms Available");
	    				Scanner in5=new Scanner(System.in);
	    				
	    				System.out.println("Do you want any other room? Deluxe(2) or SuperDeluxe(3) ");
	    				int g=in5.nextInt();
	    				
	    				if(g==2)
		    				BookDeluxe(c,dx,g,idx,c.ld,c.d);
	    				if(g==3)
		    				BookSuperDeluxe(c,sdx,g,isdx,c.ld,c.d);
	    			}
	    			if(flag1==1)
	    				BookLuxury(c,ly,c.type,ily,c.ld,c.d);
	    }
	    if(c.type==2)
	    {
	    			if(flag2==0)
	    			{
	    				System.out.println("No Deluxe Room Available");
	    				Scanner in6=new Scanner(System.in);
	    				
	    				System.out.println("Do you want any other room? Luxury(1) or SuperDeluxe(3) ");
	    				int g=in6.nextInt();
	    				
	    				if(g==2)
		    				BookLuxury(c,ly,g,ily,c.ld,c.d);
	    				if(g==3)
		    				BookSuperDeluxe(c,sdx,g,isdx,c.ld,c.d);
	    			}

	    			
	    			if(flag2==1)
	    				BookDeluxe(c,dx,c.type,idx,c.ld,c.d);
	    }
	    
	    
	    if(c.type==3)
	    {
	    			if(flag3==0)
	    			{
	    			System.out.println("No SuperDeluxe Room Available");
	    			Scanner in5=new Scanner(System.in);
    				
    				System.out.println("Do you want any other room? Deluxe(2) or Luxury(3) ");
    				int g=in5.nextInt();
    				
    				if(g==2)
	    				BookDeluxe(c,dx,g,idx,c.ld,c.d);
    				if(g==1)
	    				BookLuxury(c,ly,g,ily,c.ld,c.d);
	    			}

	    			if(flag3==1)
	    				BookSuperDeluxe(c,sdx,c.type,isdx,c.ld,c.d);
	    }
	    
	    
	}
	
	
	
	public void BookLuxury(Customer c,Luxury ly,int type,int ily,int ld,int d)
	{
		Fare f=new Fare();
		ly.statuschange();
		
		if(ld==1)
		{
			System.out.println("Single Luxury Room is booked");
			ff= f.farecalculator(d,ly.rate,ld);
			bookno=ily+"lx1";
			BookDisplay(ff,c.name,t[ily][0][0].getTotalCost(),l[ily][0][1].getTotalCost(),bookno);
			
		}
		if(ld==2)
		{
			System.out.println("Double Luxury Room is booked");
			ff= f.farecalculator(d,ly.rate,ld);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,t[ily][1][0].getTotalCost(),l[ily][1][1].getTotalCost(),bookno);
		}
		
		
	}
	
	public void BookDeluxe(Customer c,Deluxe dx,int type,int idx,int ld,int d)
	{
		dx.statuschange();
		Fare f=new Fare();
		
		if(ld==1)
		{
			System.out.println("Single Deluxe Room is booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx1";
			BookDisplay(ff,c.name,t[idx][0][0].getTotalCost(),l[idx][0][1].getTotalCost(),bookno);
		}
		if(ld==2)
		{
			System.out.println("Double Deluxe Room is booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx2";
		BookDisplay(ff,c.name,t[idx][1][0].getTotalCost(),l[idx][1][1].getTotalCost(),bookno);
		}
		
		
	}
	
	public void BookSuperDeluxe(Customer c,SuperDeluxe sdx,int type,int isdx,int ld,int d)
	{
		Fare f=new Fare();
		
		sdx.statuschange();
			
			if(ld==1)
			{
    			System.out.println("Single Super Deluxe Room is booked");
    			ff= f.farecalculator(d,sdx.rate,ld);
    			bookno=isdx+"sdx1";
    			BookDisplay(ff,c.name,t[isdx][0][0].getTotalCost(),l[isdx][0][1].getTotalCost(),bookno);
    			
			}
			if(ld==2)
			{
				System.out.println("Double Super Deluxe Room is booked");
    			ff= f.farecalculator(d,sdx.rate,ld);
    			bookno=isdx+"sdx2";
    			BookDisplay(ff,c.name,t[isdx][1][0].getTotalCost(),l[isdx][1][1].getTotalCost(),bookno);
    			
			}
			
		
			}
	public void BookDisplay(int ff,String name,int tr,int lr,String b)
	{
		System.out.println("Booking number "+bookno);
		
		System.out.println("Customer number "+cust.no);
		
		System.out.println("Booking Name "+name);
		
		System.out.println("Fare is "+ ff);
		
		System.out.println("Total cost of transportation is"+tr);
		
		System.out.println("Total cost of laundry is"+lr);
	}
	
	
	public int getFare()
	{
		return ff;
	}
	
	public String getName()
	{
		return cust.name;
	}
	

//public String toString() {
//	   return new StringBuffer(" Book No : ")
//	   .append(this.bookno).toString();
//}
}s

}
