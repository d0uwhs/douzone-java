package objectarray08.hw3.view;

import objectarray08.hw3.controller.MemberController;
import objectarray08.hw3.model.dto.Member;

import java.util.Scanner;

import static objectarray08.hw3.controller.MemberController.MEMBER_MAX_SIZE;


public class MemberMenu {
    MemberController memberController = new MemberController();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println("===== 회원 관리 메뉴 =====");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 정보 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 회원 정보 출력");
            System.out.println("6. 회원 정보 정렬");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요. : ");
            String selectedMenu = scanner.next();
            // TODO : 예외처리
            if (selectedMenu.equals("1")) {
                insertMember();
            }
            if (selectedMenu.equals("2")) {
                searchMember();
            }
            if (selectedMenu.equals("3")) {
                updateMember();
            }
            if (selectedMenu.equals("4")) {
                deleteMember();
            }
            if (selectedMenu.equals("5")) {
                printAllMember();
            }
            if (selectedMenu.equals("6")) {
                sortMember();
            }
            if (selectedMenu.equals("9")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }

    public void insertMember() {
        if (memberController.getMemberCount() >= MEMBER_MAX_SIZE) {
            System.out.println("더이상 회원가입을 할 수 없습니다.");
            return;
        }
        System.out.print("아이디를 입력하세요 : ");
        String userId = scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String userPwd = scanner.next();
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.print("성별을 입력하세요 (남/여) : ");
        char gender = scanner.next().charAt(0);
        System.out.print("이메일을 입력하세요 : ");
        String email = scanner.next();
        Member member = new Member(userId, userPwd, name, age, gender, email);
        memberController.insertMember(member);
    }

    public void searchMember() {
        while (true) {
            System.out.println("===== 회원 정보 검색 =====");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int selectMenu = scanner.nextInt();
            if (selectMenu == 1) {
                System.out.print("아이디를 입력하세요 : ");
            }
            if (selectMenu == 2) {
                System.out.print("이름을 입력하세요 : ");
            }
            if (selectMenu == 3) {
                System.out.print("이메일을 입력하세요 : ");
            }
            if (selectMenu == 9) {
                System.out.println("이전 메뉴로 돌아갑니다.");
                break;
            }
            String findByUserId = scanner.next();
            if (memberController.searchMember(selectMenu, findByUserId) == null) {
                System.out.println("검색된 결과가 없습니다.");

            }
            if (memberController.searchMember(selectMenu, findByUserId) != null) {
                Member searchMemberObject = memberController.searchMember(selectMenu, findByUserId);
                System.out.print("유저를 찾았습니다.\n아이디 : " + searchMemberObject.getUserId() + "\n" +
                        "이메일 : " + searchMemberObject.getEmail() + "\n" +
                        "이름 : " + searchMemberObject.getName() + "\n");
            }
            break;
        }
    }

    public void updateMember() {
        while (true) {
            System.out.println("===== 회원 정보 수정 =====");
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이름 수정");
            System.out.println("3. 이메일 수정");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int selectMenu = scanner.nextInt();
            if (selectMenu == 9) {
                System.out.println("이전 메뉴로 돌아갑니다.");
                break;
            }
            if (!((selectMenu == 1) || (selectMenu == 2) || (selectMenu == 3))) {
                System.out.println("메뉴를 잘못 입력했습니다.");
                continue;
            }
            System.out.print("변경하고자 할 아이디를 입력하세요 : ");
            String findByUserId = scanner.next();
            if (selectMenu == 1) {
                System.out.print("바꾸고자 하는 비밀번호 입력하세요 : ");
            }
            if (selectMenu == 2) {
                System.out.print("바꾸고자 하는 이름을 입력하세요 : ");
            }
            if (selectMenu == 3) {
                System.out.print("바꾸고자 하는 이메일을 입력하세요 : ");
            }
            String updateByUserInfo = scanner.next();
            memberController.updateMember(memberController.checkId(findByUserId), selectMenu, updateByUserInfo);
            System.out.println("회원의 정보가 변경되었습니다.");

        }

    }

    public void deleteMember() {
        System.out.print("삭제할 회원 아이디 : ");
        String findByUserId = scanner.next();
        if (memberController.checkId(findByUserId) == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다.");
        }
        if (memberController.checkId(findByUserId) != null) {
            System.out.println("정말 삭제하시겠습니까?(y/n):");
            String selectMenu = scanner.next();
            if (selectMenu.equals("n") || selectMenu.equals("N")) {
                System.out.println("삭제가 취소되었습니다.");
            }
            if (selectMenu.equals("y") || selectMenu.equals("Y")) {
                System.out.println("회원의 정보가 삭제되었습니다.");
                memberController.deleteMember(findByUserId);
            }
        }
    }

    public void printAllMember() {
        Member[] mem = memberController.getMem();
        for (Member member : mem) {
            if (member == null) {
                break;
            }
            System.out.println(member.information());
        }
    }

    public void sortMember() {
        while (true) {
            System.out.println("===== 회원 정보 정렬 =====");
            System.out.println("1. 아이디 오름차순 정렬");
            System.out.println("2. 아이디 내림차순 정렬");
            System.out.println("3. 나이 오름차순 정렬");
            System.out.println("4. 나이 내림차순 정렬");
            System.out.println("5. 성별 내림차순 정렬(남여순)");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            String selectedMenu = scanner.next();

            if (selectedMenu.equals("1")) {
                Member[] idAsc = memberController.sortIdAsc();
                for (Member member : idAsc
                ) {
                    if (member == null) {
                        break;
                    }
                    {
                        System.out.println(member.information());
                    }
                }
            }

            if (selectedMenu.equals("2")) {
                Member[] idDesc = memberController.sortIdDesc();
                for (Member member : idDesc
                ) {
                    if (member == null) {
                        break;
                    }
                    {
                        System.out.println(member.information());
                    }
                }
            }

            if (selectedMenu.equals("3")) {
                Member[] ageAsc = memberController.sortAgeAsc();
                for (Member member : ageAsc
                ) {
                    if (member == null) {
                        break;
                    }
                    {
                        System.out.println(member.information());
                    }
                }
            }

            if (selectedMenu.equals("4")) {
                Member[] ageDesc = memberController.sortAgeDesc();
                for (Member member : ageDesc
                ) {
                    if (member == null) {
                        break;
                    }
                    {
                        System.out.println(member.information());
                    }
                }
            }

            if (selectedMenu.equals("4")) {
                Member[] genderDesc = memberController.sortGenderDesc();
                for (Member member : genderDesc
                ) {
                    if (member == null) {
                        break;
                    }
                    {
                        System.out.println(member.information());
                    }
                }
            }

            if (selectedMenu.equals("9")) {
                System.out.println("이전 메뉴로 돌아갑니다.");
                break;
            }
        }
    }
}

