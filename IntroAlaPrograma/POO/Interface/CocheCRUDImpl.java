package IntroAlaPrograma.POO.Interface;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("es metodo save");
        
    }

    @Override
    public void findAll() {
        System.out.println("es metodo findall");
        
    }

    @Override
    public void delete() {
        System.out.println("es metodo delete");
        
    }
    
}
