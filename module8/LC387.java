// 387. First Unique Character in a String
class LC387 {
     public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int i = s.indexOf(c);
            if(i!=-1 && i==s.lastIndexOf(c)){
                res = Math.min(res,i);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }   
}