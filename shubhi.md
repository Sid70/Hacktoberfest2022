###Shubhankshi Saraf
Image-https://imgur.com/gCMm5S4
Location-India
GitHub Link- https://github.com/shubhi0222

#include <iostream> 
using namespace std;

int main(){
    int r1,r2,c1,c2;
    do{
        cout<<"Enter the number of rows and columns for the first matrix: "<<endl;
        cin>>r1>>c1;
        cout<<"Enter the number of rows and columns for the second matrix: "<<endl;
        cin>>r2>>c2;
    }while (c1!=r2);
    
    int a[r1][c1],b[r2][c2],m[r1][c2]={0};
    
    cout<<"Enter the elements of first matrix: "<<endl;
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            cin>>a[i][j];
        }
    }

    cout<<"Enter the elements of second matrix: "<<endl;
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            cin>>b[i][j];
        }
    }

    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k =0;k<c1;k++){
                m[i][j]+=a[i][k]*b[k][j];
            }
        }
    }

    for(int i=0;i<r1;i++){
        for (int j=0;j<c1;j++){
            cout<< a[i][j]<<"  ";
        }
        cout<<endl;
    }
    for(int i=0;i<r2;i++){
        for (int j=0;j<c2;j++){
            cout<< b[i][j]<<"  ";
        }
        cout<<endl;
    }

    cout<<"\n Output matrix :"<<endl;
    for(int i=0;i<r1;i++){
        for (int j=0;j<c2;j++){
            cout<< m[i][j]<<"  ";
        }
        cout<<endl;
    }
    return 0;
}
