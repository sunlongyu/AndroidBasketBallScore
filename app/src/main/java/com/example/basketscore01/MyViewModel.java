package com.example.basketscore01;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> scoreA;
    private MutableLiveData<Integer> scoreB;
    private Integer aBack;
    private Integer bBack;

    public MutableLiveData<Integer> getScoreA() {
        if (scoreA == null) {
            scoreA = new MutableLiveData<>();
            scoreA.setValue(0);
        }
        return scoreA;
    }

    public MutableLiveData<Integer> getScoreB() {
        if (scoreB == null) {
            scoreB = new MutableLiveData<>();
            scoreB.setValue(0);
        }
        return scoreB;
    }

    public void addA(int n) {
        aBack = scoreA.getValue();
        bBack = scoreB.getValue();
        scoreA.setValue(scoreA.getValue() + n);
    }

    public void addB(int n) {
        aBack = scoreA.getValue();
        bBack = scoreB.getValue();
        scoreB.setValue(scoreB.getValue() + n);
    }

    public void reset() {
        aBack = scoreA.getValue();
        bBack = scoreB.getValue();
        scoreA.setValue(0);
        scoreB.setValue(0);
    }

    public void undo() {
        scoreA.setValue(aBack);
        scoreB.setValue(bBack);
    }
}
