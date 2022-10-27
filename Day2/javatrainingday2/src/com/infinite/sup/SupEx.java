package com.infinite.sup;

import com.infinite.inh.First;
import com.infinite.inh.First.Second;

class First {
		public void show(){
			System.out.println("show from class first");
		}
	class Second extends First{
		public void show(){
			System.out.println("show from class Second");

		}

	}
	public class SupEx { 
		
		public static void main (String[] args) {
			Second obj =new Second();
					obj.show();
		}

		}

	}


}
