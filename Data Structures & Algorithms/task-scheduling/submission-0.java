
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        }

        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : frequencies) {
            if (freq > 0) {
                maxHeap.add(freq);
            }
        }

        int totalTime = 0;

        
        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycleSize = n + 1;
            int tasksProcessed = 0;

            for (int i = 0; i < cycleSize; i++) {
                if (!maxHeap.isEmpty()) {
                    
                    int currentFreq = maxHeap.poll();
                    if (currentFreq > 1) {
                        temp.add(currentFreq - 1); 
                    }
                    tasksProcessed++;
                }
            }

            
            for (int remainingFreq : temp) {
                maxHeap.add(remainingFreq);
            }

  
            totalTime += maxHeap.isEmpty() ? tasksProcessed : cycleSize;
        }

        return totalTime;
    }
}
