// count of divisors of given number
class Loop8{
public static void main(String[] args){
int no=100;
int count = 0;
 int divisor=2;
while(divisor<no){
if(no%divisor==0)
{
//System.out.println( "divisor is "+ divisor +" ");
count =count+1;
}
divisor = divisor+1;

}
System.out.print("count is "+count);
}
}
