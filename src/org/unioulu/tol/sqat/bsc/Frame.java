package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		int frameScore = 0;
		if(isStrike()){
			frameScore = 10;
		}else{
			frameScore = firstThrow + secondThrow;
		}
		return frameScore;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
			return true;
		else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(!isStrike()){
		if(firstThrow + secondThrow >= 10){
			return true;
		}else{
			return false;
		}
		} return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}
	
	
}
