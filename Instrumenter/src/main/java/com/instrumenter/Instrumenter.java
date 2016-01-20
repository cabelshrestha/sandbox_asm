package com.instrumenter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public class Instrumenter {
	public static void main(final String args[]) throws Exception {
		System.out.println("Starting instrumentation....");
		String path = "/Users/cabel/Documents/unlv-thesis/bytecode-rewrite/Instrumenter/target/classes/com/instrumenter/";
		FileInputStream is = new FileInputStream(path + args[0]);
		byte[] b;

		ClassReader cr = new ClassReader(is);
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
		ClassVisitor cv = new ClassAdapter(cw);
		cr.accept(cv, 0);
		b = cw.toByteArray();

		FileOutputStream fos = new FileOutputStream(path + args[1]);
		fos.write(b);
		fos.close();
		System.out.println("Done!");
	}

}
