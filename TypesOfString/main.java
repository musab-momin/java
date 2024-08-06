
package TypesOfString;

class Main {
    public static void main(String[] args) {
        // String s = "Hello world";
        // System.out.println(s);

        // String name = new String();
        // name = "Eliot";
        // System.out.println(name);

        // String fullName = "Eliot";
        // fullName = fullName.concat(" Alderson");
        // System.out.println(fullName);

        StringBuffer sb = new StringBuffer("Eliot");
        System.out.println(sb.capacity());
        sb.append(" Alderson"); // here we are mutating sb object it will update the string
        System.out.println(sb.capacity() + " " + sb);
    }
}