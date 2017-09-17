public class Asteric{
	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		for (int j=4;j>=0;j--){
			int temp =(int)(Math.pow(10,j));
			int another_temp =(int)((i/temp)%10);
			System.out.print(another_temp + " ");
		}
	}	

}
