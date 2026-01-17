public class Second_Highest {
     public int secondHighest(String s){
        int highest = -1;
        int secondHighest = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0'; //if u have char and want to convert it to int you can do it by subtracting '0'
                if (digit > highest) {
                    secondHighest = highest;
                    highest = digit;
                } else if (digit < highest && digit > secondHighest) {
                    secondHighest = digit;
                }
            }
        }

        return secondHighest;

    

     }
}
