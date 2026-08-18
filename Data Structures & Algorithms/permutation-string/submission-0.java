class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2)
        {
            return false;

        }
        int[]count1= new int[26];
        int[]count2=new int[26];
        for(int i=0;i<n1;i++)
        {
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<n2-n1;i++)
        {
            if(Arrays.equals(count1,count2))
            {
                return true;
            }
            count2[s2.charAt(i)-'a']--;
            count2[s2.charAt(i+n1)-'a']++;
        }

        return Arrays.equals(count1,count2);
    }
}
