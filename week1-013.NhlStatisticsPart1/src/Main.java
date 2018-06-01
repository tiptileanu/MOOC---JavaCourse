
import nhlstats.NHLStatistics;
import java.util.Scanner;
public class Main 
{

    public static void main(String[] args) throws Exception 
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("\tTop ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("\n\tTop 25 players by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("\n\t Unique player statistics:");
        NHLStatistics.searchByPlayer("Mark Fraser");
        
        System.out.println("\n\t Team statistics:");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("\n\t Team players by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
    
}

