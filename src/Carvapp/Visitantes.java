/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;
import interfaz.RegistroVisitas;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Usuario
 */
public class Visitantes {
    
    private int VisitanteID;
    private String Nombre;
    private String Apellido;
    private String TipoDocumento; 
    private String Documento; 
    private String Rol;

    /*public Visitantes(int VisitanteID, String Nombre, String Apellido, String TipoDocumento, String Documento, String Rol) {
        this.VisitanteID = VisitanteID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoDocumento = TipoDocumento;
        this.Documento = Documento;
        this.Rol = Rol;
    }*/

   
    public int getVisitanteID() {
        return VisitanteID;
    }

    public void setVisitanteID(int Visitanteid) {
        this.VisitanteID = Visitanteid;
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

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    public void AgregarVisit (JTextField paramNombre,JTextField paramApellido, JComboBox paramTipoDocumento, JTextField paramDocumento, JComboBox paramRol ){
        
        setNombre(paramNombre.getText());
        setApellido(paramApellido.getText());
        setTipoDocumento(paramTipoDocumento.getSelectedItem().toString());
        setDocumento(paramDocumento.getText());
        setRol(paramRol.getSelectedItem().toString());
        
        Conexion objetoconexion = new Conexion();
        String consulta = ("INSERT INTO `biblioteca`.`visitantes`(`Nombre`,`Apellido`,`TipoDocumento`,`Documento`,`Rol`) VALUES (?,?,?,?,?)");
        try {
            CallableStatement cs = objetoconexion.establecerConexion().prepareCall(consulta);
            
            cs.setString(1,getNombre());
            cs.setString(2, getApellido());
            cs.setString(3, getTipoDocumento());
            cs.setString(4,getDocumento());
            cs.setString(5, getRol());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Se inserto correctamente el visitante");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No Se inserto correctamente Error: "+e.toString());
        }
    }
        
        public void mostrarVisitantes(JTable paramTablaVisitantes ){
            Conexion objetoConexion = new Conexion();
            DefaultTableModel modelo = new DefaultTableModel();
            
            TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
            paramTablaVisitantes.setRowSorter(OrdenarTabla);
            String sql="";
            
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("TipoDocumento");
            modelo.addColumn("Documento");
            modelo.addColumn("Rol");
            
            paramTablaVisitantes.setModel (modelo);
            
            
            sql = "select * from visitantes";
            
            String [] datos = new String [6];
            Statement st;
            
            
            try {
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                while (rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    
                    modelo.addRow(datos);                    
                }
                paramTablaVisitantes.setModel(modelo);
            
            
                 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, Error:"+e.toString());
            }
        }
        
           public void Seleccionar (JTable paramTablaVisitantes,JTextField paramVisitanteID,JTextField paramNombre,JTextField paramApellido, JComboBox paramTipoDocumento, JTextField paramDocumento, JComboBox paramRol){
               
               try {
                   int fila = paramTablaVisitantes.getSelectedRow();
                   
                   if (fila >=0) {
                       paramVisitanteID.setText(paramTablaVisitantes.getValueAt(fila,0).toString());
                       paramNombre.setText(paramTablaVisitantes.getValueAt(fila,1).toString());
                       paramApellido.setText(paramTablaVisitantes.getValueAt(fila,2).toString());
                       paramTipoDocumento.setSelectedItem(paramTablaVisitantes.getValueAt(fila,3).toString());
                       paramDocumento.setText(paramTablaVisitantes.getValueAt(fila,4).toString());
                       paramRol.setSelectedItem(paramTablaVisitantes.getValueAt(fila,5).toString());
                   }
                   
                   else{
                                   JOptionPane.showMessageDialog(null,"Fila no seleccionada: ");

                       
                   }
                   
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null,"Erro de selección ERROR: "+e.toString());
               }      
            }
           
           public void ModificarVsitantes (JTextField paramVisitanteID,JTextField paramNombre,JTextField paramApellido, JComboBox paramTipoDocumento, JTextField paramDocumento, JComboBox paramRol) {
               
               setVisitanteID(Integer.parseInt(paramVisitanteID.getText()));
               setNombre(paramNombre.getText());
               setApellido(paramApellido.getText()); 
               setTipoDocumento(paramTipoDocumento.getSelectedItem().toString());
               setDocumento(paramDocumento.getText());
               setRol(paramRol.getSelectedItem().toString());
               
               Conexion objetoConexion = new Conexion();
               
               String consulta = "UPDATE visitantes set visitantes.Nombre = ?, visitantes.Apellido =?,visitantes.TipoDocumento=?,visitantes.Documento=?,visitantes.Rol = ? WHERE visitantes.VisitanteID=?";
               
              
               try {
                    CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
               
               cs.setString(1, getNombre());
               cs.setString(2, getApellido());
               cs.setString(3, getTipoDocumento());
               cs.setString(4, getDocumento());
               cs.setString(5, getRol());
               cs.setInt(6, getVisitanteID());    
                 
               cs.execute();
               
               JOptionPane.showMessageDialog(null,"Modificación exitosa: ");
               
               } catch (SQLException e) {
                   
                   JOptionPane.showMessageDialog(null,"No se modificó ERROR: "+e.toString());
               }
                       
           }
           
           public void EliminarVisitantes (JTextField paramVisitanteID){
               
               setVisitanteID(Integer.parseInt(paramVisitanteID.getText()));
               
               Conexion objetoConexion = new Conexion();
               
               String consulta = "DELETE FROM visitantes where visitantes.VisitanteID=?";
               try {
                   CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
                   cs.setInt(1, getVisitanteID());
                   cs.execute();
                   JOptionPane.showMessageDialog(null,"Se elimino correctamente el Visitante: ");
                   
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null,"No se pudo eliminar ERROR: "+e.toString());
               }
               
               
           }
    
           public void mostrarRegistros(JTable paramTablaRegistroVisitantes ){
            Conexion objetoConexion = new Conexion();
            DefaultTableModel modelo = new DefaultTableModel();
            
            TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
            paramTablaRegistroVisitantes.setRowSorter(OrdenarTabla);
            String sql="";
            
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
           modelo.addColumn("Documento");
            modelo.addColumn("Rol");
            modelo.addColumn("Fecha Entrada");
            modelo.addColumn("Hora Entrada");
            modelo.addColumn("Fecha Salida");
            modelo.addColumn("Hora Salida");
             modelo.addColumn("Estado");
            modelo.addColumn("RegistroID");
            
            paramTablaRegistroVisitantes.setModel (modelo);
            
            
            sql = "SELECT vi.VisitanteID, vi.Nombre, vi.Apellido, vi.documento, vi.Rol, re.FechaEntrada, re.HoraEntrada, re.FechaSalida, re.HoraSalida, re.Estado, re.RegistroID FROM visitantes vi LEFT JOIN  registros re ON vi.VisitanteID = re.VisitanteID";
            
            String [] datos = new String [11];
            Statement st;
            
            
            try {
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                while (rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                    datos[7] = rs.getString(8);
                    datos[8] = rs.getString(9);
                    datos[9] = rs.getString(10);
                    datos[10] = rs.getString(11);
                    modelo.addRow(datos);                    
                }
                paramTablaRegistroVisitantes.setModel(modelo);
            
            
                 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, Error:"+e.toString());
            }
        }
           
  
           public void SeleccionarRegistro(JTable paramTablaRegistroVisitantes, JTextField paramVisitanteID, JTextField paramNombre, JTextField paramDocumento, JTextField paramRegistroID) {
    try {
        int fila = paramTablaRegistroVisitantes.getSelectedRow();

        if (fila >= 0) {
            paramVisitanteID.setText(String.valueOf(paramTablaRegistroVisitantes.getValueAt(fila, 0)));
            paramNombre.setText(String.valueOf(paramTablaRegistroVisitantes.getValueAt(fila, 1)));
            paramDocumento.setText(String.valueOf(paramTablaRegistroVisitantes.getValueAt(fila, 3)));
            paramRegistroID.setText(String.valueOf(paramTablaRegistroVisitantes.getValueAt(fila, 10)));
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de selección: " + e.getMessage());
        e.printStackTrace();
    }
}
           
           
        public void mostrarVisitantesActivos(JTable paramTablaVisitantesActivos){
            Conexion objetoConexion = new Conexion();
            DefaultTableModel modelo = new DefaultTableModel();
            
            TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
            paramTablaVisitantesActivos.setRowSorter(OrdenarTabla);
            String sql="";
            
           
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
           modelo.addColumn("Documento");
            
             modelo.addColumn("Estado");
            
            
            paramTablaVisitantesActivos.setModel (modelo);
            
            
            sql = "SELECT vi.Nombre,vi.Apellido, vi.Documento, re.Estado FROM Visitantes AS vi JOIN Registros AS re ON vi.VisitanteID = re.VisitanteID WHERE re.Estado = 'I'";
            
            String [] datos = new String [11];
            Statement st;
            
            
            try {
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                while (rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                
                    modelo.addRow(datos);                    
                }
                paramTablaVisitantesActivos.setModel(modelo);
            
            
                 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, Error:"+e.toString());
            }
        }
        
     
           
}
        
      
    
    
              

