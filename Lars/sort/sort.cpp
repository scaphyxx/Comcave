#include<iostream>
#include<array>
using namespace std;

void output(array<int, 10> x){
	for(long unsigned int i = 0; i < x.size(); i++){
		cout << x[i] << " ";
	}
}

int main(){

	// variants
	array<int, 10> tab = {99, 11, 55, 44, 22, 88, 66, 33, 77, 44};
	bool finished = false;
	int temp;

	// User Output
	cout << "Algorithm to sort numbers\n";
	cout << "Array:         "; output(tab); cout << endl;

	// Sort as long 
	while(not finished){
		finished = true;

		for(long unsigned int i=0; i < tab.size() - 1 ; i++){
			if(tab[i] > tab[i+1]){
				temp = tab[i];
				tab[i] = tab[i+1];
				tab[i+1] = temp;
				finished = false;
			}
		}
	}

// Final-Output
	cout << "Sorted Output: "; output(tab); cout << endl;
	return 0;
}
