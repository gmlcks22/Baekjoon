#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main(void) {
	while (true) {
		// 세 변의 길이 받기
		int sides[3];
		for (int i = 0; i < 3; i++) {
			scanf("%d", &sides[i]);
		}

		// 종료 조건 확인
		if (sides[0] == 0) return 0;

		// 삼각형 조건 탐색 ~
		int max = sides[0];
		int max_order = 0;	

		// 가장 길이가 긴 변 구하기
		for (int i = 0; i < 3; i++) {
			if (sides[i] > max) {
				max = sides[i];
				max_order = i;
			}
		}
		
		// 가장 길이가 긴 변 이외의 나머지 두 변 구하기
		int remaining_sides[2];	// 나머지 두 변의 길이
		int j = 0;	// 삼각형의 n번 변
		for (int i = 0; i < 3; i++) {
			if (i != max_order) {
				remaining_sides[j] = sides[i];
				j++;
			}
		}

		// 삼각형 조건 만족 여부 확인
		if (max >= remaining_sides[0] + remaining_sides[1]) {
			printf("Invalid\n");
		}
		// 정삼각형 조건 만족 여부 확인
		else if (sides[0] == sides[1] && sides[1] == sides[2]) {
			printf("Equilateral\n");
		}
		// 이등변 삼각형 조건 만족 여부 확인
		else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
			printf("Isosceles\n");
		}
		// 나머지
		else {
			printf("Scalene\n");
		}
	}
}