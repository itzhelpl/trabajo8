/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author Andrea Itzhel
 */
public class Paciente {
//    private String id_paciente;
   // private String apellidoPat;
   // private String apellidoMat;
    private String nombre;
    private String domicilio;
    private String fecha_nac;
    private String tel;
    private String fecha_ingre;
    private String fecha_sub;
//    private String tipo_sangre;
//    private String sector;
//    private String acceso_vas;
//    private String turno;
//    private String horario;
//    private int costo;
    private int no_afil;
    
    public int agregarPaciente(String nombre,String domicilio,
            String fecha_nac, String tel, String fecha_ingre,
            String fecha_sub, int no_afil){
        return 1;
    }
    public boolean validaUsuario(String strUsuario, String strPassword) {
        
        return false;
    }

    public Paciente(String nombre,String domicilio,
            String fecha_nac, String tel, String fecha_ingre,
            String fecha_sub, int no_afil)
//            String id_paciente, String apellidoPat, 
//            String apellidoMat, String nombre, String domicilio,
//            String fecha_nac, String tel, String fecha_ingre, 
//            String fecha_sub, String tipo_sangre, String sector, 
//            String acceso_vas, String turno, String horario, 
//            int costo, int no_afil
    {
//    this.acceso_vas=acceso_vas;
//    this.apellidoMat=apellidoMat;
//    this.apellidoPat=apellidoPat;
//    this.costo=costo;
    this.domicilio=domicilio;
    this.fecha_ingre=fecha_ingre;
    this.fecha_nac=fecha_nac;
    this.fecha_sub=fecha_sub;
//    this.horario=horario;
//    this.id_paciente=id_paciente;
    this.no_afil=no_afil;
    this.nombre=nombre;
//    this.sector=sector;
    this.tel=tel;
//    this.tipo_sangre=tipo_sangre;
//    this.turno=turno;
   
    }

    Paciente(String nombre, String domicilio, String fecha_nac, String no_afil, String tel, String fecha_ingre, String fecha_sub) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public void setIdPaciente(String id_pacinete){
//        this.id_paciente=id_pacinete;
//    }
//    public void setAcceso(String acceso_vas){
//        this.acceso_vas=acceso_vas;
//    }
//    public void setApellidoPat(String apellidoPat){
//        this.apellidoPat=apellidoPat;
//    }
//    public void setApellidoMat(String apellidoMat){
//        this.apellidoMat=apellidoMat;
//    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFechaNaci(String fecha_nac){
        this.fecha_nac=fecha_nac;
    }
    public void setDomiclio(String domicilio){
        this.domicilio=domicilio;
    }
    public void setFechaSub(String fecha_sub){
        this.fecha_sub=fecha_sub;
    }
    public void setFechaIngre(String fecha_ingre){
        this.fecha_ingre=fecha_ingre;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public void setNoAfil(int no_afil){
        this.no_afil=no_afil;
    }
    
//    public String getIdPaciente(){
//        return id_paciente;
//    }
//    public String getAcceso(){
//        return acceso_vas;
//    }
//    public String getApellidoPat(){
//        return apellidoPat;
//    }
//    public String getApellidoMat(){
//        return apellidoMat;
//    }
    public String getNombre(){
        return nombre;
    }
    public String getFechaNac(){
        return fecha_nac;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getFechaIngre(){
        return fecha_ingre;
    }
    public String getFechaSub(){
        return fecha_sub;
    }
    public String getTel(){
        return tel;
    }
    public int getNoAfil(){
        return no_afil;
    }
}
