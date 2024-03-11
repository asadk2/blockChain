import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    final private String data;
    final private long timeStamp;
    private int nonce;

    public Block(String data, String previousHash){
        this.data=data;
        this.previousHash=previousHash;
        this.timeStamp=new Date().getTime();
        this.hash= getHash();
    }

    public String getHash(){
        return StringUtil.applyHash(previousHash+ timeStamp + nonce + data);
    }
    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = getHash();
        }
        System.out.println("Block Mined: " + hash);
    }
}
