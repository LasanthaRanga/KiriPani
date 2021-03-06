package pojo;
// Generated Oct 17, 2018 2:47:48 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Chat generated by hbm2java
 */
public class Chat  implements java.io.Serializable {


     private Integer idChat;
     private Customer customerByChatTo;
     private Customer customerByChatFrom;
     private Request request;
     private Date dayTime;
     private String message;
     private Integer chatStatus;

    public Chat() {
    }

	
    public Chat(Customer customerByChatTo, Customer customerByChatFrom, Request request) {
        this.customerByChatTo = customerByChatTo;
        this.customerByChatFrom = customerByChatFrom;
        this.request = request;
    }
    public Chat(Customer customerByChatTo, Customer customerByChatFrom, Request request, Date dayTime, String message, Integer chatStatus) {
       this.customerByChatTo = customerByChatTo;
       this.customerByChatFrom = customerByChatFrom;
       this.request = request;
       this.dayTime = dayTime;
       this.message = message;
       this.chatStatus = chatStatus;
    }
   
    public Integer getIdChat() {
        return this.idChat;
    }
    
    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }
    public Customer getCustomerByChatTo() {
        return this.customerByChatTo;
    }
    
    public void setCustomerByChatTo(Customer customerByChatTo) {
        this.customerByChatTo = customerByChatTo;
    }
    public Customer getCustomerByChatFrom() {
        return this.customerByChatFrom;
    }
    
    public void setCustomerByChatFrom(Customer customerByChatFrom) {
        this.customerByChatFrom = customerByChatFrom;
    }
    public Request getRequest() {
        return this.request;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }
    public Date getDayTime() {
        return this.dayTime;
    }
    
    public void setDayTime(Date dayTime) {
        this.dayTime = dayTime;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getChatStatus() {
        return this.chatStatus;
    }
    
    public void setChatStatus(Integer chatStatus) {
        this.chatStatus = chatStatus;
    }




}


