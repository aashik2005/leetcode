class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int num=1;num<=n;num++){
            if(num%3==0 && num%5==0){
                ans.add("FizzBuzz");
            }
            else if(num%3==0){
                ans.add("Fizz");
            }
            else if(num%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(num));
            }
        }
        return ans;
    }
}