#include<bits/stdc++.h>
using namespace std;
int solve(vector<vector<int>> adj,int src,int dest)
{
    int n=adj.size();
    vector<int> visited(n,0);
    queue<pair<int,int>> q;
    if(src==dest)
    {
        return 0;
    }
    visited[src]=0;
    q.push({src,0});
    while(!q.empty())
    {
        pair<int,int> p=q.front();
        q.pop();
        int a=p.first,b=p.second;
        cout<<a<<" "<<b<<endl;
        for(auto l:adj[a])
        {
            if(!visited[l])
            {
                visited[l]=1;
                if(l==dest)
                {
                    return b+1;
                }
                else
                {
                    q.push({l,b+1});
                }
            }
        }
    }
    return -1;
}
vector<int> split_string(string s)
{
    stringstream ss(s);
    string word;
    vector<int> v;
    while (ss >> word) {
        v.push_back(stoi(word));
    }
    return v;
}
int main()
{
    int n;
    cin>>n;
    string s;
    getline(cin,s);
    vector<vector<int>> adj;
    for(int i=0;i<n;i++)
    {
        getline(cin,s);
        vector<int> v=split_string(s);
        adj.push_back(v);
    }
    for(auto &x:adj)
    {
        for(auto &y:x)
        {
            y--;
            //cout<<y<<" ";
           
        }//cout<<"\n";
    }
    
    int a,b;
   
    cin>>a>>b;
    a--;
    b--;
    //cout<<a<<" "<<b<<endl;
    cout<<solve(adj,a,b)<<endl;
}
