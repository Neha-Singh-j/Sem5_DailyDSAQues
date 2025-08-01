// Last updated: 8/1/2025, 10:41:03 PM
class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb=new StringBuilder();
       String[] s=path.split("/");
       ArrayList<String> arr=new ArrayList<>();
        for(String curr: s){
            if(curr.equals("") || curr.equals(".") ){
                continue;
            } else if (curr.equals("..")) {
                if (!arr.isEmpty()) {
                    arr.remove(arr.size() - 1); // go back one dir
                }
            }else{
                arr.add(curr);
            }
        }
       for(String str : arr){
        sb.append("/").append(str);
       }
       if(sb.length()==0){
        return "/";
       }else{
        return sb.toString();
       }
    }
}