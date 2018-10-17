package pojo;
// Generated Oct 17, 2018 2:47:48 PM by Hibernate Tools 4.3.1



/**
 * Review generated by hbm2java
 */
public class Review  implements java.io.Serializable {


     private Integer idReview;
     private Customer customer;
     private Integer rate;
     private String discription;

    public Review() {
    }

	
    public Review(Customer customer) {
        this.customer = customer;
    }
    public Review(Customer customer, Integer rate, String discription) {
       this.customer = customer;
       this.rate = rate;
       this.discription = discription;
    }
   
    public Integer getIdReview() {
        return this.idReview;
    }
    
    public void setIdReview(Integer idReview) {
        this.idReview = idReview;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getRate() {
        return this.rate;
    }
    
    public void setRate(Integer rate) {
        this.rate = rate;
    }
    public String getDiscription() {
        return this.discription;
    }
    
    public void setDiscription(String discription) {
        this.discription = discription;
    }




}


