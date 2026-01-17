public class Firstoccurence {
    public static int getIndex(String hayStack,String needle){
        int idx = hayStack.indexOf(needle);
        return idx;
    }
    public static void main(String args[]){
        String hayStack = "sadbutsad";
        String needle = "sad";
        System.out.println(getIndex(hayStack,needle));
    }
}
