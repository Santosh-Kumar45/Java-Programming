package String;

public class StringLength {
    public static void printCharacter(String name){
        System.out.print("character reading : ");
        for(int i=0;i<name.length();i++){

            System.out.print(name.charAt(i)+" ");
        }

    }
    public static void main(String[] args) {
        //string length
        String name="santosh kumar";
        System.out.println("length of name is : "+ name.length());

        //string concatenation
        String firstname="santosh";
        String lastname="kumar";
        String fullname=firstname+" "+lastname;
        System.out.println("full name : "+fullname);

        //string charAt() method.
        printCharacter(name);


        //
    }
}
