package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		if(frames.size() <= 10){
			frames.add(frame);
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score = 0;
		
		for (int i = 0; i < frames.size(); i++) {
			if (frames.get(i).isSpare()){
				score += frames.get(i + 1).getFirstThrow();
			}
			if (frames.get(i).isStrike()){
				score += frames.get(i + 1).getFirstThrow() + frames.get(i + 1).getSecondThrow();
			}
			score += frames.get(i).score();
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}

	public List<Frame> getFrames() {
		return frames;
	}
}
