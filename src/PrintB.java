public class PrintB {
    public static void main(String[] args) {
        String[][] b = {{"*", "*", " "},
                {"*", " ", "*"},
                {"*", "*", " "},
                {"*", " ", "*"},
                {"*", "*", " "}};
        for (String[] row :b){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
