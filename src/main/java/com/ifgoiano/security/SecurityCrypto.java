/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifgoiano.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Raphael Policena
 */
public class SecurityCrypto {

    public static String encrypt(String password) {
        MessageDigest algorithm = null;
        byte messageDigest[] = null;
        StringBuilder hexString = null;
        String senha = null;
        try {
            algorithm = MessageDigest.getInstance("SHA-256");
            messageDigest = algorithm.digest(password.getBytes("UTF-8"));

            hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SecurityCrypto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SecurityCrypto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return senha;
    }

    public static String generatePassword() {
        Random random = new SecureRandom();
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            stringBuilder.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return new String(stringBuilder);
    }
}
