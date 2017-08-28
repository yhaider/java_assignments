public class Manipulator{

    public String trimAndConcat(String s1, String s2){
        String result = s1.trim() + s2.trim();
        return result;
    }

    public Integer getIndexOrNull(String s, char c){
        if (s.indexOf(c) >= 0){
            return s.indexOf(c);
        }
        else {
            return null;
        }
    }

    public Integer getIndexOrNull(String s, String ss){
        if (s.indexOf(ss) >= 0){
            return s.indexOf(ss);
        }
        else{
            return null;
        }
    }

    public String concatSubstring(String s1, int a, int b, String s2){
        return s1.substring(a, b).concat(s2);
    }
}
