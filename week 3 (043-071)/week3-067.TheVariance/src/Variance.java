import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int number:list){
            
            sum+=number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average=(double)(sum(list));
        
        return average/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        int i=0;
        double sum1=0;
        double avg=average(list);
        System.out.println("average is "+avg);
        while (i<list.size()){
            double CR=(double)(list.get(i)-avg);
            sum1+=Math.pow(CR,2);  
            i++;
        }
        double variance=sum1/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
