package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

//finished at 13:41
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
		
	}
	
	public int score(){
		int score = 0;
		
		for (int i = 0; i < frames.size(); i++) {
			if (frames.get(i).isSpare() && !frames.get(i).isLastFrame()){
				score += frames.get(i + 1).getFirstThrow();
			}
			if (frames.get(i).isStrike() && !frames.get(i).isLastFrame()){
				score += frames.get(i + 1).getFirstThrow() + frames.get(i + 1).getSecondThrow();
			}
			score += frames.get(i).score();
		}
		if(isNextFrameBonus()){
			score += bonus.getFirstThrow();
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		if(frames.get(frames.size() - 1).isSpare() || frames.get(frames.size() - 1).isStrike()){
			return true;
		}else{
			return false;	
		}
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public Frame getBonus() {
		return bonus;
	}

	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
}
