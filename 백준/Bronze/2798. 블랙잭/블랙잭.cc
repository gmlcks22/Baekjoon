#include <iostream>
#include <vector>

int main() {
	int n, m;

	std::cin >> n >> m;	// 딜러가 제시한 카드 개수 n, 플레이어가 고른 카드 3장의 합이 m보다 작으면서 가장 근접함

	std::vector<int> cards;
	int vecBuffer;

	// vector cards에 제시된 카드 모두 push
	for (int i = 0; i < n; i++) {
		std::cin >> vecBuffer;
		cards.push_back(vecBuffer);
	}

	int maxSum = 0; // 현재까지의 최대 합계
	int sum = 0; // 단순 합계


	for (int i = 0; i < n - 2; i++) {
		for (int j = i + 1; j < n - 1; j++) {
			for (int k = j + 1; k < n; k++) {
				sum = cards[i] + cards[j] + cards[k];

				if (sum == m) {
					std::cout << sum;
					return 0;
				}
				else if (sum < m && sum > maxSum)
					maxSum = sum;
			}
		}
	}

	std::cout << maxSum;

	return 0;
}