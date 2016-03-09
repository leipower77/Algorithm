package com.learning.algo.interview;

public class JessifCircle {

	public int value;
	public JessifCircle next;
	
	public static int findLastNum(JessifCircle[] js, int N, int M){
		int count = N;
		int index = 0;
		JessifCircle cj = null;
		JessifCircle lj = null;
			for(JessifCircle j = js[0]; ; j = j.next){
				if(count == 1){
					cj = j;
					break;
				}
				index  = (index + 1)%M;
				if(index == 0){
					cj = j;
					lj.next = cj.next; 
					count--;
					System.out.println("编号：" + cj.value);
				}
				lj = j;
				
			}
			return cj.value;
			
		}
		
	
	
	public static int fun(int m,int k,int i){
		 
	    if(i==1)
	        return (m+k-1)%m;
	    else
	        return (fun(m-1,k,i-1)+k)%m;
	 
	}
	public static void main(String[] args) {
		int N = 20;
		int M = 5;
		JessifCircle js[] = new JessifCircle[20];
		JessifCircle lj = null;
		for(int i = 0 ; i < N; i++){
			js[i] = new JessifCircle();
			js[i].value = i+1;
			
			if(i != 0){
				lj.next = js[i];
			if(i == (N -1))
				js[i].next = js[0];				
			}
				
			
			lj = js[i];
		}
		
//		int count = 0;
//		for(JessifCircle j = js[0]; count < 23; j = j.next){
//			System.out.println(j.value);
//			count++;
//			
//		} 
		int n = findLastNum(js, 20, 5);
		System.out.println(n);
		
		System.out.println("*******************");
		for(int i=1;i<=20;i++)
			System.out.println("第"+ i + "次出环： " + (fun(20,5,i) + 1) );
	        
	   
	}
}
