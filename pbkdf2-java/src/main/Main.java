import org.apache.commons.codec.binary.Hex;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * This is the Main class.
 */
public class Main {


    public static void main(String[] args) throws UnsupportedEncodingException {

        String password = "pbkdf2passwordtest";
        String salt = "1294985400";
        int iterations = 10000;
        int keyLength = 512;
        char[] passwordChars = password.toCharArray();
        byte[] saltBytes = salt.getBytes();

        byte[] hashedBytes = hashPassword(passwordChars, saltBytes, iterations, keyLength);
        String hashedString = Hex.encodeHexString(hashedBytes);

        System.out.println(hashedString);
    }

    public static byte[] hashPassword( final char[] password, final byte[] salt, final int iterations, final int keyLength ) {

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA512" );
            PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
            SecretKey key = skf.generateSecret( spec );
            byte[] res = key.getEncoded( );
            return res;
        } catch ( NoSuchAlgorithmException | InvalidKeySpecException e ) {
            throw new RuntimeException( e );
        }
    }
}