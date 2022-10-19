/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Naritaa
 */
public class DataHelp {
    
    private String typeHelp;
    private String statement;

    public DataHelp(String typeHelp, String statement) {
        this.typeHelp = typeHelp;
        this.statement = statement;
    }

    public String getTypeHelp() {
        return typeHelp;
    }

    public void setTypeHelp(String typeHelp) {
        this.typeHelp = typeHelp;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "Data{" + "typeHelp=" + typeHelp + ", statement=" + statement + '}';
    }
    
    
    
}
