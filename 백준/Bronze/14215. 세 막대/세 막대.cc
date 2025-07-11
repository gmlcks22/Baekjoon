#include <stdio.h>

void sort_sides(int arr[], int size) {
	for (int i = 0; i < size - 1; i++) {	// j+1까지 탐색하므로 size - 1 까지만 반복
		for (int j = 0; j < size - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {	// 다음 수보다 크면
				// 큰 수가 뒤로 가도록 위치 교환
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}

int main() {
	int sides[3];

	// 막대 3개 길이 입력받음
	for (int i = 0; i < 3; i++) {
		scanf("%d", &sides[i]);
	}

	sort_sides(sides, 3);

	// 가장 긴 막대가 나머지 막대 길이 합보다 작은지 확인
	// 크다면
	if (sides[2] >= sides[0] + sides[1]) {
		sides[2] = sides[0] + sides[1] - 1;	// 삼각형의 가장 긴 변(정수)는 나머지 변의 합보다 작음
	}
	printf("%d", sides[0] + sides[1] + sides[2]);

	return 0;
}