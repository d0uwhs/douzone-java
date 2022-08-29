package io13.figone.dao;

import java.io.*;
import java.util.Scanner;

/**
 * 파일 크기가 100K가 넘을 경우, FileWriter 단독사용 보다는
 * BufferedWriter와 혼합하여 사용하는 것이 좋다.
 */

public class FileDao {
    Scanner scanner = new Scanner(System.in);
    static String getSaveFilePath = FileDao.class.getResource("").getPath();

    public FileDao() {
    }

    public void fileSave() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("파일에 저장할 내용을 반복해서 입력하시오 (Exit를 입력하면 내용 입력 끝 ): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("저장하시겠습니까?(y/n)");
                String choose = scanner.nextLine();
                if (choose.equals("Y") || choose.equals("y")) {
                    System.out.println("저장할 파일명을 입력하시오 : ");
                    String fileName = scanner.nextLine();
                    File path = new File(getSaveFilePath + fileName + ".txt");
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
                        bufferedWriter.write(stringBuilder.toString());
                        bufferedWriter.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
                    break;
                }
                if (choose.equals("N") || choose.equals("b")){
                    break;
                }
            }
            stringBuilder.append(input + "\n");
        }
    }

    public void fileOpen() {
        System.out.print("열기 할 파일명 : ");
        String fileName = scanner.nextLine();
        String thisLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getSaveFilePath + fileName + ".txt"))) {
            while ((thisLine = bufferedReader.readLine()) != null) {
                System.out.println(thisLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + ".txt는 없는 파일입니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileEdit() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("수정 할 파일명 : ");
        String fileName = scanner.nextLine();
        String thisLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getSaveFilePath + fileName + ".txt"))) {
            while ((thisLine = bufferedReader.readLine()) != null) {
                System.out.println(thisLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + ".txt는 없는 파일입니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일에 추가할 내용을 입력하시오 (Exit를 입력하면 내용 입력 끝 ) : ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("변경된 내용을 파일에 추가하시겠습니까?(y/n)");
                String choose = scanner.nextLine();
                if (choose.equals("Y") || choose.equals("y")) {
                    File path = new File(getSaveFilePath + fileName + ".txt");
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
                        bufferedWriter.write(stringBuilder.toString());
                        bufferedWriter.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
                    break;
                }
                if (choose.equals("N") || choose.equals("b")){
                    break;
                }
            }
            stringBuilder.append(input + "\n");

        }
    }
}
