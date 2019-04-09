import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {

  public static void main(String[] args) {


    List<Integer> costs = Arrays.asList(500, 1000, 1250, 175, 800, 120);

    System.out.println("We spent: " + getSumOfExpenses(costs));

    System.out.println("The greatest expense is: " + getGreatestExpense(costs));

    System.out.println("The cheapest expense is: " + getCheapestExpense(costs));

    System.out.println("The average spending is: " + getAverageSpending(costs));

    }

    public static double getAverageSpending(List<Integer> lst){

      int sum = getSumOfExpenses(lst);
      double numOfExp = lst.size();

      return sum/numOfExp;
    }


    public static int getCheapestExpense(List<Integer> lst){

      int minExp = lst.get(0);

      for(int i : lst){

        if(i < minExp){
          minExp = i;
        }

      }

      return minExp;
    }

    public static int getGreatestExpense(List<Integer> lst){

      int maxExp = 0;

      for(int i : lst){

        if(i > maxExp){
          maxExp = i;
        }

      }

      return maxExp;
    }

    public static int getSumOfExpenses(List<Integer> lst){

      int sum = 0;

      for(int i : lst){

        sum += i;

      }

      return sum;
    }
}
