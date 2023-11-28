/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;
import interfaz.AgregarVisitante;
import interfaz.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Usuarios {
    
   
    
    
    private int Usuarioid;
    private String Nombre;
    private String Apellido;   
    private String Usuario;   
    private String Contrasena;   

   /* public Usuarios(int Usuarioid, String Nombre, String Apellido, String Usuario, String Contrasena) {
        this.Usuarioid = Usuarioid;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }*/

    public int getUsuarioid() {
        return Usuarioid;
    }

    public void setUsuarioid(int Usuarioid) {
        this.Usuarioid = Usuarioid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
        public void validarUsuario (JTextField Usuario, JPasswordField Contrasena  ){
    
            try {
              
                ResultSet rs=null;
                PreparedStatement ps = null;
                
                Conexion objetoconexion = new Conexion();
                String consulta = "select * from usuarios  where Usuarios.Usuario = (?) and Usuarios.Contrasena = (?)";
                ps = objetoconexion.establecerConexion().prepareStatement(consulta);
                
                String Contra = String.valueOf(Contrasena.getPassword());
                
                ps.setString(1, Usuario.getText());
                ps.setString(2, Contra);
                
                rs =ps.executeQuery();
                
                if(rs.next()){
                    
                    Menu menuPrincipal = new Menu();
                    menuPrincipal.setVisible(true);
  
                }
                      else
                    {
                            JOptionPane.showMessageDialog(null,"El Usuario es Incorrecto Vuelva a intentar");
                            
                            }
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null,"ERROR"+e.toString());
            }
            
            }
        
       

    public void InsertarEntrada(JTextField VisitanteIDReg) {
    try {
        Conexion objetoconexion = new Conexion();
        String INSERT_II = "INSERT INTO registros (VisitanteID, FechaEntrada, HoraEntrada, Estado, ReservaID) VALUES (?, CURRENT_DATE(), CURTIME(), 'I', NULL)";

        // Usar try-with-resources para asegurar que los recursos se cierren correctamente
        try (PreparedStatement ps = objetoconexion.establecerConexion().prepareStatement(INSERT_II)) {
            // Obtener el texto del JTextField y establecerlo en el PreparedStatement
            ps.setString(1, VisitanteIDReg.getText());

            // Ejecutar la consulta de inserción
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se insertó correctamente la entrada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar la entrada.");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error al insertar la entrada: " + e.toString());
    }
}
        
        
          public void InsertarSalida(JTextField RegistroID) {
    try {
        Conexion objetoconexion = new Conexion();
        String INSERT_II = "Update registros  SET FechaSalida = CURRENT_DATE(), HoraSalida = CURTIME(), Estado= 'S' WHERE RegistroID = ?";

        // Usar try-with-resources para asegurar que los recursos se cierren correctamente
        try (PreparedStatement ps = objetoconexion.establecerConexion().prepareStatement(INSERT_II)) {
            // Obtener el texto del JTextField y establecerlo en el PreparedStatement
            ps.setString(1, RegistroID.getText());

            // Ejecutar la consulta de inserción
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se insertó correctamente la Salida.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar la Salida.");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error al insertar la entrada: " + e.toString());
    }
}
 
}
