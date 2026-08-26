import java.util.*;
public class Activity_Selection_2D {

    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct=0;
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingInt(o->o[2]));
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(activities[0][0]);
        int endLast=activities[0][2];
        for(int i=1;i<activities.length;i++){
            if(activities[i][1]>=endLast){
                maxAct++;
                ans.add(activities[i][0]);
                endLast=activities[i][2];
            }
        }
        System.out.println("Maximum activity done "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
