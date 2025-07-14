#include <iostream>
using namespace std;

int main() {
	long long n;
	cin >> n;

	// MenOfPassion 알고리즘은 O(n^2)의 시간 복잡도를 가진다
	cout << n*n << '\n' << 2;
	return 0;
}