package hello;

public class hello1 {
	//note will be translated in English since 11june2016 
	
	/*类常量的使用*/
	public static final double Pi=3.14;
	public static void main(String[] args){	
		for(int line=5;line>=1;line--){
			for(int i=1;i<=(line-1);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(11-2*line); i++){
				System.out.print("*");
			}
			System.out.println(" ");
			}
		
		System.out.print("this is a \"java\" program\n");
		/*System.out.println("cool");*/
		foo();
		System.out.print((int)(16%3));
		
		boo();
		/*this is a picture of star*/
		System.out.print("whitespaces");
		writeSpaces(10);
		System.out.println("endl");
		
	
	}/*test for*/
	public static void boo(){
		int i;int s=0;
		for(i=0;i<10;i++){
			
			s=s+i;}
			System.out.println(s);
			System.out.println("test print a constent number " + Pi);
	    }
		
	
	public static void foo(){
		int i=14;
		System.out.println("this is a function member " + i + " new function");
	}
 
	
		
	//关于参数函数的第一次使用
    public static void writeSpaces(int number){
		for(int i=1;i<=number;i++){
			System.out.print(" ");
		}
	}
}
