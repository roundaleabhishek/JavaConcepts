package com.learn.designpattern.creational.builder;

public class Email {
	
	private final String fromAddress;
	private final String toAddress;
	private final String subject;
	private final String description;
	
	
	
	
	
	public String getFromAddress() {
		return fromAddress;
	}




	public String getToAddress() {
		return toAddress;
	}




	public String getSubject() {
		return subject;
	}




	public String getDescription() {
		return description;
	}



// very imp constructor please note
	public Email(Builder builder) {
		super();
		this.fromAddress = builder.fromAddress;
		this.toAddress = builder.toAddress;
		this.subject = builder.subject;
		this.description = builder.description;
	}
	
	




	@Override
	public String toString() {
		return "Email [fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", subject=" + subject
				+ ", description=" + description + "]";
	}






	// public static inner class
	// this can have only madatory required fields for configuration
	public static class Builder
	{
		private  String fromAddress;
		private  String toAddress;
		private  String subject;
		private  String description;
		
		public Builder setFromAddress(String fromAddress)
		{
			this.fromAddress = fromAddress;
			return this;
		}
		
		public Builder setToAddress(String toAddress)
		{
			this.toAddress = toAddress;
			return this;
		}
		
		
		public Email build()
		{
			return new Email(this);
		}
		
		
	}
	
	
	

}
