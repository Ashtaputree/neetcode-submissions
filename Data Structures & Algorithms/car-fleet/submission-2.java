class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n=position.length;
       if(n==0)
       {
        return 0;

       }
       double[][]car=new double[n][2];
       for(int i=0;i<n;i++)
       {
        car[i][0]=position[i];
        car[i][1]=(double)(target-position[i])/speed[i];

       }
       Arrays.sort(car,(a,b)->Double.compare(a[0],b[0]));
       int fleets=0;
       double maxtime=0;
       for(int i=n-1;i>=0;i--)
       {
        double currtime=car[i][1];
        if(currtime>maxtime)
        {
            fleets++;
            maxtime=currtime;
        }

       }
       return fleets;
    }
}
