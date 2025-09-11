class Solution {
    private static void palliparti(String str,int index,List<String> path,List<List<String>> result){
        if(index==str.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<str.length();i++){
            if(ispallindrome(str,index,i)){
                path.add(str.substring(index,i+1));
                palliparti(str,i+1,path,result);
                path.remove(path.size()-1);
            }
        }
    }
    private static boolean ispallindrome(String str,int start,int end){
        while(start<=end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> path=new ArrayList<>();
        palliparti(s,0,path,result);
        return result;
    }
}