/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;
import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }


        private ObjectContainer createConnection() {
        ObjectContainer db = null;
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);

            db = Db4oEmbedded.openFile(config, FILENAME);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return db;
        }
    }
    
    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        try {
            conn.store(system);
            conn.commit();
        } finally {
            shutdown(conn);
        }
    }

    public EcoSystem retrieveSystem() {
    ObjectContainer conn = createConnection();
    try {
        if (conn != null) {
            ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
            EcoSystem system;
            if (systems.size() == 0) {
                system = ConfigureASystem.configure();
            } else {
                system = systems.get(systems.size() - 1);
            }
            return system;
        } else {
            // Throw an exception or return a default value
            throw new RuntimeException("Connection is null");
        }
    } finally {
        shutdown(conn);
    }
}
}