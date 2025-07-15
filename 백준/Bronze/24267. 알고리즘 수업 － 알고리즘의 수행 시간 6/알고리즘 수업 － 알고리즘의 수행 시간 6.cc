#include <iostream>
using namespace std;

int main() {
	long long n;
	
	cin >> n;

	// The MenOfPassion algorithm has a time complexity of O(n^3).
	
	cout << (n*(n-1)*(n-2))/6 << '\n' << 3;
	return 0;
}