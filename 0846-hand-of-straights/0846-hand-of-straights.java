class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int N=hand.length;
        if(N % groupSize!=0)return false;
        //using treeMap
        TreeMap<Integer,Integer> card=new TreeMap<>();
        for(int n:hand){
            card.put(n,card.getOrDefault(n,0)+1);
        }
        while(!card.isEmpty()){
            int curr=card.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!card.containsKey(curr)){
                    return false;
                }
                int cnt=card.get(curr);
                if(cnt==1){
                    card.remove(curr);
                }
                else{
                    card.put(curr,cnt-1);
                }
                curr+=1;
            }
        }
        return true;

        // HashMap<Integer,Integer> map=new HashMap<>();
        // PriorityQueue<Integer> heap=new PriorityQueue<>();
        // for(int i=0;i<N;i++){
        //     map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        // }
        // for(int key:map.keySet()){
        //     heap.offer(key);
        // }
        // Stack<Integer> st=new Stack<>();
        // while(!heap.isEmpty()){
        //     List<Integer> arr=new ArrayList<>();
        //     for(int i=0;i<groupSize;i++){
        //         if(heap.isEmpty()) return false;
        //         int val=heap.poll();
        //         map.put(val,map.get(val)-1);
        //         if(arr.size()==0 || arr.get(arr.size()-1)==val-1){
        //             arr.add(val);
        //             st.push(val);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     while(!st.isEmpty()){
        //         if(map.get(st.peek())>0){
        //             heap.add(st.pop());
        //         }
        //         else{
        //             st.pop();
        //         }
        //     }
        // }
        // return true;
    }
}