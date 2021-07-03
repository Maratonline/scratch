import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Ксюша хрюша ?");
        JButton button = new JButton("Я не хрюша");
        final int[] count = {0};

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            count[0]++;
                try {
                    Clip clip = AudioSystem.getClip();
                    File file = null;
                    if (count[0] %2 != 0) {
                        file = new File("porosyachiy-vizg.wav");
                        System.out.println("Уиии уиии уиииии!!!");
                    } else{
                        file = new File("zvuk-hryukanya-svinki.wav");
                        System.out.println("Ей !!! Я не хрюша !!");
                    }
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception ee) {
                    System.err.println(ee.getMessage());
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("~~~~ ~~~~~~ ~~~~~ ~~~~~ ~~~~");
            }
        });
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);

//        BigInteger bigInteger = new BigInteger("354224848179262000000");
      //  BigInteger bigInteger = new BigInteger("3542248");
//        while (!bigInteger.equals(new BigInteger("0"))){
//            bigInteger = bigInteger.subtract(new BigInteger("1"));
//        }
        Date finish = new Date();
        System.out.println("finish at " + finish);


    }


}

