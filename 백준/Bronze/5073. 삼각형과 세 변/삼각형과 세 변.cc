#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

// 삼각형의 세 변을 오름차순 정렬
void sort_sides(int arr[], int size) {
	for (int i = 0; i < size - 1; i++) {
		for (int j = 0; j < size - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}


int main(void) {
	while (true) {
		// 세 변의 길이 받기
		int sides[3];
		for (int i = 0; i < 3; i++) {
			scanf("%d", &sides[i]);
		}

		// 종료 조건 확인
		if (sides[0] == 0) break;

		sort_sides(sides, 3);	// 변의 길이 정렬

		// 삼각형 조건 만족 여부 확인
		if (sides[2] >= sides[0] + sides[1]) {
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

	return 0;
}