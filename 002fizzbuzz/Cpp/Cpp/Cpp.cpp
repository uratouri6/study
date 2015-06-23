// Cpp.cpp : コンソール アプリケーションのエントリ ポイントを定義します。
//

#include "stdafx.h"
#include <iostream>

using namespace std;

void fizzbuzz(int n) {

	for (int i = 1; i <= n; i++)
	{
		if (i % 3 == 0 && i % 5 == 0)
			cout << "FizzBuzz" << endl;
		else if (i % 3 == 0)
			cout << "Fizz" << endl;
		else if (i % 5 == 0)
			cout << "Buzz" << endl;
		else
			cout << i << endl;
	}
}


int main()
{
	fizzbuzz(100);

	return 0;
}


