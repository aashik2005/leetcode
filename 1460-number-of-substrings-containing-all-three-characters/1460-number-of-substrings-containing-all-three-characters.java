class Solution {
    private static boolean check(HashMap<Character,Integer> map,char ch){
        map.put(ch,map.get(ch)-1);
        if(map.get(ch)==0){
            map.remove(ch);
            return false;
        }
        return true;
    }
    public int numberOfSubstrings(String s) {
        int left=0;
        int len=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        boolean a=false;
        boolean b=false;
        boolean c=false;
        int count=0;
        for(int right=0;right<len;right++){
            if(s.charAt(right)=='a'){
                a=true;
                map.put('a',map.getOrDefault('a',0)+1);
            }
            else if(s.charAt(right)=='b'){
                b=true;
                map.put('b',map.getOrDefault('b',0)+1);
            }
            else if(s.charAt(right)=='c'){
                c=true;
                map.put('c',map.getOrDefault('c',0)+1);
            }
            while(a && b && c){
                count+=(len-right);
                if(s.charAt(left)=='a'){
                    a=check(map,'a');
                }
                else if(s.charAt(left)=='b'){
                    b=check(map,'b');
                }
                else if(s.charAt(left)=='c'){
                    c=check(map,'c');
                }
                left++;
            }
        }
        return count;
    }
}