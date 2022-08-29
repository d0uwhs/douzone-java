package com.uni.stream.intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Filtering {
	
	/*
	 * 필터링
	 *   - 필터링은 중간 처리(중간연산) 기능으로 요소를 걸러내는 역활을 한다.조건에 맞는 요소를 추출(filter())
	 *     - distinct() : 중복을 제거하는 메소드,  Stream의 경우는 기본형타입은 value 로 비교 , 객체의 경우는 Object.equals()가 true를 리턴하면 동일한 객체로 판단한다.
	 *     - filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
	 *     
	 */
	
	// 중복제거
	public void method1() {
		List<String> names = Arrays.asList("유재석", "이효리", "이재욱", "유재석", "이재욱");

		Stream<String> stream = names.stream();
		
		stream.forEach(str -> System.out.println(str));
		
// 		이미 최종 처리 메소드까지 호출 된 스트림은 다시 사용할 수 없다. (컬렉션(배열)로 부터 다시 스트림을 얻어와야한다.)
//		stream.distinct().forEach(str -> System.out.println(str)); 
		
		System.out.println();
		
		names.stream().distinct().forEach(str -> System.out.println(str));
	
		System.out.println();
	}
	
	// 필터링
	public void method2() {
		List<String> names = Arrays.asList("유재석", "이효리", "이재욱", "유재석", "이재욱", "로운", "이효리");
		
		names.stream().filter(name -> name.startsWith("이")).forEach(name -> System.out.println(name));
		
		System.out.println();
	
		names.stream()
				 .distinct()
				 .filter(name -> name.startsWith("이"))
				 .forEach(name -> System.out.println(name));
		
		System.out.println();
	}
}
