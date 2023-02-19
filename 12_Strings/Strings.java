public class Strings{
    public static void main(String[] args){
        String first_name = "Juan";
        String second_name = "Pinon";
        String last_name = "Lopez";

        first_name += " " + second_name;
        first_name += " " + last_name;

        int size = first_name.length();
        int c_letters = 0, c_digits = 0, c_spaces = 0;

        String upper_name = first_name.toUpperCase();

        System.out.println("The size of first_name is: " + size);

        System.out.println("lower first_name: " + first_name);

        System.out.println("Upper first_name is: " + upper_name);
        
        if(first_name.equals(upper_name)){

            System.out.println("first_name and upper_name are recognized as equals");
        }else{

            System.out.println("first_name and upper_name are not recognized as equals");
        }

        String direction = "Madrid 8090-40";

        first_name += direction;

        System.out.println("final name is: " + first_name);

        for(char c: first_name.toCharArray()){

            if(Character.isLetter(c)){

                c_letters++;
            }else if(Character.isDigit(c)){

                c_digits++;
            }else if(Character.isWhitespace(c)){

                c_spaces++;
            }
        }

        System.out.println(first_name + " contains: " + c_letters + " letters, " + c_digits + " digits and " + c_spaces + " white spaces");
    }
}
