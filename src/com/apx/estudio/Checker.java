package com.apx.estudio;

import java.util.Comparator;

public class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		if(p1.score == p2.score) {
			return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
		}else {
			return p2.score - p1.score;
		}
		
	}

}
