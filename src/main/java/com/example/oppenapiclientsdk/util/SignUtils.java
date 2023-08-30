package com.example.oppenapiclientsdk.util;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * @author wang
 * @create 2023-2023-29-23:00
 */
public class SignUtils {
    /**
     * 生成签名 * @param hashMap 包含需要签名的参数的哈希映射 * @param secretKey 密钥 * @return 生成的签名字符串
     */
    private static final String ENCRYPTION_KEY = "encryptionKey";
    private static final Digester sha256 = new Digester(DigestAlgorithm.SHA256);
    public static String generateKey(String key){
        return sha256.digestHex((ENCRYPTION_KEY + key));
    }

    public static String generateSign(String body,String sign) {
        return sha256.digestHex(body + ":" + sign);
    }
}
