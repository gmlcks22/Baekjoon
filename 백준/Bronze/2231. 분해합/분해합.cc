#include <iostream>
#include <vector>

int main() {
	int n;

	std::cin >> n;

	for (int i = 1; i < n; i++) {
		int sum = i;	// 분해합의 자기 자신
		int temp = i;	// 나머지

		// 각 자리 숫자의 합을 계산
		while (temp > 0) {
			sum += temp % 10;	// 끝자리 숫자를 sum에 더함
			temp /= 10;	// temp를 10으로 나누어 다음 자리로 이동
		}

		if (sum == n) {	// i가 작은 수부터 커지므로 처음으로 조건에 맞는 sum이 최솟값이 됨
			std::cout << i << std::endl;
			return 0;
		}
	}

	std::cout << 0 << std::endl;

	return 0;
}