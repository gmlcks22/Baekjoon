#include <iostream>

int main() {
	int aOne, aZero;
	int c, nZero;

	std::cin >> aOne >> aZero;
	std::cin >> c;
	std::cin >> nZero;

	//1. a1 <= c
	if (aOne > c) {
		std::cout << 0;
		return 0;
	}

	//2. a1*n+a0 <= c*n0
	if (aOne * nZero + aZero <= c * nZero) {
		std::cout << 1;
	}
	else {
		std::cout<<0;
	}

	return 0;
}