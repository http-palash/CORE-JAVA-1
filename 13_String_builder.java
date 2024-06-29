// String code is time taking
// String builder class is optimised way to use modify type operation
// String builder object directly stack point to heap where modifying at same heap place rather then manipulating heap space of string

class str{
    public static void main(String[] args){
        // String str = "h";
        // str + "" =>
        // str + "" =>
        // str + "" =>
        // str + "" =>
        // str + "" =>

        StringBuilder sb = new StringBuilder("Palash");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));
        
        // set char at index 0
        sb.setCharAt(0,'k');
        System.out.println(sb);

        // insert at index 0
        sb.insert(0,'S');
        System.out.println(sb);

        // insert a char at index 2 
        sb.insert(2,'n');
        System.out.println(sb);

        // delete the extra char

        // sb.delete(start index,end index);
        sb.delete(0,3);
        System.out.println("Afterr deletion: ");
        System.out.println(sb);
        sb.insert(0,'P');
        System.out.println("After insertion again:");
        System.out.println(sb);

        // To append at end
        sb.append(" ");
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println("Length of string sb is : "+sb.length());

        //To reverse a string note that string is immutable
        StringBuilder s = new StringBuilder("hello");

        for(int i=0;i<s.length()/2;i++){
            int front = i;
            int back = s.length()-1-i;

            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            s.setCharAt(front,backChar);
            s.setCharAt(back,frontChar);
        }
        System.out.println(s);
    }
}