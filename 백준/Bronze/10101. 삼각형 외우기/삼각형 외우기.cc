#include <stdio.h>

int main(void) {
	int angles[3];
	int angles_sum = 0;

	for (int i = 0; i < 3; i++) {
		scanf("%d", &angles[i]);
		angles_sum += angles[i];
	}

	// 삼각형 확인
	if (angles_sum != 180) {
		printf("Error");
		return 0;
	} else {
		// 정삼각형 확인
		if (angles[0] == angles[1] && angles[1] == angles[2]) {
			printf("Equilateral");
			return 0;
		}
		// 이등변삼각형 확인
		else if (angles[0] == angles[1]
			|| angles[1] == angles[2]
			|| angles[0] == angles[2]) {
			printf("Isosceles");
			return 0;
		}
		// 삼각형
		else {
			printf("Scalene");
			return 0;
		}
	}
}