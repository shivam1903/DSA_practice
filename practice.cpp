// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;



int calculator(int inp1, int inp2, int inp3, int inp4, int inp5){
    int apple_total = inp1 * inp3;
    int mango_total = inp2 * inp4;
    int balance = inp5 - (apple_total + mango_total);
    return balance;
}


bool isPrime(int n){
    if(n==1){
        cout<<("n is unique");
        return false;
    }
    
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

void checkPrime(int startpoint, int endpoint){
    
    // for(int i=startpoint;i<=endpoint;i++){
    //     bool n=isPrime(i);
    //     if(n==true){
    //         cout<<i<<"\n";     
    //  }
    
    while (startpoint <= endpoint){
        bool n = isPrime(startpoint);
        if(n==true){
            cout<<startpoint<<"\n";
        }
        startpoint++;
    }
}


int main() {
    // Write C++ code here
    std::cout << "Hello world!";
    // int ans = calculator(2, 1, 50, 30, 200);
    // std::cout << ans << "\n";
    // std::cout << "This was the output";
    checkPrime(1,100);
    return 0;
}


// input 1 - Apple Amount
// input 2 - Mango Amount
// input 3 - Apple price per kg
// input 4 - Mango price per kg
// input 5 - Total amount given

