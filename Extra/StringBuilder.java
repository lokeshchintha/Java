class Testing{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("lokesh");
        System.out.println(sb.charAt(0)); // l
        sb.deleteCharAt(0); 
        System.out.println(sb.toString()); // okesh
        sb.deleteCharAt(2);
        System.out.println(sb.toString()); //oksh
        sb.append("chintha");
        System.out.println(sb.toString()); //okshchintha
        sb.replace(0, 4, "lokesh ");
        System.out.println(sb.toString()); // lokesh chintha
        System.out.println(sb.capacity()); // 22
        sb.insert(0, "kameswara ");
        System.out.println(sb.capacity()); //46
        System.out.println(sb.toString()); // kameswara lokesh chintha
        sb.delete(0, 10);
        System.out.println(sb.toString()); // lokesh chintha
        System.out.println(sb.toString().equals("lokeshchintha")); // false
        System.out.println(sb.capacity()); // 46
    }
}
