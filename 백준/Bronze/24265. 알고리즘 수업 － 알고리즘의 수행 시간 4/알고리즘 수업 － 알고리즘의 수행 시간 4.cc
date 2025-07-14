#include <iostream>
using namespace std;

int main() {
	long long n;
	cin >> n;

	// MenOfPassion 알고리즘은 O(n^2)의 시간 복잡도를 가진다
	/*
	when 
	i = 1, j = 2 to n		-> n-1 회
	i = 2, j = 3 to n		-> n-2 회
	i = 3, j = 4 to n		-> n-3 회
	...
	i = n - 1, j = n to n	-> 1 회

	1+2+3+...+n-1 = n(n-1)/2 (등차수열의 합)
	*/
	cout << n * (n - 1) / 2 << '\n' << 2;
	return 0;
}