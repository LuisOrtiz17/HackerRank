package com.apx.estudio;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] player = new Player[6];
		Checker checker = new Checker();
		player[0] = new Player("david", 100);
		player[1] = new Player("amy", 100);
		player[2] = new Player("heraldo", 50);
		player[3] = new Player("aakansha", 75);
		player[4] = new Player("aleksa", 150);
		player[5] = new Player("carlos", 50);
		
		Arrays.sort(player, checker);
		for(int t=0; t<player.length;t++) {
			System.out.println(player[t].name + " " + player[t].score);
		}

	}

}
