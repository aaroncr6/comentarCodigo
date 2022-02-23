
/**
 * @author: Aarón Cutillas Ruz
 * ACR 23/02/2022
 */
public class EntradaBlogACR{
    /**
     * ACR 23/02/2022
     */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
    /**
     * ACR 23/02/2022
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
	public EntradaBlogACR(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
    /**
     * ACR 23/02/2022
     */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	//devuelve el texto completo de la entrada ACR 23/02/2022
	public String getTexto(){
		return this.texto;
	}
	
	//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor ACR 23/02/2022
	public String devuelveAutor(){
		return this.autor;
	}
	
    /**
     * ACR 23/02/2022
     * @param args
     */
	public static void main(String[] args) {
        /**
         * ACR 23/02/2022
         */
		EntradaBlogACR e1=new EntradaBlogACR (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}