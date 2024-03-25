package it.gmarseglia.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int mod = 101;

        System.out.format("Mod: %d\n", mod);

        ModularEncrypter me = new ModularEncrypter(mod);

        int plain = 7;
        int key = 1234;

        System.out.format("Plain: %d; key: %d\n", plain, key);

        int cipher = me.Encrypt(plain, key);

        System.out.format("Cipher: %d\n", cipher);

        int decipher = me.Decrypt(cipher, key);

        System.out.format("Decipher: %d\n", decipher);
    }
}
