package Searching2;

public class Get_Equal_Substrings_Within_Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int equalSubstring(String s, String t, int maxCost) {
		    int j = 0;
		    for (int i = 0; i < s.length(); ++i) {
		      maxCost -= Math.abs(s.charAt(i) - t.charAt(i));
		      if (maxCost < 0)
		        maxCost += Math.abs(s.charAt(j) - t.charAt(j++));
		    }

		    return s.length() - j;
		  }

}
