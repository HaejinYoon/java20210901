package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		boolean run = true;
		ex:while(run) {
			System.out.print("0:Exit, 1:Print, 2:Delete, 3:Total Score(50 above)> ");
			int a=0;
			try {
				a=scan.nextInt();	
			} catch (Exception e) {
				System.out.println("input only 0 ~ 3 or 50 above");
			}
			switch (a) {
			case 0:
				System.out.println("Program Terminated");
				break ex ;
			case 1:
				if(arr.size()==0) {
					System.out.println("Nothing in here yet");
				}	
				for(int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i));
				}
				break;
			case 2:
				if(arr.size()>0) {
					System.out.println(arr.get(arr.size()-1)+" deleted");
					arr.remove(arr.size()-1);
				}
				break;
			case 3:
				int sum =0;
				double avg =0;
				if(arr.size()>0) {
					for(int i=0;i<arr.size();i++) {
						sum +=arr.get(i);
					}
				} else {
					System.out.println("Nothing in here yet");
				}
				avg=sum/(double)arr.size();
				System.out.println("Total: "+sum);
				System.out.println("Average: "+avg);
				
//				int max = max(arr);
//				int min = min(arr);
				maxmin(arr);
				
				break;
			default:
				if(a>=50) {
					arr.add(a);
					System.out.println("Input correctly");
					break;
				}else if(a!=1){
					System.out.println("Score must be larger than 50!");
					break;
				}else {
					break;
				}
			}
		}
		scan.close();
	}

	private static void maxmin(ArrayList<Integer> arr) {
		ArrayList<Integer> tmp = new ArrayList<>();
		tmp.addAll(arr);
		Collections.sort(tmp);
		
		int max=tmp.get(tmp.size()-1);
		int min=tmp.get(0);
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

	private static int min(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		
		int min = list.get(0);
		
		for (int i = 1; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		
		return min;
	}

	private static int max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		
		int max = list.get(0);
		
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		return max;
	}
}
