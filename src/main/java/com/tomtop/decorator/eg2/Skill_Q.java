package com.tomtop.decorator.eg2;

//ConreteDecorator ���ܣ�Q
public class Skill_Q extends Skills {
	private String skillName;

	public Skill_Q(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	@Override
	public void learnSkills() {
		System.out.println("ѧϰ�˼���Q:" + skillName);
		super.learnSkills();
	}
}