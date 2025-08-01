// Last updated: 8/1/2025, 10:33:51 PM
class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices%2!=0) return new ArrayList<>();
        
        int smallBurger = (4 * cheeseSlices - tomatoSlices) / 2;
        int jumboBurger = cheeseSlices - smallBurger;

        if (smallBurger < 0 || jumboBurger < 0 || 
            (4 * jumboBurger + 2 * smallBurger) != tomatoSlices) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        result.add(jumboBurger);
        result.add(smallBurger);
        return result;
    }
}
