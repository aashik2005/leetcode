class Twitter {
    HashMap<Integer,HashSet<Integer>> follower;
    HashMap<Integer,List<int[]>> tweet;
    int cnt;
    public Twitter() {
        cnt=0;
        follower=new HashMap<>();
        tweet=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!tweet.containsKey(userId)){
            tweet.put(userId,new ArrayList<>());
        }
        tweet.get(userId).add(new int[]{cnt,tweetId});
        cnt++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res=new ArrayList<>();
        PriorityQueue<int[]> recent=new PriorityQueue<>((a,b)->(b[0]-a[0]));
        if(tweet.containsKey(userId)) {
            for(int[] post : tweet.get(userId)) {
                recent.add(post);
            }
        }
        if(follower.containsKey(userId)) {
            for(int user : follower.get(userId)) {
                if(tweet.containsKey(user)) {
                    for(int[] post : tweet.get(user)) {
                        recent.add(post);
                    }
                }
            }
        }
        int i=0;
        while(!recent.isEmpty() && i<10){
            res.add(recent.poll()[1]);
            i++;
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!follower.containsKey(followerId)){
            follower.put(followerId,new HashSet<>());
        }
        follower.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(follower.containsKey(followerId)){
            follower.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */