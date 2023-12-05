package Q5;

public class Q5 {
    public int canFinish(int[] gas, int[] cost) {
        int sum = 0, n = gas.length;
        for(int i=0;i<n;i++) {
            sum += gas[i]-cost[i];
        }
        if(sum < 0) return -1;
		
        int gasInTank = 0, start = 0;
        for(int i=0;i<n;i++) {
            gasInTank += gas[i]-cost[i];
            if(gasInTank < 0) {
                start = i+1;
                gasInTank = 0;
            }
        }
        
        return gasInTank >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        Q5 q5 = new Q5();
        System.out.println(q5.canFinish(gas,cost));
    }
}
