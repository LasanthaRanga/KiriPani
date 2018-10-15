package pojo;
// Generated Oct 15, 2018 12:51:14 PM by Hibernate Tools 4.3.1



/**
 * Cusupload generated by hbm2java
 */
public class Cusupload  implements java.io.Serializable {


     private Integer idCusUpload;
     private Customer customer;
     private String cusUpPath;
     private String cusUpType;
     private Integer cusUpStatus;

    public Cusupload() {
    }

	
    public Cusupload(Customer customer) {
        this.customer = customer;
    }
    public Cusupload(Customer customer, String cusUpPath, String cusUpType, Integer cusUpStatus) {
       this.customer = customer;
       this.cusUpPath = cusUpPath;
       this.cusUpType = cusUpType;
       this.cusUpStatus = cusUpStatus;
    }
   
    public Integer getIdCusUpload() {
        return this.idCusUpload;
    }
    
    public void setIdCusUpload(Integer idCusUpload) {
        this.idCusUpload = idCusUpload;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getCusUpPath() {
        return this.cusUpPath;
    }
    
    public void setCusUpPath(String cusUpPath) {
        this.cusUpPath = cusUpPath;
    }
    public String getCusUpType() {
        return this.cusUpType;
    }
    
    public void setCusUpType(String cusUpType) {
        this.cusUpType = cusUpType;
    }
    public Integer getCusUpStatus() {
        return this.cusUpStatus;
    }
    
    public void setCusUpStatus(Integer cusUpStatus) {
        this.cusUpStatus = cusUpStatus;
    }




}


