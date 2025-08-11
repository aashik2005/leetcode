class Solution {
    private static boolean check(int hash[],int ind){
        hash[ind]-=1;
        if(hash[ind]==0){
            return false;
        }
        return true;
        // map.put(ch,map.get(ch)-1);
        // if(map.get(ch)==0){
        //     map.remove(ch);
        //     return false;
        // }
        // return true;
    }
    public int numberOfSubstrings(String s) {
        int left=0;
        int len=s.length();
        //HashMap<Character,Integer> map=new HashMap<>();
        int[] hash=new int[3];
        boolean a=false;
        boolean b=false;
        boolean c=false;
        int count=0;
        for(int right=0;right<len;right++){
            if(s.charAt(right)=='a'){
                a=true;
                hash[0]+=1;
                //map.put('a',map.getOrDefault('a',0)+1);
            }
            else if(s.charAt(right)=='b'){
                b=true;
                hash[1]+=1;
                //map.put('b',map.getOrDefault('b',0)+1);
            }
            else if(s.charAt(right)=='c'){
                c=true;
                hash[2]+=1;
                //map.put('c',map.getOrDefault('c',0)+1);
            }
            while(a && b && c){
                count+=(len-right);
                if(s.charAt(left)=='a'){
                    //a=check(map,'a');
                    a=check(hash,0);
                }
                else if(s.charAt(left)=='b'){
                    b=check(hash,1);
                }
                else if(s.charAt(left)=='c'){
                    c=check(hash,2);
                }
                left++;
            }
        }
        return count;
    }
}