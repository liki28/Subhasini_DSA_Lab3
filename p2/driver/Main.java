package com.gl.p2.driver;

import com.gl.p2.service.FindSumPair;
import com.gl.p2.service.Node;

public class Main {

	public static void main(String[] args) {
		Node root=null;
		
		FindSumPair pair=new FindSumPair();
		root=pair.insert(root,40);
		root=pair.insert(root,20);
		root=pair.insert(root,60);
		root=pair.insert(root,10);
		root=pair.insert(root,30);
		root=pair.insert(root,80);
		root=pair.insert(root,70);
		
		int sum=120;
		pair.findPairWithGivenSum(root,sum);

	}

}
