package it.gmarseglia.app;

public class ModularEncrypter {

    int mod;

    public ModularEncrypter(int mod){
        this.mod = mod;
    }

    public int Encrypt(int plain, int key) {
        if (plain >= this.mod) {
            throw new RuntimeException("plain has to be lower than mod");
        } else if (plain < 0) {
            throw new RuntimeException("plain has to be greater or equal than 0");
        }
        return (plain + key) % this.mod;
    }

    public int Decrypt (int cipher, int key) {
        return (((cipher - key) % this.mod) + this.mod) % this.mod;
    }

}
