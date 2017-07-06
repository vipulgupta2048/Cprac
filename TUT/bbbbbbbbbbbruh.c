#include <stdio.h>

int main()
{
	int b,pro=1,i,sum=0,posi,nege,even,odd;
	float avg;
	int max=-10000000;
	int min=10000000;
	int a[10];
	printf(" Enter how many digits are there ");
	scanf("%d",&b);
	
	if(b>10){
	 printf("invalid length");
	 return 0;
	}
	
	for(i=0;i<b;i++){
		printf("enter a number");
		scanf("%d",&a[i]);
	}
	
	//maximum
	for(i=0;i<b;i++){
		if (a[i]>max)
			max=a[i];
		}
		
	printf("\n The greatest number in the arrray is %d",max);
		
	// positive and negative numbers
	for(i=0;i<b;i++){
		if(a[i]>=0){
			posi++;}
		else{
			continue;}
		
		if(a[i]<0){
			nege++;}
		else{
			continue;}
	}
	printf("\n the count of positive are = %d ",posi);
	
	printf("\n the count of negative are = %d ",nege);
	//minimum
	for(i=0;i<b;i++){
		if(a[i]<min)
			min=a[i];
	}
	printf("\n The smallest number in the array is %d",min);
	
	//odd and even 
	for(i=0;i<b;i++){
		if(a[i] % 2 == 0 ){
			even++;}
		else{
			continue;}
		if(a[i] % 2 !=0){
			odd++;}
		else{
			continue;}
	}
	printf("\n the count of odd numbers are %d \n The count of even numbers are %d",odd,even);
	
	// sum of the elements
	for(i=0;i<b;i++){
	sum=sum+a[i]; 
	}
	
	//products of all the elements
	for(i=0;i<b;i++){
	pro = pro*a[i];
	}
	
	// the elements of the array are
	printf("\n\n The elements of the array are");
	for(i=0;i<b;i++){
		printf(" %d",a[i]);
	}
	
	//average fo all number 
	printf("\n the SUM of all the elements in the array is %d",sum);
	avg=sum/b;
	printf("\n The average of all the digits in the array is %f",avg);
	printf(" \n the product of all the elements in the array is %d",pro);
	return 0;
}
/*
 * systematic logic for greatest
 * 1 2 3 4 6
 * 
 * let greatest =-1000000000;
 * =is 1 greater than greatest
 *   thus 1 becomes greatest
 * =is 2 greater than greatest
 * 	 thus 2 becomes greatest 
 * 
	* so on the last number that is greatest than greatest is the greatest number in the array 
 * 
 * 			SIMILARLY for smallest
 * smallest = 1000000000;
 * 
 * 
 * */
