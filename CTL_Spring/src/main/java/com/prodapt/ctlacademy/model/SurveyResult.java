package com.prodapt.ctlacademy.model;



import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id; 


public class SurveyResult {
 
	  @Id
	  public ObjectId _id;
	  
	  public String userID;
	  
	  public String surveyName;
	  
	  public ArrayList topics;
	  
	  public String surveyID;
	  
	  public String get_id() {
			return _id.toHexString();
		}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public ArrayList getTopics() {
		return topics;
	}

	public void setTopics(ArrayList topics) {
		this.topics = topics;
	}

	public String getSurveyID() {
		return surveyID;
	}

	public void setSurveyID(String surveyID) {
		this.surveyID = surveyID;
	}
	  
	  
	  
	  
}
