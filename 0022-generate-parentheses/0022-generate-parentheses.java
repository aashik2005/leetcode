class Solution {
    private static void generate(int open,int close,String str,ArrayList<String> ans){
        if(open==0 && close==0){
            ans.add(str);
            return;
        }
        if(open>0){
            generate(open-1,close,str+'(',ans);
        }
        if(close>open){
            generate(open,close-1,str+')',ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        String str="";
        generate(open,close,str,ans);
        return ans;
    }
}