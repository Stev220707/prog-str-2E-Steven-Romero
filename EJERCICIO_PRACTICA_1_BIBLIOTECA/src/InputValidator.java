public class InputValidator {

    public static boolean esValido(String code_user){

        if(code_user == null){
            return false;
        }

        if (code_user.trim().isEmpty()){
            return false;
        }

        if (code_user.length() != 6){
            return false;
        }

        for (int i = 0; i < code_user.length(); i++){
            char c = code_user.charAt(i);

            if (!Character.isLetterOrDigit(c)){
                return false:
            }
        }

        return true;
    }

}
