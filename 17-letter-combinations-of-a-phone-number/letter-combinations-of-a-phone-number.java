class Solution {
    private static void findcombo(HashMap<Character,String> map,String digits,int len,List<String> ans,int ind,String str){
        if(str.length()==len){
            ans.add(str);
            return;
        }
        for(int i=0;i<map.get(digits.charAt(ind)).length();i++){
            String ch=map.get(digits.charAt(ind));
            findcombo(map,digits,len,ans,ind+1,str+ch.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int len=digits.length();
        List<String> ans=new ArrayList<>();
        String str="";
        if(digits.equals("")){
            return ans;
        }
        findcombo(map,digits,len,ans,0,str);
        return ans;
    }
}