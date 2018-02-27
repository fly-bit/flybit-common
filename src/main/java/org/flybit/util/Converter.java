package org.flybit.util;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class Converter {

    public static String uuidFromBytes(byte[] bytes) {
        final UUID uuid = UUID.nameUUIDFromBytes(bytes);
        return uuid.toString();
    }

    public static String toHexString(byte[] bytes) {
        return DatatypeConverter.printHexBinary(bytes);
    }

    public static byte[] parseHexString(String hex) {
        return DatatypeConverter.parseHexBinary(hex);
    }

    public static byte[] toBytes(String s) {
        try {
            return s.getBytes("UTF-8");
        } catch (final UnsupportedEncodingException e) {
            throw new RuntimeException(e.toString(), e);
        }
    }
}
