package sub;
import java.util.*;

public class Calculator {
	
	int input ,result;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void rdata() {
		for(int i = 0; i < 20; i++) {
			list.add(rd.nextInt(89)+10);
//			System.out.println(list.get(i));
		}
	}
	
	public void calcu() {
		int O=0, X=0;
		for(;;) {
			try {
			Scanner sc = new Scanner(System.in);
			int i=0;
			O=0;
			X=0;
			if(input == 1) {
				for(int r=0; r<list.size()/2; r++) {
					result = list.get(i)+list.get(i+1);
					System.out.print(list.get(i)+" + "+list.get(i+1)+ " = ");
					int dab = sc.nextInt();
					if(result == dab) {
						i+=2;
						O++;
					}else {
						i+=2;
						X++;
					}
				}
			}else if(input == 2) {
				for(int r=0; r<list.size()/2; r++) {
					result = list.get(i)-list.get(i+1);
					System.out.print(list.get(i)+" - "+list.get(i+1)+ " = ");
					int dab = sc.nextInt();
					if(result == dab) {
						i++;
						O++;
					}else {
						X++;
						i++;
					}
				}
			}else if(input == 3) {
				for(int r=0; r<list.size()/2; r++) {
					result = list.get(i)*list.get(i+1);
					System.out.print(list.get(i)+" X "+list.get(i+1)+ " = ");
					int dab = sc.nextInt();
					if(result == dab) {
						i++;
						O++;
					}else {
						X++;
						i++;
					}
				}
			}else if(input == 4) {
				for(int r=0; r<list.size()/2; r++) {
					double result = list.get(i)/list.get(i+1);
					System.out.print(list.get(i)+" / "+list.get(i+1)+ " = ");
					double dab = sc.nextDouble();
					if(result == dab) {
						i++;
						O++;
					}else {
						X++;
						i++;
					}
				}
			}else {
				break;
			}
			System.out.println("O = "+O+" X = "+X);
			input();
			if(this.input == 0) {
				break;
			}
			}
		catch (Exception e) {
			System.out.println("오류 발생 !!");
		}
		}
		System.out.println("O = "+O+" X = "+X);
	}
	
	public void input() {
		for(;;) {
			try {
			Scanner sc = new Scanner(System.in);
			System.out.println("원하는 연산을 입력하세요. ");
			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 0.종료");
			input = sc.nextInt();
			break;
			}
			catch (Exception e) {
				System.out.println("오류 발생 !!");
				// TODO: handle exception
			}
		}
	}
	
	
}
