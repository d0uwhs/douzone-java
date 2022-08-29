package object07.level01.basic.member;

import object07.level01.basic.member.model.dto.MemberDto;

public class Application {
    public static void main(String[] args) {
        MemberDto memberOne = new MemberDto();
        System.out.println(memberOne.getId());
        System.out.println(memberOne.getPwd());
        System.out.println(memberOne.getName());
        System.out.println(memberOne.getName());
        System.out.println(memberOne.getAge());
        System.out.println(memberOne.getGender());
        System.out.println(memberOne.getPhone());
        System.out.println(memberOne.getGender());
        memberOne.setId("d0uwhs");
        memberOne.setPwd("minjun");
        memberOne.setName("김민준");
        memberOne.setAge(27);
        memberOne.setGender('남');
        memberOne.setPhone("01012345678");
        memberOne.setEmail("d0uwhs@gmail.com");
        System.out.println("변경 후 : " + memberOne.getId());
        System.out.println("변경 후 : " + memberOne.getPwd());
        System.out.println("변경 후 : " + memberOne.getName());
        System.out.println("변경 후 : " + memberOne.getName());
        System.out.println("변경 후 : " + memberOne.getAge());
        System.out.println("변경 후 : " + memberOne.getGender());
        System.out.println("변경 후 : " + memberOne.getPhone());
        System.out.println("변경 후 : " + memberOne.getGender());
    }
}
