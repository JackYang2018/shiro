package com.tomtop.decorator.eg2;

//ConcreteComponent ����Ӣ��äɮ
public class BlindMonk implements Hero {
	private String name;

	public BlindMonk(String name) {
		this.name = name;
	}

	@Override
	public void learnSkills() {
		System.out.println(name + "ѧϰ�����ϼ��ܣ�");
	}
}