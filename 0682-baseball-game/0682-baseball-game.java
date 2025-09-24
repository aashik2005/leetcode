class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(String str:operations){
            if(str.equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(str.equals("D")){
                int val=arr.get(arr.size()-1);
                arr.add(val*2);
            }
            else if(str.equals("+")){
                int a=arr.get(arr.size()-1);
                int b=arr.get(arr.size()-2);
                arr.add(a+b);
            }
            else{
                int n=Integer.parseInt(str);
                arr.add(n);
            }
        }
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
}