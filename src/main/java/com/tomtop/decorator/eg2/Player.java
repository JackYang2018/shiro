package com.tomtop.decorator.eg2;

//�ͻ��ˣ��ٻ�ʦ
public class Player {
	
	public static void main(String[] args) {
		// ѡ��Ӣ��
		Hero hero = new BlindMonk("����");

		Skills skills = new Skills(hero);
		Skills r = new Skill_R(skills, "������β");
		Skills e = new Skill_E(r, "������/�ݽ�Ϲ�");
		Skills w = new Skill_W(e, "������/������");
		Skills q = new Skill_Q(w, "������/������");
		// ѧϰ����
		q.learnSkills();
	}
	
}