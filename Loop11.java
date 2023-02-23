//count of digits

class Loop11{
public static void main(String[] args){
int no=3387;
int count=0;
while(no>0){
no=no/10;
count=count+1;

}
System.out.print(count);
}
}
