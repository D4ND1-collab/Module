public class StringChecker {
    public static boolean str(String s){
        s = "(){[]";
        String check1 = "(";
        String check1v2 = ")";
        String check2 = "[";
        String check2v2 = "]";
        String check3 = "{";
        String check3v2 = "}";

        if (s.indexOf(check1) != -1){
          if(  s.indexOf(check1v2) == -1){
             return false;
            }
        }

else if(s.indexOf(check2) != -1){
    if(s.indexOf(check2v2) == -1){
        System.out.println("Not accepted: ");

    }
        }
else if(s.indexOf(check3) != -1){
    if(s.indexOf(check3v2) == -1){
        return false;
    }
}
else if(s.indexOf(check1v2) != -1){
    if(s.indexOf(check1) == -1){
        return false;
    }
        }
else if(s.indexOf(check2v2) != -1){
    if(s.indexOf(check2) == 1){
    return false;
    }
        }
else if(s.indexOf(check3v2) != -1){
    if(s.indexOf(check3) == -1){
        return false;
    }
        }
else {
            return true;
        }  return false;
    }

}
