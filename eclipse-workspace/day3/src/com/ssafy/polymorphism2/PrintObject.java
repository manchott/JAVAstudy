package com.ssafy.polymorphism2;

class UserInfo {
	String name = "ȫ�浿";
	
	@Override
	public String toString() {
		return "�̸�: " + this.name;
	}
}

class MemberInfo extends UserInfo{
	String grade = "��ȸ��";
	
	@Override
	public String toString() {
		return super.toString() + ", ���: " + grade;
	}
}

public class PrintObject {
	public static void main(String[] args) {
		Object member = new MemberInfo();
		System.out.println("��ü ����: " + member);
	}

}
