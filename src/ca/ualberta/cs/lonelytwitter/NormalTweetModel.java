package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class NormalTweetModel extends LonelyTweetModel
{

	public NormalTweetModel(String text, Date timestamp)
	{

		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	public NormalTweetModel(String text)
	{

		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setImportant(boolean important) throws Exception {
		if(important){
			throw new IllegalArgumentException();
		}
		this.important = important;
	}

	@Override
	public void setText(String text)
	{

		// TODO Auto-generated method stub
		
	}
}