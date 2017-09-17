public class SquareCube {
	public static void main(String[] args){
		System.out.printf("%s %s %s%n","number","square","cube");
		for (int i = 0;i<=10;i++){
			System.out.printf("%-7d%-7d%d%n",i,i*i,i*i*i);
		}
	}
}
