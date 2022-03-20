public class text {
    public static void move(char pose1,char pose2) {
        System.out.print(pose1+"->"+pose2+" ");
    }
    public static void hannuota(int n,char pose1,char pose2,char pose3){
        if(n==1)
        {
            move(pose1,pose3);
        }
        else
        {
            hannuota(n-1,pose1,pose3,pose2);
            move(pose1,pose3);
            hannuota(n-1,pose2,pose1,pose3);
        }
    }
    public static void main(String[] args) {
         hannuota(4,'A','B','C');
    }
}
