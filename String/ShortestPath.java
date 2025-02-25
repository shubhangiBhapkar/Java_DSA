public class ShortestPath {
    public static int getDistance(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
        }
        int Xsqr=x*x;
        int Ysqr=y*y;

        return (int)Math.sqrt(Xsqr+Ysqr);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(getDistance(path));
    }
}
