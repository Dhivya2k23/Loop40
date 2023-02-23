//prime number
class Loop9{
public static void main(String[] args){
int no=45;
int divisor=2;
int count =0;
while(divisor<no){
if(no%divisor==0){
System.out.println("The number is not prime");
count=count+1;
break;
}
divisor=divisor+1;
}
if(count==0){
System.out.println("The number is prime");
}
}
}
