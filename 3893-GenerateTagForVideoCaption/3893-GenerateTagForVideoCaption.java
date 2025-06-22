// Last updated: 6/22/2025, 11:02:27 AM
class Solution {
    public String generateTag(String caption) {
        if(caption==null || caption.trim().isEmpty()){
            return "#";
        }
        String[] c=caption.trim().split("\\s+");
        StringBuilder tag=new StringBuilder("#");
        for(int i=0;i<c.length;i++){
            String wrd=c[i].replaceAll("a-zA-Z"," ");
            if (wrd.isEmpty()){
                continue;
            }
            if(i==0){
                tag.append(wrd.toLowerCase());
            }
            else{
                tag.append(Character.toUpperCase(wrd.charAt(0)));
                tag.append(wrd.substring(1).toLowerCase());
            }
        }
        // Cleaning in StringBuilder
        StringBuilder clean=new StringBuilder("#");
        for(int i=0;i<tag.length();i++){
            char ch=tag.charAt(i);
            if(Character.isLetter(ch)){
                clean.append(ch);
            }
        }
        if(clean.length()>100){
            return clean.substring(0,100);
        }
        return clean.toString();
    }
}