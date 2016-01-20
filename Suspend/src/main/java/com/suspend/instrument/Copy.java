package com.suspend.instrument;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class Copy {
    public static void main(final String args[]) throws Exception {
		String path = "/Users/cabel/Documents/unlv-thesis/bytecode-rewrite/Suspend/target/classes/com/suspend/test/";
        FileInputStream is = new FileInputStream(path + args[0]);

        ClassReader cr = new ClassReader(is);
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cr.accept(cw, 0);

        FileOutputStream fos = new FileOutputStream(path + args[1]);
        fos.write(cw.toByteArray());
        fos.close();
    }
}
