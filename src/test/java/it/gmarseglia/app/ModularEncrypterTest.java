package it.gmarseglia.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ModularEncrypterTest {

    @Test
    public void DecryptionTest() {
        int mod = 101;
        int plain = 14;
        int key = 1234;

        ModularEncrypter me = new ModularEncrypter(mod);

        int cipher = me.Encrypt(plain, key);

        int decipher = me.Decrypt(cipher, key);

        assertEquals(plain, decipher);
    }
}
