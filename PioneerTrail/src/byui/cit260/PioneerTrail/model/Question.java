/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.PioneerTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author WagnerFilgueiras
 */
public class Question implements Serializable{
    
    private String questionTest;
    private String answerOne;
    private String answerTwo;
    private String answerFour;
    private String correctAnswer;
    

    public Question() {
    }
    
    
    public String getQuestionTest() {
        return questionTest;
    }

    public void setQuestionTest(String questionTest) {
        this.questionTest = questionTest;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.questionTest);
        hash = 53 * hash + Objects.hashCode(this.answerOne);
        hash = 53 * hash + Objects.hashCode(this.answerTwo);
        hash = 53 * hash + Objects.hashCode(this.answerFour);
        hash = 53 * hash + Objects.hashCode(this.correctAnswer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.questionTest, other.questionTest)) {
            return false;
        }
        if (!Objects.equals(this.answerOne, other.answerOne)) {
            return false;
        }
        if (!Objects.equals(this.answerTwo, other.answerTwo)) {
            return false;
        }
        if (!Objects.equals(this.answerFour, other.answerFour)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionTest=" + questionTest + ", answerOne=" + answerOne + ", answerTwo=" + answerTwo + ", answerFour=" + answerFour + ", correctAnswer=" + correctAnswer + ", correctAnswer2=" + '}';
    }
    
    
  
}

