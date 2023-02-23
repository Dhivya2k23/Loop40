// Divisors of given number
class Loop7{
public static void main(String[] args){
int no=100;
 int divisor=2;
while(divisor<no){
if(no%divisor==0)
{
System.out.print(divisor +" ");
}
divisor = divisor+1;
}
}
}
