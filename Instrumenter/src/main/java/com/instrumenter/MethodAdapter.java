package com.instrumenter;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

class MethodAdapter extends MethodVisitor implements Opcodes {

	public MethodAdapter(final MethodVisitor mv) {
		super(ASM5, mv);
	}

	@Override
	public void visitMethodInsn(int opcode, String owner, String name,
			String desc, boolean itf) {

//		System.err.println(opcode + "::" + owner + "::" + name + "::" + desc + "::" + itf); 

//		mv.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
//		mv.visitLdcInsn("CALL " + name);
//		mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

//		System.out.println("visinting: " + name);
		if (name.equals("suspend")) {
			mv.visitInsn(Opcodes.RETURN);
//			Label l1 = new Label();
//			mv.visitLabel(l1);
//			mv.visitMethodInsn(INVOKESTATIC, "com/instrumenter/Test", "yes", "()Z", false);
//			Label l2 = new Label();
//			mv.visitJumpInsn(IFEQ,  l2);
//			Label l3 = new Label();
//			mv.visitLabel(l3);
//			mv.visitInsn(RETURN);
		} else if (name.equals("resume")) {
//			mv.visitInsn(Opcodes.NOP);
			mv.visitMethodInsn(opcode, owner, name, desc, itf);
		} else {
			mv.visitMethodInsn(opcode, owner, name, desc, itf);
		}

//		 System.err.println("RETURN" + name); 
//		mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
//		mv.visitLdcInsn("RETURN " + name);
//		mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
	}
}
