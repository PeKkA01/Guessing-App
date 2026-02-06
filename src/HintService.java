public class HintService {
    public static String generation(int target, int hintcount){
        if(hintcount == 1){
            if(target % 2 == 0)
                return "Hint: Number is EVEN ";
            else
                return "Hint: Number is ODD";
        }
        else if (hintcount == 2) {
            if(target < 50)
                return "Hint: Number is Less than 50";
                else
                    return "Hint: Number is Greater than 50";

            } else if (hintcount == 3) {
                if(target <= 25)
                    return "Hint: Number is between 1-25";

                else if (target <= 50)
                    return "Hint: Number is between 26-50";

                    else if (target <= 75)
                        return "Hint: Number is between 51-75";

                    else
                        return "Hint: Number is between 76-100 ";
                }
            return "No more Hints Available ";

            }


        }
