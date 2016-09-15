/*
    Module dependencies
*/

// Context
package easytarget.libs;

/**
 *
 * @author jp
 */
public class driver {
    
    /*
        Players
    */
    public void findPlayers(){}
    public void findOnePlayer(String user){}
    public void pushOnePlayer(String user, String name){}
    public void updateOnePlayer(String name){}
    public void deleteOnePlayer(String user){}
    
    /*
        Games
    */
    public void findGames(String user){}
    public void findOneGame(String user, int id){}
    public void pushOneGame(String user, String score){}
    public void updateOneGame(String user, int id, String score) {}
    public void deleteOneGame(String user, int id) {}
    
}
