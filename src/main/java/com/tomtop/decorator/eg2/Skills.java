package com.tomtop.decorator.eg2;

//Decorator ������
public class Skills implements Hero {
	// ����һ��Ӣ�۶���ӿ�
	private Hero hero;

	public Skills(Hero hero) {
		this.hero = hero;
	}

	@Override
	public void learnSkills() {
		if (hero != null) hero.learnSkills();
	}
}