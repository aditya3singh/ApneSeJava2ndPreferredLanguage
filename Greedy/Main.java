// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();//in which we are storing the index of the activity
        
        maxAct = 1;
        ans.add(0); //adding our 1st activity
        int lastEnd = end[0]; // last activity timing of the part means end part
        for(int i= 1; i< end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("maxActivity "+ maxAct);
        
        for(int i= 0; i< ans.size(); i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
        System.out.println();
    }
}



// or
/*

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        int activities[][] = new int[start.length][3];
        for(int i= 0; i< start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));   
        
        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();//in which we are storing the index of the activity
        
        maxAct = 1;
        ans.add(activities[0][0]); //adding our 1st activity
        int lastEnd = activities[0][2]; // last activity timing of the part means end part
        for(int i= 1; i< end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("maxActivity "+ maxAct);
        
        for(int i= 0; i< ans.size(); i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
        System.out.println();
    }
}
*/
