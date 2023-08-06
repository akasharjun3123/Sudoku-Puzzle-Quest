import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac {
    public static List<List<Integer>> stringToList(String str){
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<9;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<9;j++){
                char curr = str.charAt((i*9)+j);
                if( curr != '.'){
                    temp.add(Character.getNumericValue(curr));
                }else{
                    temp.add(0);
                }
            }
            arr.add(temp);
        }
        return arr;
    }
    public static void main(String args[]) {
        List<String> unsolved = new ArrayList<>();
        List<String> solved = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of puzzles: ");
        int nPuzzle = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nPuzzle;i++){
            unsolved.add(sc.nextLine());
            solved.add(sc.nextLine());
            if(i != nPuzzle-1) sc.nextLine();
        }
        sc.close();
        for(int i=0;i<unsolved.size();i++){
            System.out.println("{");
            System.out.print("\t\"unsolved\": ");
            System.out.println(stringToList(unsolved.get(i))+",");
            System.out.print("\t\"solved\": ");
            System.out.println(stringToList(solved.get(i)));
            System.out.println("},");
        }


        

        
    }
}
