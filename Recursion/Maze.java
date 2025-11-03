package Recursion;

import java.util.*;

import java.util.ArrayList;


public class Maze {
	public static void main(String[] args) {
	System.out.println(count(3,3));
	//path("", 3,3);
		System.out.println(pathRetDiagnol("", 3, 3));
	

	boolean[][] board = {
		{true, true, true},
		{true, false, true},
		{true, true, true}
	};

	pathRestrictions("", board, 0, 0);
}

	static int count(int r, int c){
		if(r == 1|| c == 1) {
			return 1;
		}
		int left = count(r-1, c);
		int right = count(r, c-1);
		return left + right;     
	}

    // printing path also

    static ArrayList<String> pathRetDiagnol(String p, int r, int c){
    	if(r == 1 && c == 1){
    		ArrayList<String> list = new ArrayList<>();
    		list.add(p);
    		return list;
    	}
    	  ArrayList<String> list = new ArrayList<>();

    	if(r > 1) {
    		pathRetDiagnol(p + 'D', r-1, c);
    	}
    	if(c > 1) {
    		pathRetDiagnol(p + 'R', r, c-1);
    	}
    

        // printing diagnolly also

		if(r > 1 && c > 1){
			list.addAll(pathRetDiagnol(p + 'D', r-1, c-1));
		}
		if(r > 1) {
			list.addAll(pathRetDiagnol(p + 'V', r-1, c));
		}
		if(c > 1) {
			list.addAll(pathRetDiagnol(p + 'H', r, c-1));
		}
		return list;
	}

    // if maze have obstacles
	static void pathRestrictions(String p, boolean[] [] maze, int r, int c){
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}

		if(!maze[r][c]){
			return;
		}

		if( r < maze.length - 1) {
			pathRestrictions(p + 'D', maze, r+1, c);
		}

		if(c < maze.length - 1) {
			pathRestrictions(p + 'R', maze, r, c+1);
		}
	}


}