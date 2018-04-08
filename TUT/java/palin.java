class palin{
 public static void main(String args[]){
  int a,sum=0,tempo;
  int n=343; //hardcoding a palindrome number
  tempo=n;
  System.out.println("The number being tested is " +n);
  while(n>0){
   a=n%10;  //getting remainder
   sum=(sum*10)+a;
   n=n/10;
  }
  if(tempo==sum){System.out.println("palindrome number");}
  else {System.out.println("not palindrome");}
}}
