/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Narita
 */
public class DataManager {
//    public void addNewVoter(Voter voter) throws SQLException {
//		String query = "INSERT INTO tblvoters (IDVoter, VUsername ,VFirstName, VSurname, VClass, VPassword) "
//			+ "VALUES ('" + voter.getID() + "','" + voter.getUsername() + "','" + voter.getName() + "','"
//			+ voter.getSurname() + "','" + voter.getClassName() + "','" + voter.getPassword() + "');";
//		SystemManager.db.update(query);
//	}
    //example
    private DataHelp dt;
    
    public DataManager(){
        //dt = new DataHelp(typeHelp, statement);
    }
    
    public void addAnonymous(String type,String statement){
        DB db = new DB();
        String query = "Insert into Anonymoustbl Value(TypeOfHelp, UserStatement)" + "";
        db.update(query);

    }
    public void addHelp(String type,String statement){
        DB db = new DB();
        String query = "Insert into Helptbl Value(TypeOfHelp, UserStatement)" + "";
        db.update(query);

    }
    
    
    
    
}
