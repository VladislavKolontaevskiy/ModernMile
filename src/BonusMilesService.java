public class BonusMilesService {
    public int calculate (int cost) {
        int costOf1Mile = 20;
        int numberOfMiles = 0;

        if (cost > 0) {
            numberOfMiles = cost / costOf1Mile;
        }

        return numberOfMiles;
    }
}