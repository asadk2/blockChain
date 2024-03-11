public class Main {
    public static void main(String[] args) {
        Block firstBlock = new Block("Hello World", "0");
        Block secondBlock = new Block("Yo World", firstBlock.hash);
        Block thirdBlock = new Block("new World", firstBlock.hash);

        System.out.println("1st Block,"+firstBlock.hash);
        System.out.println("2nd Block,"+secondBlock.hash);
        System.out.println("3rd Block,"+thirdBlock.hash);

    }
}
