package IntroAlaPrograma.POO.Interface;



public class main {

    static CocheCRUD cocheCRUD= new CocheCRUDImpl();
    /**
     * @param args
     */
    public static void main(String[] args) {
      cocheCRUD.save();
      cocheCRUD.findAll();
      cocheCRUD.delete();
    }
}
