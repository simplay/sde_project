package sde_project.sde_project;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

public class App {
	public static void main(String[] args) {
		ClassPool pool = ClassPool.getDefault();
		try {
			CtClass cc = pool.get("com.kenai.jffi.Array");
			// TODO Do some meaningful - just for testing purposes.
			cc.writeFile("generated_binary_files");
		} catch (CannotCompileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
