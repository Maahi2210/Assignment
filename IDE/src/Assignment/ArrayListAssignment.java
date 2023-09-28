package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {
	
		//task 1
			ArrayList<Integer> numberList = new ArrayList<Integer>(10);
			
			public ArrayListAssignment() {
				numberList.add(1);
				numberList.add(2);
				numberList.add(3);
				numberList.add(4);
				numberList.add(4);
				numberList.add(6);
				numberList.add(7);
				numberList.add(8);
				numberList.add(8);
				numberList.add(10);
				
			}
			//task 2
			public void displayArrayList(ArrayList<Integer> list) {
				for(Integer num : list) {
					System.out.print(num+ " ");
				}
			}
			//task 3
			public void addElement(int element) {
				numberList.add(element);
				
			}
			//task 4
			public void removeElement(int element) {
				// numberList.remove(element);  It will remove the index's value 
				numberList.remove(Integer.valueOf(element)); // it will remove the value not the index
				
			}
			//task 5
			public void reverseArrayList() {
				 Collections.reverse(numberList); 
			}
			
			//task 6
			public int findSum(ArrayList<Integer> mylist) {
				int sum =0;
				for(Integer num : mylist) {
					sum = sum + num;
				}
				return sum;
			}
			//task 7
			public int findMaximum(ArrayList<Integer> mylist) {
				if(mylist.isEmpty()) {
					return -1;
				}
				int max = mylist.get(0);  // setting max value as index zero(0) for now
				for(Integer num  :mylist) {
					if(num > max) {
						max = num;
					}
					
				}
				return max;
			}
			public int findMinimum(ArrayList<Integer> mylist) {
				if(mylist.isEmpty()) {
					return -1;
				}
				int min = mylist.get(0);  // setting max value as index zero(0) for now
				for(Integer num  :mylist) {
					if(num < min) {
						min = num;
					}
					
				}
				return min;
			}
			//task 8
			 public void sortArrayList() {
			    	Collections.sort(numberList);
			    }
			 //task 9
			 
			 // task 10
				public int findElement(int element) {
					return numberList.indexOf(element);
				}
				
				
				
				
				//task 12  
				public List<Integer> getSublist(int start, int end){
					return numberList.subList(start, end);
				}
				
				
				//task 13
				public boolean isEmptyArrayList() {
					return numberList.isEmpty();
				}
				
				//task 14 
				public void replaceElement(int oldnum,int newnum) {
					Collections.replaceAll(numberList, oldnum, newnum);
				}
				
				//task 15
				public int countOccurrences(int element) {
					return Collections.frequency(numberList, element);
				}
				
				//task16
				public boolean clearArrayList() {
					numberList.clear();
					return false;
				}
				
				//task 17
				
				public int getArrayListSize() {
					return numberList.size();
				}
				
				//task 18
				
				public ArrayList<Integer>  copyArrayList(){
					ArrayList<Integer> copy = new ArrayList<>(numberList);
					return copy;
				}
				
				//task 19 
				public double findAverage() {
					int sum  = findSum(numberList) ;
					double avg = (double)sum /numberList.size();
					return avg;
				}
				

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayListAssignment example = new ArrayListAssignment();
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				example.addElement(9);
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				example.removeElement(4);
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				example.reverseArrayList();
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				int sum = example.findSum(example.numberList);
				System.out.println(sum);
				System.out.println(" ");
				
				int max = example.findMaximum(example.numberList);
				System.out.println(max);
				System.out.println(" ");
				
				int min = example.findMinimum(example.numberList);
				System.out.println(min);
				System.out.println(" ");
				
				example.sortArrayList();
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				System.out.println(example.findElement(2));
				System.out.println(" ");
			
				
				System.out.println(example.getSublist(3,10));
				System.out.println(" ");
				
				System.out.println(example.isEmptyArrayList());
				System.out.println(" ");
				
				example.replaceElement(2, 11);
				example.displayArrayList(example.numberList);
				System.out.println(" ");
				
				
				System.out.println(example.countOccurrences(4));
				System.out.println(" ");
				
				System.out.print(example.clearArrayList());
				System.out.println(" ");
				
				System.out.println(example.getArrayListSize());
				System.out.println(" ");
				
				System.out.println(example.copyArrayList());
				
				double average = example.findAverage();
				System.out.println(average);
				
				
				
			}

		}



