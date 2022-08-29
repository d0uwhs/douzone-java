package objectarray08.hw3.controller;

import objectarray08.hw3.model.dto.Member;

import java.util.Arrays;

public class MemberController {
    public static final int MEMBER_MAX_SIZE = 10;
    private int memberCount;

    private Member[] mem = new Member[MEMBER_MAX_SIZE];
    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    /**
     * 멤버 총원
     * @return : 멤버 숫자
     */
    public int getMemberCount() {
        return memberCount;
    }

    /**
     * 멤버 주소값
     * @return : 멤버 주소값
     */
    public Member[] getMem() {
        return mem;
    }

    /**
     * 전달 받은 아이디가 mem 배열에 존재하는 경우, 해당 아이디의 회원 정보를 반환
     * @param userId : 찾고자 하는 userId
     * @return member 객체
     */
    public Member checkId(String userId){
        Member m = null;
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)){
                m = mem[i];
            }
        }
        return m;
    }

    /**
     * 전달 받은 회원 객체를 mem 배열에 추가함.
     * @param member : 추가하고자 하는 member
     */
    public void insertMember(Member member){
        for (int i = 0; i < MEMBER_MAX_SIZE; i++) {
            if (mem[i] == null){
                mem[i] = member;
                break;
            }
        }
        System.out.println("회원가입에 성공했습니다. " + member.getUserId() + "님");
        memberCount++;
    }

    /**
     * 전달받은 menu 파라메터가 1인 경우 userId 검색, 2인 경우 이름 검색, 3인 경우 이메일 검색
     * @param menu 1: userId 2: name 3: email
     * @param search 찾고자 하는 내용
     * @return 찾고자 하는 member
     */
    public Member searchMember(int menu, String search){
        Member searchMember = null;
        if (menu == 1) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getUserId().equals(search)) {
                    searchMember = mem[i];
                }
            }
        }
        if (menu == 2) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getName().equals(search)) {
                    searchMember = mem[i];
                }
            }
        }
        if (menu == 3) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getEmail().equals(search)) {
                    searchMember = mem[i];
                }
            }
        }

        return searchMember;

    }
    /**
     * 전달받은 메뉴에 따라, 전달받은 회원 객체 member를 setter 메소드를 이용하여,
     * 메뉴가 1인 경우 비밀번호 수정, 2인 경우 이름 수정, 3인 경우, 이메일을 수정
     * @param member
     * @param menu 1. userPwd, 2. name, 3. email
     * @param update
     */
    public void updateMember(Member member, int menu, String update){
        if (menu == 1) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getUserId().equals(member.getUserId())) {
                    mem[i].setUserPwd(update);
                }
            }
        }
        if (menu == 2) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getUserId().equals(member.getUserId())) {
                    mem[i].setName(update);
                }
            }
        }
        if (menu == 3) {
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getUserId().equals(member.getUserId())) {
                    mem[i].setEmail(update);
                }
            }
        }

    }

    /**
     * userId를 검색한 후 삭제
     * 삭제 후, 객체들의 정보를 한 칸씩 앞으로 이동 시킴
     * TODO : NullPointExcption 해결
     * @param userId
     */
    public void deleteMember(String userId){
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)){
                mem[i] = null;
            }
            for (int j = 0; j < mem.length -1; j++) {
                mem[j] = mem[j+1];
            }
        memberCount--;
        }
    }

    /**
     * 기존의 회원 객체 배열을 변경하지 않고,
     * deepcopy 한 배열을 정렬 후, return.
     *
     * compareTo를 통한 문자열 비교
     * https://tworab.tistory.com/16
     *
     * comparable interface
     *
     * @return
     */
    public Member[] sortIdAsc(){
        Member[] deepcopyArray = mem.clone();
        for (int i = 0; i < deepcopyArray.length; i++) {
            if (deepcopyArray[i] == null){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (deepcopyArray[i].getUserId().compareTo(deepcopyArray[j].getUserId())<0){
                    Member member = deepcopyArray[i];
                    deepcopyArray[i] = deepcopyArray[j];
                    deepcopyArray[j] = member;
                }

            }
        }
        return deepcopyArray;
    }
    public Member[] sortIdDesc(){
        Member[] deepcopyArray = mem.clone();
        for (int i = 0; i < deepcopyArray.length; i++) {
            if (deepcopyArray[i] == null){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (deepcopyArray[i].getUserId().compareTo(deepcopyArray[j].getUserId())>0){
                    Member member = deepcopyArray[i];
                    deepcopyArray[i] = deepcopyArray[j];
                    deepcopyArray[j] = member;
                }

            }
        }
        return deepcopyArray;
    }
    public Member[] sortAgeAsc(){
        Member[] deepcopyArray = mem.clone();
        for (int i = 0; i < deepcopyArray.length; i++) {
            if (deepcopyArray[i] == null){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (deepcopyArray[i].getAge() < deepcopyArray[j].getAge()) {
                    Member member = deepcopyArray[i];
                    deepcopyArray[i] = deepcopyArray[j];
                    deepcopyArray[j] = member;
                }
            }
        }
        return deepcopyArray;
    }
    public Member[] sortAgeDesc(){
        Member[] deepcopyArray = mem.clone();
        for (int i = 0; i < deepcopyArray.length; i++) {
            if (deepcopyArray[i] == null){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (deepcopyArray[i].getAge() > deepcopyArray[j].getAge()) {
                    Member member = deepcopyArray[i];
                    deepcopyArray[i] = deepcopyArray[j];
                    deepcopyArray[j] = member;
                }
            }
        }
        return deepcopyArray;
    }
    public Member[] sortGenderDesc(){
        Member[] deepcopyArray = mem.clone();
        for (int i = 0; i < deepcopyArray.length; i++) {
            if (deepcopyArray[i] == null){
                break;
            }
            for (int j = 0; j < i; j++) {
                if (deepcopyArray[i].getGender() > deepcopyArray[j].getGender()) {
                    Member member = deepcopyArray[i];
                    deepcopyArray[i] = deepcopyArray[j];
                    deepcopyArray[j] = member;
                }
            }
        }
        return deepcopyArray;
    }
}
