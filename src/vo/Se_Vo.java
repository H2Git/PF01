package vo;

public class Se_Vo {

   public Se_Vo(int se_code, String ev_code, String st_code) {
      super();
      this.se_code = se_code;
      this.ev_code = ev_code;
      this.st_code = st_code;
   }

   private int se_code;
   private String ev_code;
   private String st_code;

   public int getSe_code() {
      return se_code;
   }

   public void setSe_code(int se_code) {
      this.se_code = se_code;
   }

   public String getEv_code() {
      return ev_code;
   }

   public void setEv_code(String ev_code) {
      this.ev_code = ev_code;
   }

   public String getSt_code() {
      return st_code;
   }

   public void setSt_code(String st_code) {
      this.st_code = st_code;
   }
}