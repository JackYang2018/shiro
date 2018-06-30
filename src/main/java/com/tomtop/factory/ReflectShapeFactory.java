package com.tomtop.factory;

public class ReflectShapeFactory {
	
	@SuppressWarnings("unchecked")
	public static <T> T getClass(Class<? extends T> clazz) {
		T object = null;
		try {
			object = (T) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}

}
